package com.feba.springboot.jdbc.example.springbootJDBCapplication;

public class Student {
	
	private long studentId;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	private String studentName;
	private String course;
	private String department;
	
	@Override
	public String toString() {
		return "Student Information :: id="+studentId+" Name="+studentName+" Course="+course+" Department="+department;
	}

}
