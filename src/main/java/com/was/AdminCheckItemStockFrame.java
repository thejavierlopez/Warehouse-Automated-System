package com.was;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mongodb.client.FindIterable;
import org.bson.Document;

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
    private JPanel DisplayInfoPanel;
    private JPanel DisplayIDPanel;
    private JPanel DisplayNamePanel;
    private JPanel DisplayItemNamePanel;
    private JLabel DisplayItemNameLabel;
    private JPanel DisplayQtyPanel;
    private JLabel DisplayIDLabel;
    private JLabel DisplayNameLabel;
    private JLabel DisplayIdLabel;
    private JLabel DisplayQtyLabel;
    private JLabel DisplayInfoLabel;

    private MongoItemDAO mongoItemDAO; // Instance of MongoItemDAO
    public AdminCheckItemStockFrame() {
        // setting up the properties of the Frame
        this.setTitle("All Items in Database");
        this.setSize(850,225);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);



        mongoItemDAO = new MongoItemDAO(); // Initialize MongoItemDAO

        GoBackButton.setPreferredSize(new Dimension(50,40));

        this.setContentPane(MainPanel); // set the Main Panel onto the Frame


        GoBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Go back to admin Frame
                dispose();
                AdminFrame newAdminFrame = new AdminFrame();
                newAdminFrame.setVisible(true);
            }
        });


        this.setVisible(true);

        SearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String searchItemName = SearchTxTField.getText(); // Get the item name from the text field

                FindIterable<Document> items = mongoItemDAO.getAllItems();
                boolean found = false; // Flag to track if the item is found

                // iterate through database and see if item typed is in database or not, and then display its attributes if it is
                for (Document item : items) {
                    String name = item.getString("name");

                    if (name.equals(searchItemName)) {
                        String itemId = item.getString("item_id");
                        int quantity = item.getInteger("quantity");

                        DisplayIDLabel.setText(itemId);
                        DisplayNameLabel.setText(name);
                        DisplayQtyLabel.setText(Integer.toString(quantity));

                        found = true; // Set the flag to true indicating item is found
                        break; // Exit the loop once item is found
                    }
                }

                if (!found) { // If the item was not found after looping through all items
                    JOptionPane.showMessageDialog(AdminCheckItemStockFrame.this, "Item Not found!", "Search Result", JOptionPane.ERROR_MESSAGE);
                }

                revalidate();
                repaint();

            }
        });


    }
}
