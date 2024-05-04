package com.was;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class MongoUserDAO implements UserDAO {

    MongoClient mongoClient = MongoClientUtil.getMongoClient();
    MongoDatabase database = mongoClient.getDatabase("WAS");
    static MongoCollection<Document> users = database.getCollection("users");

    @Override
    public void addUser(User user) {
        int userId = getNextUserId();  // Ensure this method is called to fetch the next user ID
        user.setUserId(userId);  // Set the user ID in the User object

        //String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        Document newUser = new Document("user_id", userId)
                .append("username", user.getUserName())
                //.append("password", hashedPassword)
                .append("password", user.getPassword())
                .append("role", user.getRole());
        users.insertOne(newUser);
    }

    private int getNextUserId() {
        MongoCollection<Document> counters = database.getCollection("counters");
        Document counter = counters.findOneAndUpdate(
                Filters.eq("user_id", "userid"),
                Updates.inc("seq", 1),
                new FindOneAndUpdateOptions().upsert(true).returnDocument(ReturnDocument.AFTER)
        );
        //default to 1 if counter is not found
        assert counter != null;
        return counter.getInteger("seq", 1);
    }


    @Override
    public User getUser(String id) {
// Create a filter to find the user by their ID
        /*
        Bson filter = Filters.eq("user_id", Integer.parseInt(id));

        // Find the user in the database
        Document userDocument = users.find(filter).first();

        // Check if the user exists
        if (userDocument != null) {
            // Retrieve user details from the document
            int userId = userDocument.getInteger("user_id");
            String username = userDocument.getString("username");
            String password = userDocument.getString("password");
            String role = userDocument.getString("role");

            // Create and return a User object
            return new User(userId, username, password, role);
        } else {
            // User not found in the database
            System.out.println("Error: User not found.");
            return null;
        } */

        return null;
    }

    public String authenticateUser(String username, String password) {

        //iterate through the Mongo Database and look for if the inputted user is within the database
        Document userDoc = users.find(Filters.eq("username", username)).first();

        if (userDoc != null) {
            // If user is found, get the password from the user and compare it with the inputted password
            String storedPassword = userDoc.getString("password");
            if (password.equals(storedPassword)) {
                // Authentication successful, retrieve user information from the database
                // if passwords match, get the role of the user and return it as the function return value
                String role = userDoc.getString("role");
                return role;
            } else {
                //else if user is found but passwords don't match, return this string as value
                return "IncorrectPassword";
            }
        } //else if there is No user with the inputted username, return this string:
        return "UserNotFound";
    }



    @Override
    public void updateUser(User user) {
        // Implementation here...
    }

    @Override
    public boolean deleteUser(String username) {

// Find the user in the database by username
        Document userDoc = users.find(Filters.eq("username", username)).first();

        // Check if the user exists
        if (userDoc != null) {
            // User found, delete the user
            users.deleteOne(Filters.eq("username", username));
            return true; // Deletion successful
        } else {
            // User not found, return false indicating deletion failure
            return false;
        }
    }}
