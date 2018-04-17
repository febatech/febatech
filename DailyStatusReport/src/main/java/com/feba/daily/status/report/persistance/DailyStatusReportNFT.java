package com.feba.daily.status.report.persistance;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DAILY_STATUS_REPORT_NFT")
public class DailyStatusReportNFT 
{
	@Id
	@GeneratedValue
	@Column(name = "DAILY_STS_RPT_ID")
	private long id;
	
	@Column(name = "PLANING_PHASE_START")
	private String planingPhaseStart;
	
	@Column(name = "PLANING_PHASE_END")
	private String planingPhaseEnd;
	
	@Column(name = "TEST_DESIGN_PHASE_START")
	private String testDesignPhaseStart;
	
	@Column(name = "TEST_DESIGN_PHASE_END")
	private String testDesignPhaseEnd;
	
	@Column(name = "EXECUTION_PHASE_START")
	private String executionPhaseStart;
	
	@Column(name = "EXECUTION_PHASE_END")
	private String executionPhaseEnd;
	
	@Column(name = "SIGN_OFF_AND_CLOSURE_PHASE_START")
	private String signOffAndClosurePhaseStart;
	
	@Column(name = "SIGN_OFF_AND_CLOSURE_PHASE_END")
	private String signOffAndClosurePhaseEnd;
	
	@Column(name = "PROJECT_RELEASE")
	private String projectRelease;
	
	@Column(name = "LOBS")
	private String loB;
	
	@Column(name = "APP_NAME")
	private String appName;
	
	@Column(name = "PLANING_PHASE_PERCENTAGE")
	private String planingPhasePercentage;
	
	@Column(name = "TEST_DESIGN_PHASE_PERCENTAGE")
	private String testDesignPhasePercentage;
	
	@Column(name = "EXECUTION_PHASE_PERCENTAGE")
	private String executionPhasePercentage;
	
	@Column(name = "SIGN_OFF_AND_CLOSURE_PHASE_PERCENTAGE")
	private String signOffAndClosurePhasePercentage;
	
	@Column(name = "RELEASE_DATE")
	private String releaseDate;
	
	@Column(name = "REPORT_DATE")
	private String reportDate;
	
	@Column(name = "SDP_ID")
	private String sdpId;
	
	@Column(name = "CODE_BUILD_VERSION_TEST_ENV")
	private String codeBuildVersionTestEnv;
	
	@Column(name = "INSERTED_DATE")
	private Date insertedDate;
	
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name = "IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name = "IS_DELTED")
	private boolean isDeleted;
	
	@Column(name = "HIGH_LEVEL_STATUS_OR_ACCOMPLISHMENTS")
	private String highLevelStatusOrAccomplishments;
	
	@Column(name = "KEY_REASON_FOR_NON_GREEN")
	private String keyReasonsForNonGreen;
	
	@Column(name = "BACK_TO_GREEN_PLAN")
	private String backToGreenPlan;
	
	@Column(name = "OWNER")
	private String Owner;	
	
	@Column(name = "OVER_ALL_PT_COMPLETION_STATUS")
	private String overAllPtCompletionStatus;
	
	@Column(name = "TRACK_STATUS")
	private String trackStatus;
	
	@Column(name = "CITY_CONNECT")
	private String cityConnect;
	
	@Column(name = "CD")
	private String cd;
	
	@Column(name = "STATE_STREET")
	private String stateStreet;
	
