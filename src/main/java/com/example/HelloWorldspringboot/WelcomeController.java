package com.example.HelloWorldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome1(){
        return "Go to /welcome";
    }
    @GetMapping("/welcome")
    public String welcome2(){
        return "Hello World!!";
    }
}
