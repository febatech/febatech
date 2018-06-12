package com.feba.spring.examples.namespace;

import java.util.Date;

public class Department {
	
	
	private String departmentNo;
	private String departmentName;
	private Date departmentStartDate; 
	
	public Department(String deptNo, String deptName, Date deptSDate){
		this.departmentNo = deptNo;
		this.departmentName= deptName;
		this.departmentStartDate = deptSDate;
	}
	
	@Override
	public String toString(){
		return "Department [ No : "+this.departmentNo+", Name : "+this.departmentName+
				", Start Date : "+this.departmentStartDate+"]";
	}

}
