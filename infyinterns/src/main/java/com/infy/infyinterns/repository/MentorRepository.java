package com.infy.infyinterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.infyinterns.entity.Mentor;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface MentorRepository extends JpaRepository<Mentor, Integer> {

}
