package com.demo.vikrant_first_project.service;

import com.demo.vikrant_first_project.model.Department;
import com.demo.vikrant_first_project.model.Employee;
import com.demo.vikrant_first_project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Departmentimpl implements Departmentservice {


    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department create(Department d) {
        departmentRepository.save(d);
        return d;
    }
}
