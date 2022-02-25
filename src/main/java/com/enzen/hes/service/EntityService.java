package com.enzen.hes.service;

import com.enzen.hes.mongo.service.MongoService;
import com.mongodb.MongoClient;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    @Autowired
    MongoService mongoService;


    public void serviceTest() {
        System.out.println("On this line");
        mongoService.create("entity",new Document("Asset", "Substation"));
        var documents = mongoService.findAll("entity",new Document());
        documents.forEach(System.out::println);
    }
}
