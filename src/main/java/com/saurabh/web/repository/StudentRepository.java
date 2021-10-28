package com.saurabh.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.web.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}