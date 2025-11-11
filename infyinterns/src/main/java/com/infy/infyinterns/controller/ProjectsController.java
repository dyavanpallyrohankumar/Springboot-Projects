package com.infy.infyinterns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.infyinterns.entity.Project;
import com.infy.infyinterns.service.ProjectServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/project")
public class ProjectsController {
    @Autowired
    ProjectServiceImp implementation;

    @GetMapping
    public List<Project> getMethodName() {
        return implementation.getAllProjects();
    }

    @PostMapping("/{mentorid}")
    public Project postMethodName(@RequestBody Project entity, @PathVariable Integer mentorid) {
        return implementation.createProject(entity, mentorid);
    }

}
