package com.was;

import com.mongodb.client.FindIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class AdminListAllItemsFrame extends JFrame {
    private JPanel MainPanel;
    private JPanel CenterPanel;
    private JPanel ButtonPanel;
    private JScrollPane ScrollPane;
    private JButton GoBackButton;
    private JPanel GoBackPanel;
    private JPanel TopPanel;
    private JPanel ItemIdPanel;
    private JPanel ItemNamePanel;
    private JPanel ItemQuantityPanel;
    private JPanel InsideScroll;

    public AdminListAllItemsFrame() {

        // setting up the properties of the Frame
        this.setTitle("All Items in Database");
        this.setSize(800,380);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setContentPane(MainPanel);

        // I want to be able to display the items in my ScrollPane when this JFrame is called

        MongoItemDAO itemDAO = new MongoItemDAO();
        FindIterable<Document> allItems = itemDAO.getAllItems();

        InsideScroll.setLayout(new BoxLayout(InsideScroll, BoxLayout.Y_AXIS));

        // Use a monospaced font for the JLabels
        Font monospacedFont = new Font(Font.MONOSPACED, Font.PLAIN, 12); // Adjust font size as needed

        for (Document item : allItems) {
            String itemId = item.getString("item_id");
            String itemName = item.getString("name");
            int itemQuantity = item.getInteger("quantity");

            String paddedId = String.format("%-47s", itemId);
            String paddedName = String.format("%-45s", itemName);
            String paddedQuantity = String.format("%-5s", itemQuantity);

            JLabel itemLabel = new JLabel(paddedId + paddedName + paddedQuantity);
            itemLabel.setFont(monospacedFont); // Set the font to monospaced
            InsideScroll.add(itemLabel);
        }

        ScrollPane.setViewportView(InsideScroll);

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
