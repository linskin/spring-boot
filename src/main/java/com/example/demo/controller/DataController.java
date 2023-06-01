package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @RequestMapping("/data")
    public String print(){
        return "nihao";
    }
}
