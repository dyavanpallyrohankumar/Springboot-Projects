package com.infy.infyinterns.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;
    private String projectName, ideaOwner;
    private LocalDate releaseDate;
    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    public Project(String projectName, String ideaOwner, LocalDate releaseDate, Mentor mentor) {
        this.projectName = projectName;
        this.ideaOwner = ideaOwner;
        this.releaseDate = releaseDate;
        this.mentor = mentor;
    }

    public Project() {
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
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", ideaOwner=" + ideaOwner
                + ", releaseDate=" + releaseDate + ", mentor=" + mentor + "]";
    }

}