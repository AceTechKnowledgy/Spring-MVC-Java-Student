package com.siva.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.student.dao.StudentDaoImpl;
import com.siva.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl employeeDaoImpl;
	
	//Service method to get all the students
	@Override
	public List<Student> listAll() {
		return employeeDaoImpl.getStudents();
	}

	@Override
	public void insertStudent(Student student) {
		employeeDaoImpl.insertStudent(student);		
	}

	
}
