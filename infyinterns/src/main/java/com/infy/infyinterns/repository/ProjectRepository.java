
package com.infy.infyinterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.infyinterns.entity.Project;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}