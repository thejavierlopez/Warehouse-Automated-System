package com.was;


public interface ItemDAO {

    void addItem(Item item);
    void deleteItem(String itemName, int itemQuantity);
    //void updateItem(Item Item);
    void deleteAllItems();

}
