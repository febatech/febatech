package com.feba.daily.status.report.persistance;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_DESIGN_SUMMARY")
public class TestDesignSummary
{

	@Id
	@GeneratedValue
	@Column(name = "TEST_DGN_SMRY_ID")
	private long id;
	
	@Column(name = "APPLICATION_TRACK_TYPE")
	private String applicationTrackType;
	
	@Column(name = "TOTAL")
	private long total;
	
	@Column(name = "IN_PROGRESS")
	private long inProgress;
	
	@Column(name = "ON_HOLD")
	private long onHold;
	
	@Column(name = "COMPLETED")
	private long completed;
	
	@Column(name = "INSERTED_DATE")
	private Date insertedDate;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name = "IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name = "IS_DELTED")
	private boolean isDeleted;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private DailyStatusReportNFT dailyStatusReportNFT;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getApplicationTrackType()
	{
		return applicationTrackType;
	}

	public void setApplicationTrackType(String applicationTrackType)
	{
		this.applicationTrackType = applicationTrackType;
	}

	public long getTotal()
	{
		return total;
	}

	public void setTotal(long total)
	{
		this.total = total;
	}

	public long getInProgress()
	{
		return inProgress;
	}

	public void setInProgress(long inProgress)
	{
		this.inProgress = inProgress;
	}

	public long getOnHold()
	{
		return onHold;
	}

	public void setOnHold(long onHold)
	{
		this.onHold = onHold;
	}

	public long getCompleted()
	{
		return completed;
	}

	public void setCompleted(long completed)
	{
		this.completed = completed;
	}

	public DailyStatusReportNFT getDailyStatusReportNFT()
	{
		return dailyStatusReportNFT;
	}

	public void setDailyStatusReportNFT(DailyStatusReportNFT dailyStatusReportNFT)
	{
		this.dailyStatusReportNFT = dailyStatusReportNFT;
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
