package com.feba.springboot.jdbc.example.springbootJDBCapplication;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudentId(rs.getLong("STUD_ID"));
		student.setStudentName(rs.getString("NAME"));
		student.setDepartment(rs.getString("DEPARTMENT"));
		student.setCourse(rs.getString("COURSE"));
		return student;
	}

}
