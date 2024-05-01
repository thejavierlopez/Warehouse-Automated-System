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
