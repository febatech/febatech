package com.feba.daily.status.report;

import java.util.Date;

public class RaidLog {
	private String  type;
	private String impactedApp;
	private String description;
	private String status;
	private String portfolioManager;
	private ExecutiveSummary owner;
	private String rag;
	private Date dateLogged;
	private Date targetClosureDt;
	private int age;
	private String mileStoneImpacted;
	private String backToGreenPlan;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImpactedApp() {
		return impactedApp;
	}
	public void setImpactedApp(String impactedApp) {
		this.impactedApp = impactedApp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPortfolioManager() {
		return portfolioManager;
	}
	public void setPortfolioManager(String portfolioManager) {
		this.portfolioManager = portfolioManager;
	}
	public ExecutiveSummary getOwner() {
		return owner;
	}
	public void setOwner(ExecutiveSummary owner) {
		this.owner = owner;
	}
	public String getRag() {
		return rag;
	}
	public void setRag(String rag) {
		this.rag = rag;
	}
	public Date getDateLogged() {
		return dateLogged;
	}
	public void setDateLogged(Date dateLogged) {
		this.dateLogged = dateLogged;
	}
	public Date getTargetClosureDt() {
		return targetClosureDt;
	}
	public void setTargetClosureDt(Date targetClosureDt) {
		this.targetClosureDt = targetClosureDt;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMileStoneImpacted() {
		return mileStoneImpacted;
	}
	public void setMileStoneImpacted(String mileStoneImpacted) {
		this.mileStoneImpacted = mileStoneImpacted;
	}
	public String getBackToGreenPlan() {
		return backToGreenPlan;
	}
	public void setBackToGreenPlan(String backToGreenPlan) {
		this.backToGreenPlan = backToGreenPlan;
	}
	
	

}
