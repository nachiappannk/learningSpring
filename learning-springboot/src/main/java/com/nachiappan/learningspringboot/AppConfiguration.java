package com.nachiappan.learningspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppConfiguration {

    @RequestMapping("/hello")
    @PostMapping
    public Test hello(){
        return new Test();
    }
}

class Test{
    public String getName(){
        return "name";
    }
    public String getFile(){
        return "file";
    }
}
