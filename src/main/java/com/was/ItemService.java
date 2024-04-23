package com.was;


public class ItemService {
    private final ItemDAO itemDAO;

    public ItemService(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    public void addItem(Item item) {
        itemDAO.addItem(item);
    }

    public void deleteItem(Item item) {
        itemDAO.deleteItem(item);
    }

    public void updateItem(Item item) {
        itemDAO.updateItem(item);
    }

    //continue adding service methods
}
