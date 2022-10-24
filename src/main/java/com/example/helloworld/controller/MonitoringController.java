package com.example.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    @GetMapping("/helloworld/isalive")
    public ResponseEntity<String> isAlive(){
        return new ResponseEntity<>("Hello world is up and running...!", HttpStatus.OK);
    }
}
