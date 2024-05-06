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


        this.setTitle("Confirm DELETE Frame");
        this.setSize(400, 350);
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
