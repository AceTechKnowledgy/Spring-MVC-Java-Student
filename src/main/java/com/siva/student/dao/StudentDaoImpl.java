package com.siva.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.siva.student.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Method to get the list of students from the table
	@Override
	public List<Student> getStudents() {
		String query = "select * from student";
		return jdbcTemplate.queryForObject(query, new ListAll());
	}

	//Method to isert into the table
	@Override
	public void insertStudent(Student student) {
		String query = "insert into student values(?,?,?)";
		jdbcTemplate.update(query, student.getRollNo(), student.getName(), student.getStandard());	
	}

}

//Class for Rowmapper to get all the students
class ListAll implements RowMapper<List<Student>> {

	List<Student> students = new ArrayList<>();
	
	@Override
	public List<Student> mapRow(ResultSet rs, int rowNum) throws SQLException {
		do {
			Student student = new Student();
			student.setRollNo(rs.getInt("rollNo"));
			student.setName(rs.getString("name"));
			student.setStandard(rs.getString("standard"));
			
			students.add(student);
			
		} while (rs.next());
		
		return students;
	}
	
}