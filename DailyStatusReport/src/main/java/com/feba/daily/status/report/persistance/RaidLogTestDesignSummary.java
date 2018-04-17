package com.feba.daily.status.report.persistance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RAID_LOG_TEST_DESIGN_SUMMARY")
public class RaidLogTestDesignSummary
{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "IMPACTED_APP")
	private String impactedApp;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "PORTFOLIO_MANAGER")
	private String portfolioManager;
	
	@Column(name = "RAID_OWNER")
	private String radiOwner;
	
	@Column(name = "RAG")
	private String rag;
	
	@Column(name = "DATE_LOGGED")
	private Date dateLogged;
	
	@Column(name = "TARGET_COLOSURE_DATE")
	private Date targetClosureDate;
	
	@Column(name = "AGE")
	private String age;
	
	@Column(name = "MILESTONE_IMPACTED")
	private String mileStoneImpacted;
	
	@Column(name = "RAID_BACK_TO_GREEN_PLAN")
	private String raidBackToGreenPlan;
	
	@Column(name = "APPLICATION_TRACK_CD_TOTAL")
	private String applicationTrackCdTotal;
	
	@Column(name = "APPLICATION_TRACK_CD_IN_PROGRESS")
	private String applicationTrackCdInProgress;
	
	@Column(name = "APPLICATION_TRACKK_CD_ON_HOLD")
	private String applicationTrackCdOnHold;
	
	@Column(name = "APPLICATION_TRACK_CD_COMPLETED")
	private String applicationTrackCdCompleted;
	
	@Column(name = "APPLICATION_TRACK_STATE_STREET_TOTAL")
	private String applicationTrackStateStreetTotal;
	
	@Column(name = "APPLICATION_TRACK_STATE_STREET_IN_PROGRESS")
	private String applicationTrackStateStreetInProgress;
	
	@Column(name = "APPLICATION_TRACK_STATE_STREET_ON_HOLD")
	private String applicationTrackStateStreetOnHold;
	
	@Column(name = "APPLICATION_TRACK_STATE_STREET_COMPLETED")
	private String applicationTrackStateStreetCompleted;
	
	@Column(name = "APPLICATION_TRACK_SHARED_SERVICES_TOTAL")
	private String applicationTrackSharedServicesTotal;
	
	@Column(name = "APPLICATION_TRACK_SHARED_SERVICES_IN_PROGRESS")
	private String applicationTrackSharedServicesInProgress;
	
	@Column(name = "APPLICATION_TRACK_SHARED_SERVICES_ON_HOLD")
	private String applicationTrackSharedServicesOnHold;
	
	@Column(name = "APPLICATION_TRACK_SHARED_SERVICES_COMPLETED")
	private String applicationTrackSharedServicesCompleted;
	
	@Column(name = "APPLICATION_TRACK_CITI_CONNECTION_TOTAL")
	private String applicationTrackCitiConnectTotal;
	
	@Column(name = "APPLICATION_TRACK_CITI_CONNECTION_IN_PROGRESS")
	private String applicationTrackCitiConnectInProgress;
	
	@Column(name = "APPLICATION_TRACK_CITI_CONNECTION_ON_HOLD")
	private String applicationTrackCitiConnectOnHold;
	
	@Column(name = "APPLICATION_TRACK_CITI_CONNECTION_COMPLETED")
	private String applicationTrackCitiConnectCompleted;
	
	@Column(name = "INSERTED_DATE")
	private Date insertedDate;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name = "IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name = "IS_DELTED")
	private boolean isDeleted;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

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

	public String getApplicationTrackCdTotal()
	{
		return applicationTrackCdTotal;
	}

	public void setApplicationTrackCdTotal(String applicationTrackCdTotal)
	{
		this.applicationTrackCdTotal = applicationTrackCdTotal;
	}

	public String getApplicationTrackCdInProgress()
	{
		return applicationTrackCdInProgress;
	}

	public void setApplicationTrackCdInProgress(String applicationTrackCdInProgress)
	{
		this.applicationTrackCdInProgress = applicationTrackCdInProgress;
	}

	public String getApplicationTrackCdOnHold()
	{
		return applicationTrackCdOnHold;
	}

	public void setApplicationTrackCdOnHold(String applicationTrackCdOnHold)
	{
		this.applicationTrackCdOnHold = applicationTrackCdOnHold;
	}

	public String getApplicationTrackCdCompleted()
	{
		return applicationTrackCdCompleted;
	}

	public void setApplicationTrackCdCompleted(String applicationTrackCdCompleted)
	{
		this.applicationTrackCdCompleted = applicationTrackCdCompleted;
	}

	public String getApplicationTrackStateStreetTotal()
	{
		return applicationTrackStateStreetTotal;
	}

	public void setApplicationTrackStateStreetTotal(String applicationTrackStateStreetTotal)
	{
		this.applicationTrackStateStreetTotal = applicationTrackStateStreetTotal;
	}

	public String getApplicationTrackStateStreetInProgress()
	{
		return applicationTrackStateStreetInProgress;
	}

	public void setApplicationTrackStateStreetInProgress(String applicationTrackStateStreetInProgress)
	{
		this.applicationTrackStateStreetInProgress = applicationTrackStateStreetInProgress;
	}

	public String getApplicationTrackStateStreetOnHold()
	{
		return applicationTrackStateStreetOnHold;
	}

	public void setApplicationTrackStateStreetOnHold(String applicationTrackStateStreetOnHold)
	{
		this.applicationTrackStateStreetOnHold = applicationTrackStateStreetOnHold;
	}

	public String getApplicationTrackStateStreetCompleted()
	{
		return applicationTrackStateStreetCompleted;
	}

	public void setApplicationTrackStateStreetCompleted(String applicationTrackStateStreetCompleted)
	{
		this.applicationTrackStateStreetCompleted = applicationTrackStateStreetCompleted;
	}

	public String getApplicationTrackSharedServicesTotal()
	{
		return applicationTrackSharedServicesTotal;
	}

	public void setApplicationTrackSharedServicesTotal(String applicationTrackSharedServicesTotal)
	{
		this.applicationTrackSharedServicesTotal = applicationTrackSharedServicesTotal;
	}

	public String getApplicationTrackSharedServicesInProgress()
	{
		return applicationTrackSharedServicesInProgress;
	}

	public void setApplicationTrackSharedServicesInProgress(String applicationTrackSharedServicesInProgress)
	{
		this.applicationTrackSharedServicesInProgress = applicationTrackSharedServicesInProgress;
	}

	public String getApplicationTrackSharedServicesOnHold()
	{
		return applicationTrackSharedServicesOnHold;
	}

	public void setApplicationTrackSharedServicesOnHold(String applicationTrackSharedServicesOnHold)
	{
		this.applicationTrackSharedServicesOnHold = applicationTrackSharedServicesOnHold;
	}

	public String getApplicationTrackSharedServicesCompleted()
	{
		return applicationTrackSharedServicesCompleted;
	}

	public void setApplicationTrackSharedServicesCompleted(String applicationTrackSharedServicesCompleted)
	{
		this.applicationTrackSharedServicesCompleted = applicationTrackSharedServicesCompleted;
	}

	public String getApplicationTrackCitiConnectTotal()
	{
		return applicationTrackCitiConnectTotal;
	}

	public void setApplicationTrackCitiConnectTotal(String applicationTrackCitiConnectTotal)
	{
		this.applicationTrackCitiConnectTotal = applicationTrackCitiConnectTotal;
	}

	public String getApplicationTrackCitiConnectInProgress()
	{
		return applicationTrackCitiConnectInProgress;
	}

	public void setApplicationTrackCitiConnectInProgress(String applicationTrackCitiConnectInProgress)
	{
		this.applicationTrackCitiConnectInProgress = applicationTrackCitiConnectInProgress;
	}

	public String getApplicationTrackCitiConnectOnHold()
	{
		return applicationTrackCitiConnectOnHold;
	}

	public void setApplicationTrackCitiConnectOnHold(String applicationTrackCitiConnectOnHold)
	{
		this.applicationTrackCitiConnectOnHold = applicationTrackCitiConnectOnHold;
	}

	public String getApplicationTrackCitiConnectCompleted()
	{
		return applicationTrackCitiConnectCompleted;
	}

	public void setApplicationTrackCitiConnectCompleted(String applicationTrackCitiConnectCompleted)
	{
		this.applicationTrackCitiConnectCompleted = applicationTrackCitiConnectCompleted;
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
