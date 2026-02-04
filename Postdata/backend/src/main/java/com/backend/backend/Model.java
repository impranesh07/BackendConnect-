package com.backend.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Data;

@Document(collection = "Test")
@Data
public class Model {
    @Id
    private  int roll;
    private String name;
    private  String sec;
    private String add;


}
