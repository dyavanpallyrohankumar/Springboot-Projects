package com.infy.infyinterns.dto;

import java.time.LocalDate;

import com.infy.infyinterns.entity.Mentor;

public class ProjectDTO {

    private Integer projectId;
    private String projectName, ideaOwner;
    private LocalDate releaseDate;
    private Mentor mentor;

    public ProjectDTO(Integer projectId, String projectName, String ideaOwner, LocalDate releaseDate, Mentor mentor) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.ideaOwner = ideaOwner;
        this.releaseDate = releaseDate;
        this.mentor = mentor;

    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getIdeaOwner() {
        return ideaOwner;
    }

    public void setIdeaOwner(String ideaOwner) {
        this.ideaOwner = ideaOwner;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "ProjectDTO [projectId=" + projectId + ", projectName=" + projectName + ", ideaOwner=" + ideaOwner
                + ", releaseDate=" + releaseDate + ", mentor=" + mentor + "]";
    }

}
