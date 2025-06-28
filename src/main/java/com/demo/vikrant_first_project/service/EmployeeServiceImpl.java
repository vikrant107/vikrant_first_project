package com.demo.vikrant_first_project.service;

import com.demo.vikrant_first_project.model.Employee;
import com.demo.vikrant_first_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements Employeeservice{

    @Autowired EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(Integer id) {
        return null;
    }

    @Override
    public Employee create(Employee e) {
        employeeRepository.save(e);
        return e;
    }
}
