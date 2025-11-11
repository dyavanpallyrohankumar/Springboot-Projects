package com.infy.infyinterns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.infyinterns.Interface.InternService;
import com.infy.infyinterns.dto.InternDTO;
import com.infy.infyinterns.entity.Intern;
import com.infy.infyinterns.entity.Mentor;
import com.infy.infyinterns.entity.Project;
import com.infy.infyinterns.exception.NotFoundException;
import com.infy.infyinterns.exception.WithSameEmail;
import com.infy.infyinterns.repository.InternRepository;
import com.infy.infyinterns.repository.MentorRepository;
import com.infy.infyinterns.repository.ProjectRepository;

@Service
public class InternServiceImp implements InternService {

    @Autowired
    InternRepository irepository;

    @Autowired
    MentorRepository mrepository;

    @Autowired
    ProjectRepository prepository;

    @Override
    public Intern createIntern(Intern intern, Integer mentorId, Integer projectId) {
        Mentor mentor = mrepository.findById(mentorId).orElseThrow(() -> new RuntimeException("Mentor Not found"));
        Project project = prepository.findById(projectId).orElseThrow(() -> new RuntimeException("project Not found"));
        intern.setMentor(mentor);
        intern.setProject(project);
        return irepository.save(intern);
    }

    @Override
    public List<Intern> getAllInterns() {

        return irepository.findAll();
    }

    // @Override
    // public List<InternDTO> getAllInterns() {
    // List<InternDTO> inters = new ArrayList<>();
    // for (Intern internsdto : repository.findAll()) {
    // inters.add(new InternDTO(internsdto.getInternId(), internsdto.getName(),
    // internsdto.getEmail(),
    // internsdto.getPhone(), internsdto.getCollege(), in));
    // }
    // return inters;
    // }

    // @Override
    // public InternDTO createIntern(Intern intern) throws WithSameEmail {
    // Optional<Intern> find = repository.findByEmail(intern.getEmail());
    // if (find.isPresent()) {
    // throw new WithSameEmail("Alredy eamil exist");
    // }
    // Intern saved = repository.save(intern);
    // return new InternDTO(saved.getInternId(), saved.getName(), saved.getEmail(),
    // saved.getPhone(),
    // saved.getCollege());
    // }

    // @Override
    // public Optional<InternDTO> getInternById(Integer id) {
    // Optional<Intern> intern = repository.findById(id);
    // if (intern.isPresent()) {
    // return Optional
    // .of(new InternDTO(intern.get().getInternId(), intern.get().getName(),
    // intern.get().getEmail(),
    // intern.get().getPhone(), intern.get().getCollege()));
    // }
    // return intern.empty();
    // }

    // @Override
    // public Optional<InternDTO> updateIntern(Integer id, InternDTO intern) {
    // Optional<Intern> option = repository.findById(id);
    // if (option.isPresent()) {
    // option.get().setName(intern.getName());
    // option.get().setEmail(intern.getEmail());
    // option.get().setPhone(intern.getPhone());
    // option.get().setCollege(intern.getCollege());
    // return Optional
    // .of(new InternDTO(
    // option.get().getInternId(),
    // option.get().getName(),
    // option.get().getEmail(),
    // option.get().getPhone(),
    // option.get().getCollege()));
    // }
    // return option.empty();
    // }

    // @Override
    // public String deleteIntern(Integer id) {
    // Optional<Intern> option = repository.findById(id);
    // if (option.isPresent()) {
    // repository.delete(option.get());
    // return "Intern Deleted Succesfully";
    // }
    // return "ID not Found";
    // }

    // public Optional<InternDTO> getInternByEmail(String email) throws
    // NotFoundException {
    // Optional<Intern> entity = repository.findByEmail(email);

    // if (entity.isPresent()) {
    // return Optional.of(new InternDTO(
    // entity.get().getInternId(),
    // entity.get().getName(),
    // entity.get().getEmail(),
    // entity.get().getPhone(),
    // entity.get().getCollege()));
    // }
    // throw new NotFoundException("Not Found");
    // }

}
