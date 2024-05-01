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

        // setting up the properties of the Frame
        this.setTitle("Admin Control Flow Center");
        this.setSize(1050, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);

        // setting sizes of the Buttons
//        addUserButton.setPreferredSize(new Dimension(100,80));
//        deleteUserButton.setPreferredSize(new Dimension(100,80));
//        DeleteItemButton.setPreferredSize(new Dimension(100,80));
//        listAllItemsButton.setPreferredSize(new Dimension(100,80));
//        checkItemStockButton.setPreferredSize(new Dimension(100,80));
//        LogOutButton.setPreferredSize(new Dimension(50,40));
//        AddItemButton.setPreferredSize(new Dimension(100,80));

        addUserButton.setPreferredSize(new Dimension(50,40));
        deleteUserButton.setPreferredSize(new Dimension(50,40));
        DeleteItemButton.setPreferredSize(new Dimension(50,40));
        listAllItemsButton.setPreferredSize(new Dimension(50,40));
        checkItemStockButton.setPreferredSize(new Dimension(50,40));
        LogOutButton.setPreferredSize(new Dimension(50,40));
        AddItemButton.setPreferredSize(new Dimension(50,40));



        // set contentpane to the Frame, and set the frame to be visible
        this.setContentPane(AdminPanel);
        this.setVisible(true);

        // Action for LogOut button
        LogOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginFrame newLogin = new LoginFrame();
                newLogin.setVisible(true);
            }



        });

        // Action for List All Items Button
        listAllItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                AdminListAllItemsFrame newFrame = new AdminListAllItemsFrame();
                newFrame.setVisible(true);
            }
        });


        checkItemStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                AdminCheckItemStockFrame newAdminCheckItemStockFrame = new AdminCheckItemStockFrame();
                newAdminCheckItemStockFrame.setVisible(true);
            }
        });
    }
}

