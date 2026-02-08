package com.example.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface Repo extends MongoRepository<Model,String> {

    List<Model> findByRoll(int roll);

    
}
