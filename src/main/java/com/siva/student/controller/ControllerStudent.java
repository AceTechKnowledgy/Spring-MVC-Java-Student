package com.siva.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	//This method will handle the request when the "Add" button is clicked in add.jsp page
	@RequestMapping(value="addStudentAction")
	public String addStudentToTable(@ModelAttribute Student student) {
		service.insertStudent(student);
		return "redirect:displayStudents";
	}

	//This method will return the edit.jsp page with the rollNo passed and populate the student data
	@RequestMapping(value="editStudent")
	public ModelAndView editStudent(@RequestParam("rollNo") String rollNo) {
		ModelAndView mav = new ModelAndView();
		Student student = service.findByRollNo(rollNo);
		mav.setViewName("edit");
		mav.addObject("student", student);
		return mav;
	}
	
	//This method will be called when the user pressed the "Update" button in edit.jsp page
	@RequestMapping(value="editStudentAction")
	public String updateStudent(@ModelAttribute Student student) {
		service.updateStudent(student);
		return "redirect:displayStudents";
	}

}
