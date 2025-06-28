package com.demo.vikrant_first_project.repository;

import com.demo.vikrant_first_project.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
