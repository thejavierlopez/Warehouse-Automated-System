
public class WASMain {
    public static void main(String[] args) {

        // Creating the DAO implementations
        UserDAO userDAO = new MongoUserDAO();
        ItemDAO itemDAO = new MongoItemDAO();

        // Creating the service instances
        UserService userService = new UserService(userDAO);
        ItemService itemService = new ItemService(itemDAO);

        // Create a new User and add it using UserService
        User newUser = new User("javier", "superSecurePassword", "admin");
        userService.addUser(newUser);  // Add the user

        // Create a new Item and add it using ItemService
        Item newItem = new Item("box", 10); // Assuming Item constructor takes name and quantity, ID is generated
        itemService.addItem(newItem);

        System.out.println("User and item added successfully.");




        MongoClientUtil.closeClient();

        return(0);
    }
}
