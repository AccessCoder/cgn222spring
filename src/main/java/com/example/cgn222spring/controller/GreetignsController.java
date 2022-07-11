package com.example.cgn222spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetignsController {

    @GetMapping
    public String sayHello(){
        return "Grüß Gott!";
    }
}
