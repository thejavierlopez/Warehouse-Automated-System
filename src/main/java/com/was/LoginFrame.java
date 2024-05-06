package com.was;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginFrame extends JFrame {

    // Just each component created from/to the GUI
    private JPanel LoginPanel;
    private JLabel LoginTitle;
    private JTextField usernameTextField;
    private JButton exitButton;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPasswordField PasswordTextField;
    private JButton registerButton;

    // Constructor for the Login Page
    public LoginFrame() {
        //Set the Frame to have these properties
        this.setTitle("W.A.S Login Page");
        this.setContentPane(LoginPanel);
        this.setSize(450, 515);
        this.setLocationRelativeTo(null); // center the frame
        this.setDefaultCloseOperation(3); // if top red x button is pressed, close program
        this.setVisible(true); // set the frame visible to the viewer.


        // Action for the exit button (Close the program)
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the application when the Exit button is clicked
                System.exit(0);
            }
        });

        // Action for the Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // First grab the text from the Username and Password field user input
                String username = usernameTextField.getText();
                char[] passwordChars = PasswordTextField.getPassword();
                String password = new String(passwordChars); // Convert char array to String

                // Create a MongoUserDAO to use its methods to authenticate a user
                MongoUserDAO loginAuthenticate = new MongoUserDAO();

                // if the user is found, passwords match, and user is an admin: Call admin Frame
                if (Objects.equals(loginAuthenticate.authenticateUser(username, password), "admin")) {
                    //close current login window, then open the Admin frame if Role = Admin.
                    dispose();
                    AdminFrame ex = new AdminFrame();
                    ex.setVisible(true);
                    // else if User is found but password is wrong, display error message
                } else if (Objects.equals(loginAuthenticate.authenticateUser(username, password), "IncorrectPassword")) {
                    JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    // else if user is NOT found, display error message
                } else if (Objects.equals(loginAuthenticate.authenticateUser(username, password), "UserNotFound")) {
                    JOptionPane.showMessageDialog(null, "User not found. Please check your username.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // else If the user is found and passwords match, but the role is NOT admin, send to Non-Admin Frame
                    dispose();
                    NonAdminFrame nonAdminFrame = new NonAdminFrame();
                    nonAdminFrame.setVisible(true);
                }
            }
        });


    }

    private void lookupuser() {
        //User user = new User();

    }

}
