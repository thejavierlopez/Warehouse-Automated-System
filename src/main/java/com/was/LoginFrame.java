package com.was;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginFrame extends JFrame {
    private JPanel LoginPanel;
    private JLabel LoginTitle;
    private JTextField usernameTextField;
    private JButton exitButton;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPasswordField PasswordTextField;
    private JButton registerButton;

    public LoginFrame() {
        this.setTitle("Login Page");
        this.setContentPane(LoginPanel);
        this.setSize(450, 515);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the application when the Exit button is clicked
                System.exit(0);
            }
        });


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                char[] passwordChars = PasswordTextField.getPassword();
                String password = new String(passwordChars); // Convert char array to String

                MongoUserDAO loginAuthenticate = new MongoUserDAO();
                if (Objects.equals(loginAuthenticate.authenticateUser2(username, password), "admin")) {
                    //close current login window, then open the Admin frame if Role = Admin.
                    dispose();
                    AdminFrame ex = new AdminFrame();
                    ex.setVisible(true);
                } else if (Objects.equals(loginAuthenticate.authenticateUser2(username, password), "IncorrectPassword")) {
                    JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Objects.equals(loginAuthenticate.authenticateUser2(username, password), "UserNotFound")) {
                    JOptionPane.showMessageDialog(null, "User not found. Please check your username.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
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
