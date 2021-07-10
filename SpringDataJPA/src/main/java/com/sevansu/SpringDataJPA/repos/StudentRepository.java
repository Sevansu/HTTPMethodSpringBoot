package com.sevansu.SpringDataJPA.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevansu.SpringDataJPA.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
