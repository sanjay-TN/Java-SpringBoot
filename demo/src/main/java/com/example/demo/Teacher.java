package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/my")
public class Teacher {
    @Autowired
    Student s1;

    @GetMapping("/hello")
    public String greetings() {
        return s1.hello();
    }

    @GetMapping("/api1")
    public String api1() {
        return "first api";
    }

    @GetMapping("/api2")
    public String api2() {
        return "second api";
    }

    @GetMapping("/fact")
    public String cat() {
        return "welcome to catfact";
    }

}
