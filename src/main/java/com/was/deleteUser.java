package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteUser {
    private JPanel delUMain;
    private JButton confirmButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel uName;

    public deleteUser() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
