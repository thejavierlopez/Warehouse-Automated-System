package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteItem extends JFrame {
    private JPanel DelMainPan;
    private JLabel TitleDel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JLabel textF1;
    private JLabel textF2;
    private JButton goBackButton;

    public deleteItem() {

        this.setTitle("Add user Frame");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(DelMainPan);
        this.setVisible(true);
        OKButton.addActionListener(new ActionListener() {
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
        JFrame frame = new JFrame("deleteItem");
        frame.setContentPane(new deleteItem().DelMainPan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
