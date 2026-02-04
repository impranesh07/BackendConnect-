package com.backend.backend;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
public class Controller {
    @Autowired 
    Reop obj;

    @PostMapping("/data")
    public Model postMethodName(@RequestBody Model model) {
        Model data = obj.save(model);
        System.out.println(data);
        return data;
    }
    
}
