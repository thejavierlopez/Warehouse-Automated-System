package com.was;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminCheckItemStockFrame extends JFrame {
    private JPanel MainPanel;
    private JPanel CenterPanel;
    private JPanel TopPanel;
    private JPanel SearchLabelPanel;
    private JPanel TextFieldPanel;
    private JPanel SearchButtonPanel;
    private JPanel BottomPanel;
    private JButton GoBackButton;
    private JTextField SearchTxTField;
    private JButton SearchButton;
    private JLabel SearchLabel;
    private JPanel GoBackButtonPanel;

    public AdminCheckItemStockFrame() {
        // setting up the properties of the Frame
        this.setTitle("All Items in Database");
        this.setSize(800,380);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);

        GoBackButton.setPreferredSize(new Dimension(50,40));

        this.setContentPane(MainPanel);


        GoBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame newAdminFrame = new AdminFrame();
                newAdminFrame.setVisible(true);
            }
        });



        this.setVisible(true);
    }

}
