package com.siva.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siva.student.model.Student;
import com.siva.student.service.StudentServiceImpl;

@Controller
public class ControllerStudent {

	@Autowired
	private StudentServiceImpl service;

	//To display the home page
	@RequestMapping(value="/")
	public String displayHomePage() {
		return "index";
	}

	//This method will read from the database and return all the students
	@RequestMapping(value="displayStudents")
	public String getAllStudents(Model m) {
		List<Student> students = service.listAll();
		m.addAttribute("students", students);
		return "display";
	}

	//This method will return simply the add.jsp page
	@RequestMapping(value="addStudent")
	public String addStudent() {
		return "add";
	}

	//This method will handle the request when the add button is clicked in add.jsp page
	@RequestMapping(value="addStudentAction")
	public String addStudentToTable(@ModelAttribute Student student) {
		service.insertStudent(student);
		return "index";
	}

	//This method will return simply the edit.jsp page
	@RequestMapping(value="editStudent")
	public String editStudent() {
		return "edit";
	}

}
