package com.example.cgn222spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetignsController {

    String name = "";

    @GetMapping()
    public String sayHello(){
        return "Grüß Gott! " +name;
    }

    @GetMapping("/en")
    public String sayHello2(){
        return "Hello!";
    }

    @GetMapping(path = "{name}")
    public String sayHello3(@PathVariable String name, @RequestParam String q){
        return q + " " + name;
    }

    @PostMapping
    public String postName(@RequestBody String newName){
        name = newName;
        return "New name equals = " +name;
    }



    @GetMapping("/Daniel")
    public String sayDaniel(){
        return "Servus Daniel";
    }

}
