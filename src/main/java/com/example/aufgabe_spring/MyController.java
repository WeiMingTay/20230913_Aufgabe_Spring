package com.example.aufgabe_spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyController {

    @GetMapping
    public String getHello() {
        return "Hello, World";
    }

    @PostMapping("/{name}")
    public String postHello(@PathVariable String name) {
        return "Hello, "+name;
    }
}
