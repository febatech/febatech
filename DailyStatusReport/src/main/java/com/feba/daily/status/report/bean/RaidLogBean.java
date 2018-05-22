package com.feba.daily.status.report.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RaidLogBean
{
	private long id;
	
	private String type;
	
	private String impactedApp;
	
	private String description;
	
	private String status;
	
	private String portfolioManager;
	
	private String radiOwner;
	
	private String rag;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateLogged;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date targetClosureDate;
	
	private String age;
	
	private String mileStoneImpacted;
	
	private String raidBackToGreenPlan;
	
	private Date insertedDate;
	
	private Date modifiedDate;
	
	private boolean isEnabled;
	
	private boolean isDeleted;
	

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	/*public long getDailyStatusReportId()
	{
		return dailyStatusReportId;
	}

	public void setDailyStatusReportId(long dailyStatusReportId)
	{
		this.dailyStatusReportId = dailyStatusReportId;
	}*/

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getImpactedApp()
	{
		return impactedApp;
	}

	public void setImpactedApp(String impactedApp)
	{
		this.impactedApp = impactedApp;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getPortfolioManager()
	{
		return portfolioManager;
	}

	public void setPortfolioManager(String portfolioManager)
	{
		this.portfolioManager = portfolioManager;
	}

	public String getRadiOwner()
	{
		return radiOwner;
	}

	public void setRadiOwner(String radiOwner)
	{
		this.radiOwner = radiOwner;
	}

	public String getRag()
	{
		return rag;
	}

	public void setRag(String rag)
	{
		this.rag = rag;
	}

	public Date getDateLogged()
	{
		return dateLogged;
	}

	public void setDateLogged(Date dateLogged)
	{
		this.dateLogged = dateLogged;
	}

	public Date getTargetClosureDate()
	{
		return targetClosureDate;
	}

	public void setTargetClosureDate(Date targetClosureDate)
	{
		this.targetClosureDate = targetClosureDate;
	}

	public String getAge()
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getMileStoneImpacted()
	{
		return mileStoneImpacted;
	}

	public void setMileStoneImpacted(String mileStoneImpacted)
	{
		this.mileStoneImpacted = mileStoneImpacted;
	}

	public String getRaidBackToGreenPlan()
	{
		return raidBackToGreenPlan;
	}

	public void setRaidBackToGreenPlan(String raidBackToGreenPlan)
	{
		this.raidBackToGreenPlan = raidBackToGreenPlan;
	}

	public Date getInsertedDate()
	{
		return insertedDate;
	}

	public void setInsertedDate(Date insertedDate)
	{
		this.insertedDate = insertedDate;
	}

	public Date getModifiedDate()
	{
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}

	public boolean isEnabled()
	{
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled)
	{
		this.isEnabled = isEnabled;
	}

	public boolean isDeleted()
	{
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted)
	{
		this.isDeleted = isDeleted;
	}

	
}
