package com.feba.daily.status.report.bean;

import java.util.Date;

public class TestExecutionSummaryBean
{
	private long id;
	
	private String applicationTrackType;
	
	private long totatlScenario;
	
	private long totalTestRun;
	
	private long totalTestPass;
	
	private long totalTestFailed;
	
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

	
}
