package com.feba.springboot.jdbc.example.springbootJDBCapplication;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
@Named("dbaOperations")
public final class StudentDAO implements DatabaseOperations {
	
	private static final String INSERT_QUERY="INSERT INTO STUDENT(STUD_ID, NAME, DEPARTMENT, COURSE) values (?,?,?,?)";
	
	private static final String GET_DEPT_QUERY="SELECT DEPARTMENT FROM STUDENT WHERE STUD_ID = ?";
	
	private static final String GET_STUDENT="SELECT STUD_ID, NAME, DEPARTMENT, COURSE FROM STUDENT WHERE STUD_ID = ?";
	
	private static final String GET_ALL_STUDENTS="SELECT STUD_ID, NAME, DEPARTMENT, COURSE FROM STUDENT";
	
	private static final String UPDATE_QUERY="update student set name=?, DEPARTMENT=?, course=? where stud_id=?";
	
	private static final String DELETE_QUERY="delete from student where stud_id = ?";
	
	@Resource
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt= jt;
	}
	

	public int insert(Student student) {
		int result = jt.update(INSERT_QUERY, student.getStudentId(), student.getStudentName(), student.getDepartment(), student.getCourse());
		return result;
	}

	public String getDepartment(long studentId) {
		String result = jt.queryForObject(GET_DEPT_QUERY, String.class, studentId);
		return result;
	}

	public List<Student> listAllStudents(){
		List<Student> list = (List<Student>) jt.queryForObject(GET_ALL_STUDENTS, new StudentMapper());
		return list;
	}
	
	public Student getStudent(long studentId){
		
		Student student = jt.queryForObject(GET_STUDENT, new StudentMapper(), studentId);
		return student;
	}

	public int update(Student oldStudent, Student newStudent) {
		int result = jt.update(UPDATE_QUERY,  newStudent.getStudentName(), newStudent.getDepartment(), newStudent.getCourse(), oldStudent.getStudentId());
		return result;
	}

	public int deleteStudent(Student student) {
		int result = jt.update(DELETE_QUERY, student.getStudentId());
		return result;
	}

}
