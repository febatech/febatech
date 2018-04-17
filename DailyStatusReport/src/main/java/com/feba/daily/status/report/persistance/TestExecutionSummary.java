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

@Entity
@Table(name = "TEST_EXECUTION_SUMMARY")
public class TestExecutionSummary
{

	@Id
	@GeneratedValue
	@Column(name = "TEST_EXEC_SMRY_ID")
	private long id;
	
	@Column(name = "APPLICATION_TRACK_TYPE")
	private String applicationTrackType;
	
	@Column(name = "TOTAL_SCENARIO")
	private long totatlScenario;
	
	@Column(name = "TOTAL_TEST_RUN")
	private long totalTestRun;
	
	@Column(name = "TOTAL_TEST_PASS")
	private long totalTestPass;
	
	@Column(name = "TOTAL_TEST_FAILED")
	private long totalTestFailed;
	
	@Column(name = "INSERTED_DATE")
	private Date insertedDate;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name = "IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name = "IS_DELTED")
	private boolean isDeleted;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_TEST_EXEC_SMRY_ID")
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

	public long getTotatlScenario()
	{
		return totatlScenario;
	}

	public void setTotatlScenario(long totatlScenario)
	{
		this.totatlScenario = totatlScenario;
	}

	public long getTotalTestRun()
	{
		return totalTestRun;
	}

	public void setTotalTestRun(long totalTestRun)
	{
		this.totalTestRun = totalTestRun;
	}

	public long getTotalTestPass()
	{
		return totalTestPass;
	}

	public void setTotalTestPass(long totalTestPass)
	{
		this.totalTestPass = totalTestPass;
	}

	public long getTotalTestFailed()
	{
		return totalTestFailed;
	}

	public void setTotalTestFailed(long totalTestFailed)
	{
		this.totalTestFailed = totalTestFailed;
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
