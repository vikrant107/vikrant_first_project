package com.demo.vikrant_first_project.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.Entity;

@Data
@Entity
@Table(name = "employee001")
public class Employee {
    @Id// it will create primary key
    @GeneratedValue// it will create Auto increment field
    private Integer id;
    private String name;
    private String salary;
    private String mobileNo;

}
//@Entity-- itd jPA anotation --which will create table into database, table name will
// the same name of the class name, but if we want different table name then we have to use
// @Table annotation

// @Data= @Getter,@Setter,@AllArgsConstructor, @NoArgsConstructor