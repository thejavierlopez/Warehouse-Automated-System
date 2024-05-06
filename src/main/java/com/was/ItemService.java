package com.was;


public class ItemService {
    private final ItemDAO itemDAO;

    public ItemService(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    public void addItem(Item item) {
        itemDAO.addItem(item);
    }

    public void deleteItem(String itemName, int quantity) {
        itemDAO.deleteItem(itemName, quantity);
    }

//    //public void updateItem(Item item) {
//        itemDAO.updateItem(item);
//    }

    public void deleteAllItems() {
        itemDAO.deleteAllItems();
    }

    //continue adding service methods
}
