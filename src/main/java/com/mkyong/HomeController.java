package com.mkyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class HomeController {

    @Autowired
    Environment env;
    @PostMapping
    public String handlePostRequest()
    {

        return "Hello"+"Aakash "+
               " "+"Access Time is "+
                System.currentTimeMillis();
    }
}
