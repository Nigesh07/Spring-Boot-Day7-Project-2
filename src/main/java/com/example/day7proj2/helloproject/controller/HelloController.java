package com.example.day7proj2.helloproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String getMethodName(@PathVariable String name) {
        return "Hello, "+name+ "Welcome to Spring Boot";
    }

    @GetMapping("/add")
    public int add(@RequestParam int a,
                   @RequestParam int b) {
        return a + b;
    }
    

}
