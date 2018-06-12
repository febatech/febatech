package com.feba.springboot.jdbc.example.springbootJDBCapplication;
import javax.annotation.Resource;
import javax.inject.Named;
@Named("stuService")
public class DBOperationService {
	@Resource
	private DatabaseOperations dbaOperations;
	
	public void setDbaOperations(DatabaseOperations dbaOperations) {
		this.dbaOperations= dbaOperations;
	}
	
	public String registerStudent(Student student) {
		int result = dbaOperations.insert(student);
		if(result ==0 ) {
			return "Student registration failed!!!";
		}else {
			return "Student registration success!!!";
		}
	}
	public String deleteStudent(Student student) {
		int result = dbaOperations.deleteStudent(student);
		if(result ==0 ) {
			return "please enter studentID to delete!!!";
		}else {
			return "Deleted Student  successfully!!!";
		}
	}
	
	public Student getStudent(long studentId) {
		Student student = dbaOperations.getStudent(studentId);
		return student;
	}
}
