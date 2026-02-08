package com.example.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class Controller {
    
    @Autowired Repo rp;

    @GetMapping("/get_data")
    public List<Model> getMethodName() {
        return rp.findAll();
    }

   @GetMapping("/search_data/{id}")
public List<Model> getMethodName(@PathVariable int id) {
         return rp.findByRoll(id);
}
    
}
