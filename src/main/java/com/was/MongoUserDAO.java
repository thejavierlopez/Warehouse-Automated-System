package com.was;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import javax.swing.*;

public class MongoUserDAO implements UserDAO {

    MongoClient mongoClient = MongoClientUtil.getMongoClient();
    MongoDatabase database = mongoClient.getDatabase("WAS");
    MongoCollection<Document> users = database.getCollection("users");

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
        // Implementation here...
        return null;
    }

    public String authenticateUser2(String username, String password) {
        Document userDoc = users.find(Filters.eq("username", username)).first();

        if (userDoc != null) {
            String storedPassword = userDoc.getString("password");
            if (password.equals(storedPassword)) {
                // Authentication successful, retrieve user information from the database
                String role = userDoc.getString("role");
                return role;
            } else {
                return "IncorrectPassword";
            }
        } //else :
        return "UserNotFound";
    }

    @Override
    public void updateUser(User user) {
        // Implementation here...
    }

    @Override
    public void deleteUser(String id) {
        // Implementation here...

    }

}
