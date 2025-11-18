package com.studentmanagement.model;

// import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

//for relational we use like below
@Entity
@Table(name = "students")

// for non relational we use like below
// @Document(collection = "students")
@Data
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Name Should be filled")
    @NotBlank
    private String name;
    @Email(message = "the proper mail format")
    @NotNull
    private String email;
    @NotBlank(message = "please enter the department")
    private String department;

    public Student(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }
}
