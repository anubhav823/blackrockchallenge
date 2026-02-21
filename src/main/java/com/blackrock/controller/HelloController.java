package com.blackrock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/b")
    public String hello() {
        return "Hello from Blackrock Spring Boot!";
    }
 
}
