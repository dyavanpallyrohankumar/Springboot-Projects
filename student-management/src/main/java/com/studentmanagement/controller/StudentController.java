package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.studentmanagement.exception.ResourseNotFound;
import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentServiceImp;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentServiceImp implementation;

    @GetMapping
    public ResponseEntity<?> getmethod() {
        return new ResponseEntity<>(implementation.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getMethodName(@RequestParam Integer id) throws ResourseNotFound {
        return new ResponseEntity<>(implementation.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody Student entity) {
        return new ResponseEntity<>(implementation.saveentity(entity), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putMethodName(@PathVariable Integer id, @Valid @RequestBody Student entity)
            throws ResourseNotFound {
        return new ResponseEntity<>(implementation.updateStudent(id, entity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMethod(@PathVariable Integer id) throws ResourseNotFound {
        return new ResponseEntity<>(implementation.deleteStudent(id), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<?> getbyPagination(@RequestParam Integer page, @RequestParam Integer size) {
        return new ResponseEntity<>(implementation.getbyPagiantion(page, size), HttpStatus.OK);
    }
}
