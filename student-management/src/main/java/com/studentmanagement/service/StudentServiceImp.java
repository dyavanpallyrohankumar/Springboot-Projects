package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImp {
    @Autowired
    StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getById(Long id) {
        Optional<Student> std = repository.findById(id);
        return std.isPresent() ? Optional.of(std.get()) : std.empty();
    }

    public String deleteStudent(Long id) {
        Optional<Student> std = repository.findById(id);
        if (std.isPresent()) {
            repository.deleteById(id);
            return "Deleted Sucessfully";
        }
        return "Not found";
    }

    public String updateStudent(Long id, Student entity) {
        Optional<Student> std = repository.findById(id);
        if (std.isPresent()) {
            std.get().setName(entity.getName());
            std.get().setEmail(entity.getEmail());
            std.get().setDepartment(entity.getDepartment());
            repository.save(std.get());
            return "updated sucessfully Sucessfully";
        }
        return "Not Found";
    }

    public Student saveentity(Student entity) {
        return repository.save(entity);
    }

}
