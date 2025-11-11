package com.infy.infyinterns.service;

// import java.util.ArrayList;
import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.infyinterns.Interface.MentorService;
// import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.entity.Mentor;
// import com.infy.infyinterns.exception.WithSameEmail;
import com.infy.infyinterns.repository.MentorRepository;

@Service
public class MentorServiceImp implements MentorService {
    @Autowired
    MentorRepository mrepository;

    @Override
    public Mentor createMentor(Mentor mentor) {
        if (mentor == null)
            throw new RuntimeException();
        return mrepository.save(mentor);
    }

    @Override
    public List<Mentor> getAllMentors() {
        return mrepository.findAll();
    }

    // @Override
    // public MentorDTO createMentor(Mentor mentor) throws WithSameEmail {
    // Mentor saved = repository.save(mentor);
    // System.out.println(mentor);
    // return convertEntityToDTO(saved);
    // }

    // @Override
    // public List<MentorDTO> getAllMentors() {
    // List<Mentor> entitys = repository.findAll();
    // List<MentorDTO> dtos = new ArrayList<>();
    // for (Mentor mentor : entitys) {
    // dtos.add(convertEntityToDTO(mentor));
    // }
    // return dtos;
    // }

    // @Override
    // public Optional<MentorDTO> getMentorById(Integer id) {
    // Optional<Mentor> entity = repository.findById(id);
    // if (entity.isPresent()) {
    // return Optional.of(convertEntityToDTO(entity.get()));
    // }
    // return entity.empty();
    // }

    // @Override
    // public Optional<MentorDTO> updateMentor(Integer id, MentorDTO mentor) {
    // Optional<Mentor> entity = repository.findById(id);
    // if (entity.isPresent()) {
    // entity.get().setMentorName(mentor.getMentorName());
    // entity.get().setNumberOfProjectsMentored(mentor.getNumberOfProjectsMentored());
    // return Optional.of(convertEntityToDTO(entity.get()));
    // }
    // return entity.empty();
    // }

    // @Override
    // public String deleteMentor(Integer id) {
    // Optional<Mentor> entity = repository.findById(id);
    // if (entity.isPresent()) {
    // repository.delete(entity.get());
    // return "Mentor Deleted Sucesfully";
    // }
    // return "Mentor not found";
    // }

}
