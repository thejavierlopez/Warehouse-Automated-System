package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class addItemPanel extends JFrame{
    private JPanel MainItemPan;
    private JLabel pageTitle;
    private JLabel NameOf;
    private JTextField itemTextField;
    private JLabel QuantityTF;
    private JTextField textField1;
    private JButton addItemButton;
    private JButton button2;

    public addItemPanel() {

        this.setTitle("Add user Frame");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(MainItemPan);
        this.setVisible(true);
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);

            }
        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("addItemPanel");
//        frame.setContentPane(new addItemPanel().MainItemPan);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//
//
//    }
}
