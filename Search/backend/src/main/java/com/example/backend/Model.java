package com.example.backend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "Test")
@Data
public class Model {
  @Id  
  private String mongoid;

  @Field("Id")
  private int roll;
  private String name;
  private char sec;
  private String add;    
}
