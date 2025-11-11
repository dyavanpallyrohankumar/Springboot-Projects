package com.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentServiceImp;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentServiceImp implementation;

    @GetMapping
    public List<Student> getmethod() {
        return implementation.getAllStudents();
    }

    @GetMapping("/")
    public Optional<Student> getMethodName(@RequestParam Long id) {
        return implementation.getById(id);
    }

    @PostMapping
    public Student save(@Valid @RequestBody Student entity) {
        return implementation.saveentity(entity);
    }

    @PutMapping("/{id}")
    public String putMethodName(@PathVariable Long id, @Valid @RequestBody Student entity) {
        return implementation.updateStudent(id, entity);
    }

    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable Long id) {
        return implementation.deleteStudent(id);
    }

}
