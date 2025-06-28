package com.demo.vikrant_first_project.controller;

import com.demo.vikrant_first_project.model.Department;
import com.demo.vikrant_first_project.model.Employee;
import com.demo.vikrant_first_project.service.Departmentservice;
import com.demo.vikrant_first_project.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    Departmentservice departmentservice;

    @GetMapping("greeting")
    public String greeting() {
        return "Welcome to spring boot";
    }

   // @PostMapping("/create")
    //public Department createDepartment(@RequestBody Department department) {
      //  departmentservice.create(department);
        //return employee;
    //}
}


