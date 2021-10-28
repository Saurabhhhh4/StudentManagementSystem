package com.saurabh.web.service;

import java.util.List;

import com.saurabh.web.entity.Student;


public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}