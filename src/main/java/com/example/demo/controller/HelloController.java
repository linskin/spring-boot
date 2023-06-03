package com.example.demo.controller;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     *该controller一般被用于测试
     */
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person person(){
        return person;
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String setUser(){
        return "SET-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

}