	@Column(name = "SHARED_SERVICES")
	private String sharedServices;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_TEST_DGN_SMRY_ID")
	private Set<TestDesignSummary> testDesignSummaries;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_TEST_EXEC_SMRY_ID")
	private Set<TestExecutionSummary> testExecutionSummaries;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "FK_TEST_DEFECT_SMRY_ID")
	private Set<TestDefectSummary> testDefectSummaries;
	
	

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getPlaningPhaseStart()
	{
		return planingPhaseStart;
	}

	public void setPlaningPhaseStart(String planingPhaseStart)
	{
		this.planingPhaseStart = planingPhaseStart;
	}

	public String getPlaningPhaseEnd()
	{
		return planingPhaseEnd;
	}

	public void setPlaningPhaseEnd(String planingPhaseEnd)
	{
		this.planingPhaseEnd = planingPhaseEnd;
	}

	public String getTestDesignPhaseStart()
	{
		return testDesignPhaseStart;
	}

	public void setTestDesignPhaseStart(String testDesignPhaseStart)
	{
		this.testDesignPhaseStart = testDesignPhaseStart;
	}

	public String getTestDesignPhaseEnd()
	{
		return testDesignPhaseEnd;
	}

	public void setTestDesignPhaseEnd(String testDesignPhaseEnd)
	{
		this.testDesignPhaseEnd = testDesignPhaseEnd;
	}

	public String getExecutionPhaseStart()
	{
		return executionPhaseStart;
	}

	public void setExecutionPhaseStart(String executionPhaseStart)
	{
		this.executionPhaseStart = executionPhaseStart;
	}

	public String getExecutionPhaseEnd()
	{
		return executionPhaseEnd;
	}

	public void setExecutionPhaseEnd(String executionPhaseEnd)
	{
		this.executionPhaseEnd = executionPhaseEnd;
	}

	public String getSignOffAndClosurePhaseStart()
	{
		return signOffAndClosurePhaseStart;
	}

	public void setSignOffAndClosurePhaseStart(String signOffAndClosurePhaseStart)
	{
		this.signOffAndClosurePhaseStart = signOffAndClosurePhaseStart;
	}

	public String getSignOffAndClosurePhaseEnd()
	{
		return signOffAndClosurePhaseEnd;
	}

	public void setSignOffAndClosurePhaseEnd(String signOffAndClosurePhaseEnd)
	{
		this.signOffAndClosurePhaseEnd = signOffAndClosurePhaseEnd;
	}

	public String getProjectRelease()
	{
		return projectRelease;
	}

	public void setProjectRelease(String projectRelease)
	{
		this.projectRelease = projectRelease;
	}

	public String getLoB()
	{
		return loB;
	}

	public void setLoB(String loB)
	{
		this.loB = loB;
	}

	public String getAppName()
	{
		return appName;
	}

	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	public String getPlaningPhasePercentage()
	{
		return planingPhasePercentage;
	}

	public void setPlaningPhasePercentage(String planingPhasePercentage)
	{
		this.planingPhasePercentage = planingPhasePercentage;
	}

	public String getTestDesignPhasePercentage()
	{
		return testDesignPhasePercentage;
	}

	public void setTestDesignPhasePercentage(String testDesignPhasePercentage)
	{
		this.testDesignPhasePercentage = testDesignPhasePercentage;
	}

	public String getExecutionPhasePercentage()
	{
		return executionPhasePercentage;
	}

	public void setExecutionPhasePercentage(String executionPhasePercentage)
	{
		this.executionPhasePercentage = executionPhasePercentage;
	}

	public String getSignOffAndClosurePhasePercentage()
	{
		return signOffAndClosurePhasePercentage;
	}

	public void setSignOffAndClosurePhasePercentage(String signOffAndClosurePhasePercentage)
	{
		this.signOffAndClosurePhasePercentage = signOffAndClosurePhasePercentage;
	}

	public String getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public String getReportDate()
	{
		return reportDate;
	}

	public void setReportDate(String reportDate)
	{
		this.reportDate = reportDate;
	}

	public String getSdpId()
	{
		return sdpId;
	}

	public void setSdpId(String sdpId)
	{
		this.sdpId = sdpId;
	}

	public String getCodeBuildVersionTestEnv()
	{
		return codeBuildVersionTestEnv;
	}

	public void setCodeBuildVersionTestEnv(String codeBuildVersionTestEnv)
	{
		this.codeBuildVersionTestEnv = codeBuildVersionTestEnv;
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

	public String getOverAllPtCompletionStatus()
	{
		return overAllPtCompletionStatus;
	}

	public void setOverAllPtCompletionStatus(String overAllPtCompletionStatus)
	{
		this.overAllPtCompletionStatus = overAllPtCompletionStatus;
	}

	public String getTrackStatus()
	{
		return trackStatus;
	}

	public void setTrackStatus(String trackStatus)
	{
		this.trackStatus = trackStatus;
	}

	public String getCityConnect()
	{
		return cityConnect;
	}

	public void setCityConnect(String cityConnect)
	{
		this.cityConnect = cityConnect;
	}

	public String getCd()
	{
		return cd;
	}

	public void setCd(String cd)
	{
		this.cd = cd;
	}

	public String getStateStreet()
	{
		return stateStreet;
	}

	public void setStateStreet(String stateStreet)
	{
		this.stateStreet = stateStreet;
	}

	public String getSharedServices()
	{
		return sharedServices;
	}

	public void setSharedServices(String sharedServices)
	{
		this.sharedServices = sharedServices;
	}

	public void setDeleted(boolean isDeleted)
	{
		this.isDeleted = isDeleted;
	}

	public String getHighLevelStatusOrAccomplishments()
	{
		return highLevelStatusOrAccomplishments;
	}

	public void setHighLevelStatusOrAccomplishments(String highLevelStatusOrAccomplishments)
	{
		this.highLevelStatusOrAccomplishments = highLevelStatusOrAccomplishments;
	}

	public String getKeyReasonsForNonGreen()
	{
		return keyReasonsForNonGreen;
	}

	public void setKeyReasonsForNonGreen(String keyReasonsForNonGreen)
	{
		this.keyReasonsForNonGreen = keyReasonsForNonGreen;
	}

	public String getBackToGreenPlan()
	{
		return backToGreenPlan;
	}

	public void setBackToGreenPlan(String backToGreenPlan)
	{
		this.backToGreenPlan = backToGreenPlan;
	}

	public String getOwner()
	{
		return Owner;
	}

	public void setOwner(String owner)
	{
		Owner = owner;
	}

	public Set<TestDesignSummary> getTestDesignSummaries()
	{
		return testDesignSummaries;
	}

	public void setTestDesignSummaries(Set<TestDesignSummary> testDesignSummaries)
	{
		this.testDesignSummaries = testDesignSummaries;
	}

	public Set<TestExecutionSummary> getTestExecutionSummaries()
	{
		return testExecutionSummaries;
	}

	public void setTestExecutionSummaries(Set<TestExecutionSummary> testExecutionSummaries)
	{
		this.testExecutionSummaries = testExecutionSummaries;
	}

	public Set<TestDefectSummary> getTestDefectSummaries()
	{
		return testDefectSummaries;
	}

	public void setTestDefectSummaries(Set<TestDefectSummary> testDefectSummaries)
	{
		this.testDefectSummaries = testDefectSummaries;
	}
	
}
