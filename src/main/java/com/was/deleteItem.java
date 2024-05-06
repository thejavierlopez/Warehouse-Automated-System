package com.was;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deleteItem extends JFrame {
    private JPanel DelMainPan;
    private JLabel TitleDel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JLabel textF1;
    private JLabel textF2;
    private JButton goBackButton;

    public deleteItem() {

        this.setTitle("Delete Item Frame");
        this.setSize(400,350);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setContentPane(DelMainPan);
        this.setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Implement deleteItem method here
                // Retrieve item name and quantity from text fields
                String itemName = textField1.getText();
                int quantity = Integer.parseInt(textField2.getText());

                // Call the deleteItem method from MongoItemDAO
                MongoItemDAO itemDAO = new MongoItemDAO();
                itemDAO.deleteItem(itemName, quantity);

                // Clear text fields after deletion
                textField1.setText("");
                textField2.setText("");


            }

            
        });
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdminFrame ex = new AdminFrame();
                ex.setVisible(true);
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
