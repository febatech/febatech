package com.feba.spring.batch.examples.SpringBatchItemDemo.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <xml>
 * <student id="1001">
 * 		<name>Suresh </name>
 * 		<course>Science</course>
 * 		<department>ScieneceDepart</department>
 * </student>
 */


@XmlRootElement(name="student")
public class Report {

	private long studentId;
	
	@XmlAttribute(name="id")
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	@XmlElement(name="name")
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@XmlElement(name="course")
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@XmlElement(name="department")
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

