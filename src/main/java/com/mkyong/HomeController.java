package com.mkyong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class HomeController {

    @PostMapping
    public String handlePostRequest() {
        return "Hello, this is a POST response!";
    }
}
