package com.demo.vikrant_first_project.service;

import com.demo.vikrant_first_project.model.Employee;
import com.demo.vikrant_first_project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements Employeeservice{

    @Autowired EmployeeRepository employeeRepository;
    @Override
    public Employee create(Employee e) {
        employeeRepository.save(e);
        return e;
    }
}
