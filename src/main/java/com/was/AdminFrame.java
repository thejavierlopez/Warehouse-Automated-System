package com.was;

import javax.swing.*;
import java.awt.*;

public class AdminFrame extends JFrame{

    private JPanel AdminPanel;
    private JPanel TopPanel;
    private JPanel BottomPanel;
    private JLabel TitleLable;
    private JPanel UserPanel;
    private JPanel ItemPanel;
    private JPanel ServicesPanel;
    private JButton addUserButton;
    private JButton deleteUserButton;
    private JButton addItemButton;
    private JButton deleteItemButton;
    private JButton listAllItemsButton;
    private JButton checkItemStockButton;
    private JLabel UserPanelLabel;


    public AdminFrame() {
        this.setTitle("Admin Control Flow Center");
        this.setSize(1050, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        addUserButton.setPreferredSize(new Dimension(150, 80));
        deleteUserButton.setPreferredSize(new Dimension(100, 80));
        addItemButton.setPreferredSize(new Dimension(100, 80));
        deleteItemButton.setPreferredSize(new Dimension(100, 80));
        listAllItemsButton.setPreferredSize(new Dimension(100, 80));
        checkItemStockButton.setPreferredSize(new Dimension(100, 80));
        this.setContentPane(AdminPanel);
        this.setVisible(true);



    }

    public static void main(String[] args) {


    }


}

