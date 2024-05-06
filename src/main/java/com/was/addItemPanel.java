package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class addItemPanel extends JFrame{
    private JPanel MainItemPan;
    private JLabel pageTitle;
    private JLabel NameOf;
    private JTextField itemTextField;
    private JLabel QuantityTF;
    private JTextField textField1;
    private JButton addItemButton;
    private JButton button2;

    public addItemPanel() {

        this.setTitle("W.A.S");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(MainItemPan);
        this.setVisible(true);
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String ItemName = itemTextField.getText();
            String QuantityString = textField1.getText();
            //convert string quantity to Int

            if (ItemName.equals("")) {
                JOptionPane.showMessageDialog(null, "Error: No input for Item Name!", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int QuantityInt = Integer.parseInt(QuantityString);

                    MongoItemDAO itemDAO = new MongoItemDAO();
                    Item item = new Item(ItemName,QuantityInt);
                    itemDAO.addItem(item);
                    JOptionPane.showMessageDialog(null, "Success: Item added to database", "Success Prompt", JOptionPane.INFORMATION_MESSAGE);
                    // Perform further operations with quantityInt if needed
                } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "Error: Input is not a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    // Handle the error or notify the user accordingly
                }
            }


            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);

            }
        });
    }
}
