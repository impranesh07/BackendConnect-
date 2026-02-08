package com.example.document;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Controller {

    @Autowired Service sc;
    @PostMapping("/image_send")
    public ResponseEntity<?> send(@RequestParam("file") MultipartFile File){
       try {
        sc.Image(File);
       return new ResponseEntity<>("Image send success", HttpStatus.OK);

       } catch (Exception e) {
         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

  
    























}
