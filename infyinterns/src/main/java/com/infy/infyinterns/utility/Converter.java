// package com.infy.infyinterns.utility;

// import com.infy.infyinterns.dto.InternDTO;
// import com.infy.infyinterns.dto.MentorDTO;
// import com.infy.infyinterns.dto.ProjectDTO;
// import com.infy.infyinterns.entity.Intern;
// import com.infy.infyinterns.entity.Mentor;
// import com.infy.infyinterns.entity.Project;

// public class Converter {
// public Intern convertDTOtoEntity(InternDTO dto) {
// return new Intern(dto.getName(), dto.getEmail(), dto.getPhone(),
// dto.getCollege(), dto.getMentorDTO());
// }

// public InternDTO convertEntitytoDTO(Intern entity) {

// }

// public Mentor convertDTOToEntity(MentorDTO dto) {
// return new
// Mentor(dto.getMentorName(),dto.getNumberOfProjectsMentored(),dto.getInterns());
// }

// public MentorDTO convertEntityToDTO(Mentor entity) {
// return new MentorDTO(entity.getMentorId(), entity.getMentorName(),
// entity.getNumberOfProjectsMentored(), entity.getInterns());
// }

// public Project convert_ProjectDTO_to_ProjectEntity(ProjectDTO dto) {
// return new Project(dto.getProjectName(), dto.getIdeaOwner(),
// dto.getReleaseDate(), dto.getMentor());
// }

// public ProjectDTO convert_ProjectEntity_to_ProjectDTO(Project entity) {
// return new ProjectDTO(entity.getProjectId(), entity.getProjectName(),
// entity.getIdeaOwner(),
// entity.getReleaseDate(), entity.getMentor());
// }
// }
