package com.was;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminFrame extends JFrame{

    private JPanel AdminPanel;
    private JPanel TopPanel;
    private JPanel BottomPanel;
    private JLabel TitleLable;
    private JPanel UserPanel;
    private JPanel ServicesPanel;
    private JButton addUserButton;
    private JButton deleteUserButton;
    private JButton addItemButton;
    private JButton deleteItemButton;
    private JButton listAllItemsButton;
    private JButton checkItemStockButton;
    private JLabel UserPanelLabel;
    private JButton LogOutButton;
    private JButton DeleteItemButton;
    private JButton AddItemButton;
    private JLabel ServicesTitleLabel;
    private JLabel ItemControlTitle;
    private JPanel ItemPanel;

//Original Code:

    public AdminFrame() {
        this.setTitle("Admin Control Flow Center");
        this.setSize(1050, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
//        addUserButton.setPreferredSize(new Dimension(100, 80));
//        deleteUserButton.setPreferredSize(new Dimension(100, 80));
//        addItemButton.setPreferredSize(new Dimension(100, 80));
//        deleteItemButton.setPreferredSize(new Dimension(100, 80));
//        listAllItemsButton.setPreferredSize(new Dimension(100, 80));
//        checkItemStockButton.setPreferredSize(new Dimension(100, 80));
        addUserButton.setPreferredSize(new Dimension(100,80));
        deleteUserButton.setPreferredSize(new Dimension(100,80));
        DeleteItemButton.setPreferredSize(new Dimension(100,80));
        listAllItemsButton.setPreferredSize(new Dimension(100,80));
        checkItemStockButton.setPreferredSize(new Dimension(100,80));
        LogOutButton.setPreferredSize(new Dimension(50,40));
        AddItemButton.setPreferredSize(new Dimension(100,80));

        this.setContentPane(AdminPanel);
        this.setVisible(true);
        LogOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginFrame newLogin = new LoginFrame();
                newLogin.setVisible(true);
            }
        });
    }


    // Constructor for the AdminFrame class
//    public AdminFrame() {
//        // Frame setup
//        this.setTitle("Admin Control Flow Center");
//        this.setSize(1050, 750);
//        this.setLocationRelativeTo(null); // Center the frame on the screen
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
//        addUserButton.setPreferredSize(new Dimension(150, 80)); // Set button size
//        deleteUserButton.setPreferredSize(new Dimension(100, 80)); // Set button size
//        addItemButton.setPreferredSize(new Dimension(100, 80)); // Set button size
//        deleteItemButton.setPreferredSize(new Dimension(100, 80)); // Set button size
//        listAllItemsButton.setPreferredSize(new Dimension(100, 80)); // Set button size
//        checkItemStockButton.setPreferredSize(new Dimension(100, 80)); // Set button size
//        this.setContentPane(AdminPanel); // Set the content pane
//        this.setVisible(true); // Make the frame visible
//    }


}

