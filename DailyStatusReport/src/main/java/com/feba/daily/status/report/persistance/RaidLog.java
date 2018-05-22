package com.feba.daily.status.report.persistance;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RAID_LOG")
public class RaidLog
{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "IMPACTED_APPLICATION")
	private String impactedApp;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "PORTFOLIO_MANAGER")
	private String portfolioManager;
	
	@Column(name = "RADI_OWNER")
	private String radiOwner;
	
	@Column(name = "RAG")
	private String rag;
	
	@Column(name = "DATE_LOGGED")
	@Temporal(TemporalType.DATE)
	private Date dateLogged;
	
	@Column(name = "TARGET_CLOSURE_DATE")
	@Temporal(TemporalType.DATE)
	private Date targetClosureDate;
	
	@Column(name = "AGE")
	private String age;
	
	@Column(name = "MILE_STONE_IMPACTED")
	private String mileStoneImpacted;
	
	@Column(name = "BACK_TO_GREEN_PLAN")
	private String raidBackToGreenPlan;
	
	@Column(name = "INSERTED_DATE", updatable=false)
	@Temporal(TemporalType.DATE)
	private Date insertedDate;
	
	@Column(name = "MODIFIED_DATE")
	@Temporal(TemporalType.DATE)
	private Date modifiedDate;
	
	@Column(name = "IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name = "IS_DELTED")
	private boolean isDeleted;
//	
	@ManyToOne(cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_DAILY_STS_RPT_ID")
	private DailyStatusReportNFT dailyStatusReportNFT;

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

	public DailyStatusReportNFT getDailyStatusReportNFT()
	{
		return dailyStatusReportNFT;
	}

	public void setDailyStatusReportNFT(DailyStatusReportNFT dailyStatusReportNFT)
	{
		this.dailyStatusReportNFT = dailyStatusReportNFT;
	}
	
	
	
}
