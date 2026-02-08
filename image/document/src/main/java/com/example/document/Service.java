package com.example.document;

import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Service {

    @Autowired Repofile rep;
    
    public void Image(MultipartFile File ) {
       try {
        Model img=new Model();
        img.setName(File.getOriginalFilename());
        img.setType(File.getContentType());
        img.setBt(new Binary(File.getBytes()));

        rep.save(img);
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
       }
        

        
    }
}
