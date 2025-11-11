package com.infy.infyinterns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.infyinterns.Interface.ProjectService;
import com.infy.infyinterns.entity.Mentor;
import com.infy.infyinterns.entity.Project;
import com.infy.infyinterns.repository.MentorRepository;
import com.infy.infyinterns.repository.ProjectRepository;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    ProjectRepository pRepository;

    @Autowired
    MentorRepository mRepository;

    @Override
    public Project createProject(Project project, Integer mentorid) {
        Mentor mentor = mRepository.findById(mentorid).orElseThrow(() -> new RuntimeException("mentor not foound"));
        project.setMentor(mentor);
        return pRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return pRepository.findAll();
    }

}