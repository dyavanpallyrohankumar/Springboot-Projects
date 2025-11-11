package com.infy.infyinterns.dto;

import java.util.List;

public class MentorDTO {
    private Integer mentorId, numberOfProjectsMentored;
    private String mentorName;
    private List<InternDTO> interns;

    public MentorDTO(Integer mentorId, String mentorName, Integer numberOfProjectsMentored, List<InternDTO> interns) {
        this.mentorId = mentorId;
        this.numberOfProjectsMentored = numberOfProjectsMentored;
        this.mentorName = mentorName;
        this.interns = interns;
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

    public List<InternDTO> getInterns() {
        return interns;
    }

    public void setInterns(List<InternDTO> interns) {
        this.interns = interns;
    }

    @Override
    public String toString() {
        return "MentorDTO [mentorId=" + mentorId + ", numberOfProjectsMentored=" + numberOfProjectsMentored
                + ", mentorName=" + mentorName + ", interns=" + interns + "]";
    }

}
