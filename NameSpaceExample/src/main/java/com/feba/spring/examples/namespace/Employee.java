package com.feba.spring.examples.namespace;

public class Employee {
	
	private String employeeNo;
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	private String employeeName;
	private Department department;
	
	@Override
	public String toString(){
		return "Employee [ No :"+this.employeeNo+", Name : "+this.employeeName+", "
				+ "Department : "+this.department.toString()+"]";
	}
}
