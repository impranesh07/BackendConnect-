package com.example.backend;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin
@RestController
public class Controller {

    @Autowired
    Repo rep;

    @GetMapping("/get_data")
    public List<Model> getMethodName() {
        return rep.findAll();
    }
    
    @PutMapping("delete_res/{id}")
    public String putMethodName(@PathVariable Integer id) {
        rep.deleteById(id);
        return "Deleted";
    }
    
 
}
