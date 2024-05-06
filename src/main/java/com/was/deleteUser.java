package com.was;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteUser extends JFrame {
    private JPanel delUMain;
    private JButton deleteButton;
    private JTextField textField2;
    private JLabel uName;
    private JButton goBackButton;
    private JButton button3;
    private JTextField DELETEALLUSERSTextField;

    // Create an instance of MongoUserDAO to access its methods
    private MongoUserDAO userDAO = new MongoUserDAO();

    public deleteUser() {

        this.setTitle("Delete user Frame");
        this.setSize(550,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(delUMain);
        this.setVisible(true);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to perform when delete button is clicked

                // Retrieve the username from the text field
                String username = textField2.getText();

                // Call the deleteUser method with the username
                boolean deletionSuccessful =  userDAO.deleteUser(username);

                // Show message based on deletion success or failure
                if (deletionSuccessful) {
                    JOptionPane.showMessageDialog(null, "User deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: User not found!");
                }
            }



        });
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("deleteUser");
        frame.setContentPane(new deleteUser().delUMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
