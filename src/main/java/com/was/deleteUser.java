package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteUser extends JFrame {
    private JPanel delUMain;
    private JButton deleteButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel uName;
    private JButton goBackButton;

    public deleteUser() {

        this.setTitle("Add user Frame");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(delUMain);
        this.setVisible(true);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
