package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamarthRouting {
    @GetMapping("/")
    public String hello(){
        return "Hello from `/` root route";
    }
    @PostMapping("/")
    public String hello2(){
        return "Hello from Post `/` root route";
    }
}
@RestController
class User{
    @GetMapping("/users")
    public Integer user(){
        return 10;
    }
}