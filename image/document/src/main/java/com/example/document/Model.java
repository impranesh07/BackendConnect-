package com.example.document;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "img")
@Data
public class Model {
    @Id
    private String name;
    private String type;
    private Binary bt;

}