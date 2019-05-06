package com.siva.student.dao;

import java.util.List;

import com.siva.student.model.Student;

public interface StudentDao {

	List<Student> getStudents();
	
	void insertStudent(Student student);
}