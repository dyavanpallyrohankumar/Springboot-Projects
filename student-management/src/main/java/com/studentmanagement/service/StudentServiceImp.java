package com.studentmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.studentmanagement.dto.StudentDTO;
import com.studentmanagement.exception.ResourseNotFound;
import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImp {
    @Autowired
    StudentRepository repository;

    ModelMapper mapper = new ModelMapper();

    public List<StudentDTO> getAllStudents() {
        List<Student> stds = repository.findAll();
        List<StudentDTO> dtos = new ArrayList<>();
        for (Student student : stds) {
            dtos.add(mapper.map(student, StudentDTO.class));
        }
        return dtos;
    }

    public StudentDTO getById(Integer id) throws ResourseNotFound {
        Student std = repository.findById(id).orElseThrow(() -> new ResourseNotFound("NO STUDENT FOUND BY ID:" + id));
        return mapper.map(std, StudentDTO.class);
        // return repository.findById(id);
    }

    public String deleteStudent(Integer id) throws ResourseNotFound {
        Student std = repository.findById(id).orElseThrow(() -> new ResourseNotFound("NO STUDENT FOUND BY ID:" + id));
        repository.delete(std);
        return "Deleted Sucessfully";

        // return repository.findById(id)
        // .map(student -> {
        // repository.deleteById(id);
        // return "Deleted Successfully";
        // })
        // .orElse("Not found");
    }

    public String updateStudent(Integer id, Student entity) throws ResourseNotFound {
        Student std = repository.findById(id).orElseThrow(() -> new ResourseNotFound("NO STUDENT FOUND BY ID:" + id));
        std.setName(entity.getName());
        std.setEmail(entity.getEmail());
        std.setDepartment(entity.getDepartment());
        repository.save(std);
        return "updated sucessfully Sucessfully";
    }

    public StudentDTO saveentity(Student entity) {
        Student saved = repository.save(entity);
        return mapper.map(saved, StudentDTO.class);
    }

    public Student getStudentbyID(String emailid) throws ResourseNotFound {
        Student std = repository.findByEmail(emailid)
                .orElseThrow(() -> new ResourseNotFound("Student Doesnot Exist with " + emailid));
        return std;
    }

    public List<StudentDTO> getlistdept(String dept) {
        List<Student> stds = repository.findByDepartment(dept);
        List<StudentDTO> dtos = new ArrayList<>();
        for (Student student : stds) {
            dtos.add(mapper.map(student, StudentDTO.class));
        }
        return dtos;
    }

    public List<StudentDTO> getbyPagiantion(Integer page, Integer size) {
        Pageable pages = PageRequest.of(page, size);
        List<Student> stds = repository.findAll(pages).getContent();
        List<StudentDTO> dtos = new ArrayList<>();
        for (Student student : stds) {
            dtos.add(mapper.map(student, StudentDTO.class));
        }
        return dtos;
    }
}
