package com.infy.infyinterns.Interface;

import java.util.List;

import com.infy.infyinterns.entity.Project;

public interface ProjectService {
    Project createProject(Project project, Integer mentorid);

    List<Project> getAllProjects();
}