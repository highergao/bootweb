package com.example.bootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloBoot {

    @RequestMapping("/boot")
    public String helloBoot(){
        return "helloBoot";
    }
}
