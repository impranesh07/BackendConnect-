package com.example.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Test")
@Data
public class Model {
    @Id
    private int id;
    private String name;
    private char sec;
    private String add;
}
