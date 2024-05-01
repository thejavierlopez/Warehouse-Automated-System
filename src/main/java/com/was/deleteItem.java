package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteItem {
    private JPanel DelMainPan;
    private JLabel TitleDel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JLabel textF1;
    private JLabel textF2;

    public deleteItem() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
