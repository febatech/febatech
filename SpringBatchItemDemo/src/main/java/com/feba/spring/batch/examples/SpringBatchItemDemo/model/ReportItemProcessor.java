package com.feba.spring.batch.examples.SpringBatchItemDemo.model;

import org.springframework.batch.item.ItemProcessor;

public class ReportItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		Report report = new Report();
		report.setStudentId(item.getStudentId());
		report.setStudentName(item.getStudentName().toUpperCase());
		report.setCourse(item.getCourse().toUpperCase());
		report.setDepartment(item.getDepartment().toLowerCase());
		return report;
	}

}
