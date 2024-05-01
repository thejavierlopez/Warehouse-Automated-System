package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adduser extends JFrame{
    private JPanel addUmain;
    private JLabel title;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
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
