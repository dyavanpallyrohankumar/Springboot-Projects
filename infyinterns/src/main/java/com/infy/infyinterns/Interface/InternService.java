package com.infy.infyinterns.Interface;

import java.util.List;
import java.util.Optional;

import com.infy.infyinterns.dto.InternDTO;
import com.infy.infyinterns.entity.Intern;
import com.infy.infyinterns.exception.NotFoundException;
import com.infy.infyinterns.exception.WithSameEmail;

public interface InternService {
    // InternDTO createIntern(Intern intern) throws WithSameEmail;

    // List<InternDTO> getAllInterns();

    // Optional<InternDTO> getInternById(Integer id);

    // Optional<InternDTO> updateIntern(Integer id, InternDTO intern);

    // String deleteIntern(Integer id);

    // Optional<InternDTO> getInternByEmail(String email) throws NotFoundException;

    Intern createIntern(Intern intern, Integer mentorId, Integer projectId);

    List<Intern> getAllInterns();

}
