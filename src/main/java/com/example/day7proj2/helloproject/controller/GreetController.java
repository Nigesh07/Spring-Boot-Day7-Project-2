package com.example.day7proj2.helloproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public String home(){
        return "Welcome to SpringBoot";
    }

     @GetMapping("/about")
    public String about() {
        return "About Project";
    }

}
