package com.was;


public class Item {
    private String itemId;
    private String itemName;
    private int itemQuantity;

    //item constructor
    public Item(String itemName, int itemQuantity) {
        //this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    //getters
    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    //setters

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
