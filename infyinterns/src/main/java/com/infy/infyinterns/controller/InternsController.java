package com.infy.infyinterns.controller;

import org.springframework.web.bind.annotation.RestController;

// import com.infy.infyinterns.dto.InternDTO;
import com.infy.infyinterns.entity.Intern;
// import com.infy.infyinterns.entity.Mentor;
// import com.infy.infyinterns.entity.Project;
// import com.infy.infyinterns.exception.*;
import com.infy.infyinterns.service.InternServiceImp;

import java.util.List;

// import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/interns")
public class InternsController {

    @Autowired
    InternServiceImp implemntation;

    @PostMapping("/{mentor}/{project}")
    public Intern sending(@RequestBody Intern entity, @PathVariable Integer mentor, @PathVariable Integer project) {
        return implemntation.createIntern(entity, mentor, project);
    }

    @GetMapping
    public List<Intern> getallInterns() {
        return implemntation.getAllInterns();
    }

    // @PostMapping
    // public InternDTO save(@RequestBody Intern intern) throws WithSameEmail {
    // return implemntation.createIntern(intern);
    // }

    // @GetMapping
    // public List<InternDTO> getallInterns() {
    // return implemntation.getAllInterns();
    // }

    // @GetMapping("/search")
    // public Optional<InternDTO> getMethodName(@RequestParam Integer id) {
    // return implemntation.getInternById(id);
    // }

    // @PutMapping("update/{id}")
    // public Optional<InternDTO> putMethodName(@PathVariable Integer id,
    // @RequestBody InternDTO entity) {
    // return implemntation.updateIntern(id, entity);
    // }

    // @DeleteMapping("/delete/{id}")
    // public String delete(@PathVariable Integer id) {
    // return implemntation.deleteIntern(id);
    // }

    // @GetMapping("/")
    // public Optional<InternDTO> findEmail(@RequestParam String email) throws
    // NotFoundException {
    // return implemntation.getInternByEmail(email);
    // }

}
