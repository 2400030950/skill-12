package com.klef.skillexp12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.skillexp12.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}