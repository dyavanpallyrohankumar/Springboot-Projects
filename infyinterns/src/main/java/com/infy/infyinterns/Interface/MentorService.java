package com.infy.infyinterns.Interface;

import java.util.List;
// import java.util.Optional;
// import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.entity.Mentor;
// import com.infy.infyinterns.exception.WithSameEmail;

public interface MentorService {
    // MentorDTO createMentor(Mentor intern) throws WithSameEmail;

    // List<MentorDTO> getAllMentors();

    // Optional<MentorDTO> getMentorById(Integer id);

    // Optional<MentorDTO> updateMentor(Integer id, MentorDTO intern);

    // String deleteMentor(Integer id);

    Mentor createMentor(Mentor mentor);

    List<Mentor> getAllMentors();

}