package com.was;
public class WASMain {

    public static void main(String[] args) {

        // Creating the DAO implementations
//        UserDAO userDAO = new MongoUserDAO();
//        ItemDAO itemDAO = new MongoItemDAO();
//
//        // Creating the service instances
//        UserService userService = new UserService(userDAO);
//        ItemService itemService = new ItemService(itemDAO);
//
//        // Create a new User and add it using UserService
//        User newUser = new User("Jake", "superSecurePassword", "NotAdmin");
//        userService.addUser(newUser);  // Add the user
//        System.out.println("User added successfully.\n");
//        System.out.println(newUser);
//
//        // Create a new Item and add it using ItemService
//        Item newItem = new Item("box", 10); // Assuming Item constructor takes name and quantity, ID is generated
//        itemService.addItem(newItem);
//        System.out.println("Item added successfully.\n");
//
//
//
//        MongoClientUtil.closeClient();


        // Test Runs For Guis:

//        LoginFrame ex = new LoginFrame();
//        ex.setVisible(true);

//        AdminFrame ex = new AdminFrame();
//        ex.setVisible(true);

        addItemPanel ex = new addItemPanel ();
        ex.setVisible(true);

//        NonAdminFrame ex = new NonAdminFrame();
//        ex.setVisible(true);

//        ListAllItems ex = new ListAllItems();
//        ex.setVisible(true);



    }
}
