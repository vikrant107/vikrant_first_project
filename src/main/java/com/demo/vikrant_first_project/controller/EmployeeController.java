package com.demo.vikrant_first_project.controller;

import com.demo.vikrant_first_project.model.Employee;
import com.demo.vikrant_first_project.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired  Employeeservice employeeservice;

    @GetMapping("greeting")
    public String greeting() {
        return "Welcome to spring boot";
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.getName() + "," + employee.getSalary() + "," + employee.getMobileNo());
        employeeservice.create(employee);
        return employee;
    }

    @GetMapping("/get_employee")
    public List<Employee> getAllReord(){
        return employeeservice.getAll();
    }
}
