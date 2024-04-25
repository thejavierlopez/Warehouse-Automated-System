package com.was;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    private JPanel LoginPanel;
    private JLabel LoginTitle;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton exitButton;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton registerButton;

    public LoginFrame() {
        this.setTitle("Login Page");
        this.setContentPane(LoginPanel);
        this.setSize(450, 474);
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
                String password = usernameTextField.getText();

                //add logic for if the username matches a name in the database.
                //close current login window, then open the Admin frame if Role = Admin.
                dispose();
                AdminFrame AdminFrame = new AdminFrame();
                AdminFrame.setVisible(true);
            }
        });


    }

    private void lookupuser() {
        //User user = new User();

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame ex = new LoginFrame();
            ex.setVisible(true);

        });
    }
}
