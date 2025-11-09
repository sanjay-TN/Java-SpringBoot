package com.securityTutorial.security.controller;

import com.securityTutorial.security.employee.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<Employee> list=new ArrayList<>(List.of(new Employee(1,"sam",24)));

    @GetMapping("/home")
    public String hello(){
        return "Learning spring security";
    }

    @GetMapping("/csrf")
    public CsrfToken session(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }


    @GetMapping("/employee")
    public List<Employee> getList() {
        return list;
    }

    @PostMapping("/add")
    public void setList(List<Employee> list) {
        this.list = list;
    }
}

