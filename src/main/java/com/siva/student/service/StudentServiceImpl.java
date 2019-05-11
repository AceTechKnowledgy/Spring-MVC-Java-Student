package com.siva.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.student.dao.StudentDaoImpl;
import com.siva.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl studentDaoImpl;
	
	//Service method to get all the students
	@Override
	public List<Student> listAll() {
		return studentDaoImpl.getStudents();
	}

	@Override
	public void insertStudent(Student student) {
		studentDaoImpl.insertStudent(student);		
	}

	@Override
	public Student findByRollNo(String rollNo) {
		return studentDaoImpl.findStudentByRollNo(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		studentDaoImpl.updateStudentInTable(student);
	}

	@Override
	public void removeStudent(String rollNo) {
		studentDaoImpl.deleteStudent(rollNo);
	}

	
}
