package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Faculty;


public interface FacultyRepository extends JpaRepository<Faculty, Integer>{

}
