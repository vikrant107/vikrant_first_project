package com.demo.vikrant_first_project.service;

import com.demo.vikrant_first_project.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Employeeservice {

    public Employee create(Employee e);

    public List<Employee> getAll();
    public Employee getById(Integer id);
}
