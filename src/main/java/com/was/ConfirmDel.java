package com.was;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmDel extends JFrame {
    private JLabel Title;
    private JPanel MainPan;
    private JButton DelBUT;
    private JButton goBackButton;
    private JTextField WARNINGSelectionWillBeTextField;

    public ConfirmDel() {


<<<<<<< Updated upstream
        this.setTitle("W.A.S");
        
======
        this.setSize(600, 350);
>>>>>>> Stashed changes
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(MainPan);
        this.setVisible(true);

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);
            }
        });

        DelBUT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // When the "Delete" button is clicked, this ActionListener is triggered.

                // Instantiate MongoUserDAO to access its methods
                MongoUserDAO userDAO = new MongoUserDAO();

                // Call the deleteAllRegularUsers method to delete all regular users from the database
                userDAO.deleteAllRegularUsers();

                // Add any additional actions or feedback messages here if needed

                 JOptionPane.showMessageDialog(null, "Regular users deleted successfully!");


            }
        });
    }






    public static void main(String[] args) {
        JFrame frame = new JFrame("ConfirmDel");
        frame.setContentPane(new ConfirmDel().MainPan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
