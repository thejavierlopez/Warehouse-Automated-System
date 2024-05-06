package com.was;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.util.UUID;

public class MongoItemDAO implements ItemDAO {

    MongoClient mongoClient = MongoClientUtil.getMongoClient();
    MongoDatabase database = mongoClient.getDatabase("WAS");
    MongoCollection<Document> items = database.getCollection("items");

    @Override
    public void addItem(Item item) {
        //randomly generated item id
        //String itemId = UUID.randomUUID().toString();
        String itemId = generateItemId(item.getItemName());
        item.setItemId(itemId);  // Set the item ID in the Item object

        Document newItem = new Document("item_id", itemId)
                .append("name", item.getItemName())
                .append("quantity", item.getItemQuantity());
        items.insertOne(newItem);
    }


    private String generateItemId(String itemName) {
        MongoCollection<Document> counters = database.getCollection("counters");
        //this will allow easier to keep track of id numbers using the starting letter
        //of the item name followed by six zeros
        String key = itemName.substring(0, 1).toUpperCase();

        // increment sequence for item id
        Document counter = counters.findOneAndUpdate(
                Filters.eq("item_id", key),
                Updates.inc("seq", 1),
                new FindOneAndUpdateOptions().upsert(true).returnDocument(ReturnDocument.AFTER)
        );

        int seq = counter != null ? counter.getInteger("seq", 1) : 1;  // Start from 1 if null
        return key + String.format("%07d", seq);
    }


    public FindIterable<Document> getAllItems() {
        return items.find();
    }

    @Override
    public void deleteItem(String itemName, int quantity) {
        MongoCollection<Document> collection = database.getCollection("items");

        //find item by name
        Document item = collection.find(Filters.eq("name", itemName)).first();
        if (item == null) {
            JOptionPane.showMessageDialog(null, "Error: Item Not Found!");
        }
        if (item != null) {
            int currentQuantity = item.getInteger("quantity");
            if (quantity >= currentQuantity) {
                //item is deleted if quantity to be deleted exceeds item quantity
                collection.deleteOne(Filters.eq("name", itemName));
                JOptionPane.showMessageDialog(null, "Error: Make Sure The Quantity Removed DOES NOT Exceed Stock!");
            } else {
                //delete specified item quantity
                collection.updateOne(Filters.eq("name", itemName), Updates.inc("quantity", -quantity));
                JOptionPane.showMessageDialog(null, "Items Removed successfully!");
            }
        }
    }

    @Override
    public void deleteAllItems() {
        MongoCollection<Document> collection = database.getCollection("items");
        //deletes all items in the collection items
        collection.deleteMany(new Document());
    }

//    @Override
//    public void updateItem(Item item) {
//
//    }
    //continue adding additional methods here

}
