package com.infy.infyinterns.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infy.infyinterns.entity.Intern;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface InternRepository extends JpaRepository<Intern, Integer> {

    Optional<Intern> findByEmail(String email);

}
