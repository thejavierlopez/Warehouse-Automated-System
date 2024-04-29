package com.was;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NonAdminFrame extends JFrame {
    private JPanel NonAdminPanel;
    private JButton ListAllItemsButton;
    private JButton CheckItemStockButton;
    private JLabel TitleLabel;
    private JPanel TopPanel;
    private JPanel BottomPanel;
    private JLabel ServicesLabel;
    private JPanel ServiceLabelPanel;
    private JPanel ListAllItemsPanel;
    private JPanel CheckItemStockPanel;
    private JPanel LogOutPanel;
    private JButton LogOutButton;

    public NonAdminFrame() {

        setTitle("NonAdmin Frame");
        setContentPane(NonAdminPanel);
        setSize(600, 700);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        ListAllItemsButton.setPreferredSize(new Dimension(95, 70));
        CheckItemStockButton.setPreferredSize(new Dimension(95, 70));
        LogOutButton.setPreferredSize(new Dimension(95, 70));
        setVisible(true);
        LogOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginFrame newLogin = new LoginFrame();
                newLogin.setVisible(true);
            }
        });
    }

}
