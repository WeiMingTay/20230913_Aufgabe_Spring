package com.example.aufgabe_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {
@GetMapping
    public String getHello(){
        return "Hello, World";
    }
}
