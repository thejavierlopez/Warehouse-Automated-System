package com.was;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.UUID;

public class MongoItemDAO implements ItemDAO {

    MongoClient mongoClient = MongoClientUtil.getMongoClient();
    MongoDatabase database = mongoClient.getDatabase("WAS");
    MongoCollection<Document> items = database.getCollection("items");

    @Override
    public void addItem(Item item) {
        String itemId = UUID.randomUUID().toString();  // Generate a unique UUID for each item
        item.setItemId(itemId);  // Set the item ID in the Item object

        Document newItem = new Document("item_id", itemId)
                .append("name", item.getItemName())
                .append("quantity", item.getItemQuantity());
        items.insertOne(newItem);
    }

    public FindIterable<Document> getAllItems() {
        return items.find();
    }

    @Override

    public void deleteItem(Item itemId) {



    }

    @Override
    public void updateItem(Item item) {

    }
    //continue adding additional methods here

}
