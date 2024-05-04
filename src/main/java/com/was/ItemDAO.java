package com.was;


public interface ItemDAO {

    void addItem(Item item);
    void deleteItem(Item item);
    void updateItem(Item Item);
    void deleteAllItems();

}
