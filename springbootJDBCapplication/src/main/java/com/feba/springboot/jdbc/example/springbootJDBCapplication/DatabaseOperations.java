package com.feba.springboot.jdbc.example.springbootJDBCapplication;

import java.util.List;
import java.util.Map;

import javax.inject.Named;
@Named("DBOperations")
public interface DatabaseOperations {
	
	public int insert(Student student);
	
	public String getDepartment(long studentId);
	
	public List<Student> listAllStudents() throws Exception;
	
	public int update(Student oldStudent, Student newStudent);
	
	public int deleteStudent(Student student);
	
	public Student getStudent(long studentId);

}
