package com.infy.infyinterns.dto;

public class InternDTO {
    private Integer internId, phone;
    private String name, email, college;
    private MentorDTO mentorDTO;

    public InternDTO(Integer internId, String name, String email, Integer phone, String college, MentorDTO mentorDTO) {
        this.internId = internId;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.college = college;
        this.mentorDTO = mentorDTO;
    }

    public Integer getInternId() {
        return internId;
    }

    public void setInternId(Integer internId) {
        this.internId = internId;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public MentorDTO getMentorDTO() {
        return mentorDTO;
    }

    public void setMentorDTO(MentorDTO mentorDTO) {
        this.mentorDTO = mentorDTO;
    }

    @Override
    public String toString() {
        return "InternDTO [internId=" + internId + ", phone=" + phone + ", name=" + name + ", email=" + email
                + ", college=" + college + ", mentorDTO=" + mentorDTO + "]";
    }

}
