package com.infy.infyinterns.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_id", nullable = false)
    private Integer mentorId;
    @Column(name = "mentor_name", nullable = false)
    private String mentorName;
    private Integer numberOfProjectsMentored;
    // @OneToMany
    // @JoinColumn(name = "intern_id")
    // private List<Intern> interns;

    public Mentor(String mentorName, Integer numberOfProjectsMentored) {
        this.numberOfProjectsMentored = numberOfProjectsMentored;
        this.mentorName = mentorName;
        // this.interns = interns;
    }

    public Mentor() {
    }

    public Integer getMentorId() {
        return mentorId;
    }

    public void setMentorId(Integer mentorId) {
        this.mentorId = mentorId;
    }

    public Integer getNumberOfProjectsMentored() {
        return numberOfProjectsMentored;
    }

    public void setNumberOfProjectsMentored(Integer numberOfProjectsMentored) {
        this.numberOfProjectsMentored = numberOfProjectsMentored;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    // public List<Intern> getInterns() {
    // return interns;
    // }

    // public void setInterns(List<Intern> interns) {
    // this.interns = interns;
    // }

    @Override
    public String toString() {
        return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + ", numberOfProjectsMentored="
                + numberOfProjectsMentored + "]";
    }

}
