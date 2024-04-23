package com.was;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoClientUtil {
    private static MongoClient mongoClient = null;

    public static MongoClient getMongoClient() {
        if (mongoClient == null) {  // Lazy initialization
            String connectionString = "mongodb+srv://lopez6295:MDBJuiceZeehc1995$$@was.ilxoprd.mongodb.net/?retryWrites=true&w=majority&appName=WAS";
            ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(connectionString))
                    .serverApi(serverApi)
                    .build();

            mongoClient = MongoClients.create(settings);
        }
        return mongoClient;
    }

    public static void closeClient() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}


