package com.feba.spring.batch.examples.SpringBatchItemDemo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.feba.spring.batch.examples.SpringBatchItemDemo.model.Report;

public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	public ReportFieldSetMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		Report report = new Report();
		report.setStudentId(fieldSet.readLong(0));
		report.setStudentName(fieldSet.readString(1));
		report.setCourse(fieldSet.readString(2));
		report.setDepartment(fieldSet.readString(3));
		return report;
	}

}
