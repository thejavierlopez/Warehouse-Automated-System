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
    private JPanel IDPanel;
    private JPanel NamePanel;
    private JPanel QtyPanel;
    private JPanel IDLabelPanel;
    private JPanel QtyLabelPanel;
    private JPanel NameLabelPanel;
    private JLabel IDLabel;
    private JLabel QtyLabel;
    private JLabel ItemNameLabel;

    public AdminCheckItemStockFrame() {
        // setting up the properties of the Frame
        this.setTitle("All Items in Database");
        this.setSize(850,225);
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
        SearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                IDPanel.setLayout(new GridBagLayout());
                NamePanel.setLayout(new GridBagLayout());
                QtyPanel.setLayout(new GridBagLayout());


                JLabel ItemIDLabel = new JLabel("Item ID");
                JLabel ItemNameLabel = new JLabel("Item Name");
                JLabel ItemQuantity = new JLabel("Item Qty");

                // Set font size for labels
                Font labelFont = new Font("Arial", Font.BOLD, 12); // Example font: Arial, Bold, Size 16
                ItemIDLabel.setFont(labelFont);
                ItemNameLabel.setFont(labelFont);
                ItemQuantity.setFont(labelFont);

                // Set GridBagConstraints for vertical and horizontal centering
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.anchor = GridBagConstraints.CENTER;

                IDPanel.add(ItemIDLabel, gbc);
                NamePanel.add(ItemNameLabel, gbc);
                QtyPanel.add(ItemQuantity, gbc);

                revalidate();
                repaint();
                setVisible(true);
//                IDPanel.setLayout(new BoxLayout(IDPanel, BoxLayout.Y_AXIS));
//                NamePanel.setLayout(new BoxLayout(NamePanel, BoxLayout.Y_AXIS));
//                QtyPanel.setLayout(new BoxLayout(QtyPanel, BoxLayout.Y_AXIS));
//
//                JLabel ItemIDLabel = new JLabel("Item ID");
//                JLabel ItemNameLabel = new JLabel("Item Name");
//                JLabel ItemQuantity = new JLabel("Item Qty");
//
//                IDPanel.add(ItemIDLabel);
//                NamePanel.add(ItemNameLabel);
//                QtyPanel.add(ItemQuantity);
//
//
//
//                ItemIDLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
//                ItemNameLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
//                ItemQuantity.setAlignmentY(Component.CENTER_ALIGNMENT);
//
//
//                revalidate();
//                repaint();
//                setVisible(true);

            }
        });
    }

}
