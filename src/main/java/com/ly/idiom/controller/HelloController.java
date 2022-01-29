package com.ly.idiom.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    @PostMapping("sayHi")
    public String sayHi(){
        return "hello";
    }
}
