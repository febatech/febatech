package com.feba.daily.status.report;

import java.security.InvalidParameterException;
import java.util.Date;


public class PlanTracker {
	
	private Date startDate;
	private Date endDate;
	private int percentage;
	
	public PlanTracker(Date startDate, Date endDate, int percentage){
		this.setEndDate(endDate);
		this.setStartDate(startDate);
		this.setPercentage(percentage);
	}

	public Date getStartDate() {
		return startDate;
	}

	private void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	private void setEndDate(Date endDate) {
		if(this.startDate.before(endDate)){
			throw new InvalidParameterException("End Date shld always be after start Date");
		}
		this.endDate = endDate;
	}

	public int getPercentage() {
		return percentage;
	}

	private void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	
}
