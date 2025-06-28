package com.demo.vikrant_first_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Department001")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;

}
