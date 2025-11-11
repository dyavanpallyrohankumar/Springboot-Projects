package com.infy.infyinterns.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.entity.Mentor;
// import com.infy.infyinterns.exception.WithSameEmail;
import com.infy.infyinterns.service.MentorServiceImp;

import java.util.List;
// import java.util.Optional;
// 
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/mentor")
public class MentorsController {

    @Autowired
    MentorServiceImp implemntation;

    @PostMapping
    public Mentor save(@RequestBody Mentor entity) {
        return implemntation.createMentor(entity);
    }

    @GetMapping
    public List<Mentor> getall() {
        return implemntation.getAllMentors();
    }

    // @PostMapping
    // public MentorDTO save(@RequestBody Mentor intern) throws WithSameEmail {
    // return implemntation.createMentor(intern);
    // }

    // @GetMapping
    // public List<MentorDTO> getallMentors() {
    // return implemntation.getAllMentors();
    // }

    // @GetMapping("/search")
    // public Optional<MentorDTO> getMethodName(@RequestParam Integer id) {
    // return implemntation.getMentorById(id);
    // }

    // @PutMapping("update/{id}")
    // public Optional<MentorDTO> putMethodName(@PathVariable Integer id,
    // @RequestBody MentorDTO entity) {
    // return implemntation.updateMentor(id, entity);
    // }

    // @DeleteMapping("/delete/{id}")
    // public String delete(@PathVariable Integer id) {
    // return implemntation.deleteMentor(id);
    // }

}
