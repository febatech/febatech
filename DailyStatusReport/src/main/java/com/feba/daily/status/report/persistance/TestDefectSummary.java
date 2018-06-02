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
@Table(name = "TEST_DEFECT_SUMMARY")
public class TestDefectSummary
{
	@Id
	@GeneratedValue
	@Column(name = "TEST_DEFECT_SMRY_ID")
	private long id;
	
	@Column(name = "SEVERITY")
	private long severity;
	
	@Column(name = "OPEN_DEFECT")
	private long opne;
	
	@Column(name = "CLOSED")
	private long closed;
	
	@Column(name = "REJECTED")
	private long rejected;
	
	@Column(name = "DEFERED")
	private long defered;
	
	@Column(name = "RE_OPENED")
	private long reOpened;
	
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
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_TEST_DEFECT_SMRY_ID")
	private DailyStatusReportNFT dailyStatusReportNFT;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getSeverity()
	{
		return severity;
	}

	public void setSeverity(long severity)
	{
		this.severity = severity;
	}

	public long getOpne()
	{
		return opne;
	}

	public void setOpne(long opne)
	{
		this.opne = opne;
	}

	public long getClosed()
	{
		return closed;
	}

	public void setClosed(long closed)
	{
		this.closed = closed;
	}

	public long getRejected()
	{
		return rejected;
	}

	public void setRejected(long rejected)
	{
		this.rejected = rejected;
	}

	public long getDefered()
	{
		return defered;
	}

	public void setDefered(long defered)
	{
		this.defered = defered;
	}

	public long getReOpened()
	{
		return reOpened;
	}

	public void setReOpened(long reOpened)
	{
		this.reOpened = reOpened;
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
