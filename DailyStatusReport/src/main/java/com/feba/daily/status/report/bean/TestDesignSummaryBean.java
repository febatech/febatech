package com.feba.daily.status.report.bean;

import java.util.Date;

public class TestDesignSummaryBean
{
	private long id;
	
	private String applicationTrackType;
	
	private long total;
	
	private long inProgress;
	
	private long onHold;
	
	private long completed;
	
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
