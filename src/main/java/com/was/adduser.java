package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adduser extends JFrame{
    private JPanel addUmain;
    private JLabel title;
    private JTextField usernameTextField;
    private JTextField passwordField;
    private JCheckBox isAdminCheckBox;
    private JLabel UserNameT;
    private JLabel RoleT;
    private JLabel PasswordT;
    private JButton addUserButton;
    private JButton exitButton;

    public adduser() {

        this.setTitle("Add user Frame");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(addUmain);
        this.setVisible(true);
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Get user input from text fields or other components
                String username = usernameTextField.getText(); //Extract info. from JTextField named usernameTextField
                String password = passwordField.getText(); //Extract info. from JPasswordField named passwordField
                boolean isAdmin = isAdminCheckBox.isSelected(); //Extract info. from JCheckBox named isAdminCheckBox

                // Check if the user is an admin
                if (isAdmin) {
                    // If yes, create a MongoUserDAO object
                    MongoUserDAO userDAO = new MongoUserDAO();

                    // Create a user object with admin role
                    User user = new User(username, password, "admin");

                    // Add the user to the database using addUser function
                    userDAO.addUser(user);
                } else {
                    // If not admin, create a MongoUserDAO object
                    MongoUserDAO userDAO = new MongoUserDAO();

                    // Create a user object with user role
                    User user = new User(username, password, "user");

                    // Add the user to the database using addUser function
                    userDAO.addUser(user);
                }


                /*
                 grab the user input into strings
                 if the admin part is yes:

                 if(yes) {
                    create a mongouserDao object
                    create a user object, passing in the username, password, and admin role
                    use addUser function to add to database
                 }

                 else if (not admin) {
                    create a mongouserdao
                    craete a user object, passing in the username, password, and user role
                    use adduser function to add to database.
                 }



                 */
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("adduser");
        frame.setContentPane(new adduser().addUmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
