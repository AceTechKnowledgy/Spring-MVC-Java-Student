package com.siva.student.service;

import java.util.List;

import com.siva.student.model.Student;

public interface StudentService {
	
	List<Student> listAll();
	
	void insertStudent(Student student);
	
	Student findByRollNo(String rollNo);
	
	void updateStudent(Student student);
	
	void removeStudent(String rollNo);
	
}