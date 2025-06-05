package com.demo.vikrant_first_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("greeting")
    public  String greeting(){
        return "Welcome to spring boot";
    }
}
