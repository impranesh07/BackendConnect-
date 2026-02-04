package com.backend.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reop extends MongoRepository<Model,Integer> {

}
