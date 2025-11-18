package com.studentmanagement.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentmanagement.model.Student;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);

    List<Student> findByDepartment(String department);
}

// @Repository
// @Transactional
// public interface StudentRepository extends MongoRepository<Student, String> {
// Optional<Student> findByEmail(String email);
// List<Student> findByDepartment(String department);
// }