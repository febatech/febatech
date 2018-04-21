package com.feba.daily.status.report.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class DailyStatusReportBean 
{
	
	private long id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date planingPhaseStart;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date planingPhaseEnd;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date testDesignPhaseStart;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date testDesignPhaseEnd;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date executionPhaseStart;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date executionPhaseEnd;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date signOffAndClosurePhaseStart;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date signOffAndClosurePhaseEnd;
	
	private String projectRelease;
	
	private String loB;
	
	private String appName;
	
	private String planingPhasePercentage;
	
	private String testDesignPhasePercentage;
	
	private String executionPhasePercentage;
	
	private String signOffAndClosurePhasePercentage;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date releaseDate;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date reportDate;
	
	private String sdpId;
	
	private String codeBuildVersionTestEnv;
	
	private String highLevelStatusOrAccomplishments;
	
	private String keyReasonsForNonGreen;
	
	private String backToGreenPlan;
	
	private String owner;	
	
	private String overAllPtCompletionStatus;
	
	private String trackStatus;
	
	private String cityConnect;
	
	private String cd;
	
	private String stateStreet;
	
	private String sharedServices;
	
	//3rd Section Description	
	
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
	
	private long applicationTrackCdTotal;
	
	private long applicationTrackCdInProgress;
	
	private long applicationTrackCdOnHold;
	
	private long applicationTrackCdCompleted;
	
	private long applicationTrackStateStreetTotal;
	
	private long applicationTrackStateStreetInProgress;
	
	private long applicationTrackStateStreetOnHold;
	
	private long applicationTrackStateStreetCompleted;
	
	private long applicationTrackSharedServicesTotal;
	
	private long applicationTrackSharedServicesInProgress;
	
	private long applicationTrackSharedServicesOnHold;
	
	private long applicationTrackSharedServicesCompleted;
	
	private long applicationTrackCitiConnectTotal;
	
	private long applicationTrackCitiConnectInProgress;
	
	private long applicationTrackCitiConnectOnHold;
	
	private long applicationTrackCitiConnectCompleted;
	
	//3rd Section Description	
	
	private long tedsAppTrackCdTotalScenario;
	
	private long tedsAppTrackCdTotalTestRuns;
	
	private long tedsAppTrackCdTotalRunPass;
	
	private long tedsAppTrackCdTotalRunFailed;
	
	private long tedsAppTrackStateStreetTotalScenario;
	
	private long tedsAppTrackStateStreetTotalTestRuns;
	
	private long tedsAppTrackStateStreetTotalRunPass;
	
	private long tedsAppTrackStateStreetTotalRunFailed;
	
	private long tedsAppTrackSharedServicesTotalScenario;
	
	private long tedsAppTrackSharedServicesTotalTestRuns;
	
	private long tedsAppTrackSharedServicesTotalRunPass;
	
	private long tedsAppTrackSharedServicesTotalRunFailed;
	
	private long tedsAppTrackCitiConnectTotalScenario;
	
	private long tedsAppTrackCitiConnectTotalTestRuns;
	
	private long tedsAppTrackCitiConnectTotalRunPass;
	
	private long tedsAppTrackCitiConnectTotalRunFailed;
	
	private long tedsAppTrackE2ETotalScenario;
	
	private long tedsAppTrackE2ETotalTestRuns;
	
	private long tedsAppTrackE2ETotalRunPass;
	
	private long tedsAppTrackE2ETotalRunFailed;
	
	// Fourth section
	
	private long firstRowSeverity;
	
	private long firstRowOpen;
	
	private long firstRowClosed;
	
	private long firstRowRejected;
	
	private long firstRowDefered;
	
	private long firstRowReOpned;
	
	private long secondRowSeverity;
	
	private long secondRowOpen;
	
	private long secondRowClosed;
	
	private long secondRowRejected;
	
	private long secondRowDefered;
	
	private long secondRowReOpned;
	
	private long thirdRowSeverity;
	
	private long thirdRowOpen;
	
	private long thirdRowClosed;
	
	private long thirdRowRejected;
	
	private long thirdRowDefered;
	
	private long thirdRowReOpned;
	
	private long fourthRowSeverity;
	
	private long fourthRowOpen;
	
	private long fourthRowClosed;
	
	private long fourthRowRejected;
	
	private long fourthRowDefered;
	
	private long fourthRowReOpned;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date searchDate;
	
	private String searchSdpId;
	
//	private Date insertedDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPlaningPhaseStart() {
		return planingPhaseStart;
	}
	public void setPlaningPhaseStart(Date planingPhaseStart) {
		this.planingPhaseStart = planingPhaseStart;
	}
	public Date getPlaningPhaseEnd() {
		return planingPhaseEnd;
	}
	public void setPlaningPhaseEnd(Date planingPhaseEnd) {
		this.planingPhaseEnd = planingPhaseEnd;
	}
	public Date getTestDesignPhaseStart() {
		return testDesignPhaseStart;
	}
	public void setTestDesignPhaseStart(Date testDesignPhaseStart) {
		this.testDesignPhaseStart = testDesignPhaseStart;
	}
	public Date getTestDesignPhaseEnd() {
		return testDesignPhaseEnd;
	}
	public void setTestDesignPhaseEnd(Date testDesignPhaseEnd) {
		this.testDesignPhaseEnd = testDesignPhaseEnd;
	}
	public Date getExecutionPhaseStart() {
		return executionPhaseStart;
	}
	public void setExecutionPhaseStart(Date executionPhaseStart) {
		this.executionPhaseStart = executionPhaseStart;
	}
	public Date getExecutionPhaseEnd() {
		return executionPhaseEnd;
	}
	public void setExecutionPhaseEnd(Date executionPhaseEnd) {
		this.executionPhaseEnd = executionPhaseEnd;
	}
	public Date getSignOffAndClosurePhaseStart() {
		return signOffAndClosurePhaseStart;
	}
	public void setSignOffAndClosurePhaseStart(Date signOffAndClosurePhaseStart) {
		this.signOffAndClosurePhaseStart = signOffAndClosurePhaseStart;
	}
	public Date getSignOffAndClosurePhaseEnd() {
		return signOffAndClosurePhaseEnd;
	}
	public void setSignOffAndClosurePhaseEnd(Date signOffAndClosurePhaseEnd) {
		this.signOffAndClosurePhaseEnd = signOffAndClosurePhaseEnd;
	}
	public String getProjectRelease() {
		return projectRelease;
	}
	public void setProjectRelease(String projectRelease) {
		this.projectRelease = projectRelease;
	}
	public String getLoB() {
		return loB;
	}
	public void setLoB(String loB) {
		this.loB = loB;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPlaningPhasePercentage() {
		return planingPhasePercentage;
	}
	public void setPlaningPhasePercentage(String planingPhasePercentage) {
		this.planingPhasePercentage = planingPhasePercentage;
	}
	public String getTestDesignPhasePercentage() {
		return testDesignPhasePercentage;
	}
	public void setTestDesignPhasePercentage(String testDesignPhasePercentage) {
		this.testDesignPhasePercentage = testDesignPhasePercentage;
	}
	public String getExecutionPhasePercentage() {
		return executionPhasePercentage;
	}
	public void setExecutionPhasePercentage(String executionPhasePercentage) {
		this.executionPhasePercentage = executionPhasePercentage;
	}
	public String getSignOffAndClosurePhasePercentage() {
		return signOffAndClosurePhasePercentage;
	}
	public void setSignOffAndClosurePhasePercentage(String signOffAndClosurePhasePercentage) {
		this.signOffAndClosurePhasePercentage = signOffAndClosurePhasePercentage;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getSdpId() {
		return sdpId;
	}
	public void setSdpId(String sdpId) {
		this.sdpId = sdpId;
	}
	public String getCodeBuildVersionTestEnv() {
		return codeBuildVersionTestEnv;
	}
	public void setCodeBuildVersionTestEnv(String codeBuildVersionTestEnv) {
		this.codeBuildVersionTestEnv = codeBuildVersionTestEnv;
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
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public String getTrackStatus()
	{
		return trackStatus;
	}
	public void setTrackStatus(String trackStatus)
	{
		this.trackStatus = trackStatus;
	}
	public String getOverAllPtCompletionStatus()
	{
		return overAllPtCompletionStatus;
	}
	public void setOverAllPtCompletionStatus(String overAllPtCompletionStatus)
	{
		this.overAllPtCompletionStatus = overAllPtCompletionStatus;
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
	public long getApplicationTrackCdTotal()
	{
		return applicationTrackCdTotal;
	}
	public void setApplicationTrackCdTotal(long applicationTrackCdTotal)
	{
		this.applicationTrackCdTotal = applicationTrackCdTotal;
	}
	public long getApplicationTrackCdInProgress()
	{
		return applicationTrackCdInProgress;
	}
	public void setApplicationTrackCdInProgress(long applicationTrackCdInProgress)
	{
		this.applicationTrackCdInProgress = applicationTrackCdInProgress;
	}
	public long getApplicationTrackCdOnHold()
	{
		return applicationTrackCdOnHold;
	}
	public void setApplicationTrackCdOnHold(long applicationTrackCdOnHold)
	{
		this.applicationTrackCdOnHold = applicationTrackCdOnHold;
	}
	public long getApplicationTrackCdCompleted()
	{
		return applicationTrackCdCompleted;
	}
	public void setApplicationTrackCdCompleted(long applicationTrackCdCompleted)
	{
		this.applicationTrackCdCompleted = applicationTrackCdCompleted;
	}
	public long getApplicationTrackStateStreetTotal()
	{
		return applicationTrackStateStreetTotal;
	}
	public void setApplicationTrackStateStreetTotal(long applicationTrackStateStreetTotal)
	{
		this.applicationTrackStateStreetTotal = applicationTrackStateStreetTotal;
	}
	public long getApplicationTrackStateStreetInProgress()
	{
		return applicationTrackStateStreetInProgress;
	}
	public void setApplicationTrackStateStreetInProgress(long applicationTrackStateStreetInProgress)
	{
		this.applicationTrackStateStreetInProgress = applicationTrackStateStreetInProgress;
	}
	public long getApplicationTrackStateStreetOnHold()
	{
		return applicationTrackStateStreetOnHold;
	}
	public void setApplicationTrackStateStreetOnHold(long applicationTrackStateStreetOnHold)
	{
		this.applicationTrackStateStreetOnHold = applicationTrackStateStreetOnHold;
	}
	public long getApplicationTrackStateStreetCompleted()
	{
		return applicationTrackStateStreetCompleted;
	}
	public void setApplicationTrackStateStreetCompleted(long applicationTrackStateStreetCompleted)
	{
		this.applicationTrackStateStreetCompleted = applicationTrackStateStreetCompleted;
	}
	public long getApplicationTrackSharedServicesTotal()
	{
		return applicationTrackSharedServicesTotal;
	}
	public void setApplicationTrackSharedServicesTotal(long applicationTrackSharedServicesTotal)
	{
		this.applicationTrackSharedServicesTotal = applicationTrackSharedServicesTotal;
	}
	public long getApplicationTrackSharedServicesInProgress()
	{
		return applicationTrackSharedServicesInProgress;
	}
	public void setApplicationTrackSharedServicesInProgress(long applicationTrackSharedServicesInProgress)
	{
		this.applicationTrackSharedServicesInProgress = applicationTrackSharedServicesInProgress;
	}
	public long getApplicationTrackSharedServicesOnHold()
	{
		return applicationTrackSharedServicesOnHold;
	}
	public void setApplicationTrackSharedServicesOnHold(long applicationTrackSharedServicesOnHold)
	{
		this.applicationTrackSharedServicesOnHold = applicationTrackSharedServicesOnHold;
	}
	public long getApplicationTrackSharedServicesCompleted()
	{
		return applicationTrackSharedServicesCompleted;
	}
	public void setApplicationTrackSharedServicesCompleted(long applicationTrackSharedServicesCompleted)
	{
		this.applicationTrackSharedServicesCompleted = applicationTrackSharedServicesCompleted;
	}
	public long getApplicationTrackCitiConnectTotal()
	{
		return applicationTrackCitiConnectTotal;
	}
	public void setApplicationTrackCitiConnectTotal(long applicationTrackCitiConnectTotal)
	{
		this.applicationTrackCitiConnectTotal = applicationTrackCitiConnectTotal;
	}
	public long getApplicationTrackCitiConnectInProgress()
	{
		return applicationTrackCitiConnectInProgress;
	}
	public void setApplicationTrackCitiConnectInProgress(long applicationTrackCitiConnectInProgress)
	{
		this.applicationTrackCitiConnectInProgress = applicationTrackCitiConnectInProgress;
	}
	public long getApplicationTrackCitiConnectOnHold()
	{
		return applicationTrackCitiConnectOnHold;
	}
	public void setApplicationTrackCitiConnectOnHold(long applicationTrackCitiConnectOnHold)
	{
		this.applicationTrackCitiConnectOnHold = applicationTrackCitiConnectOnHold;
	}
	public long getApplicationTrackCitiConnectCompleted()
	{
		return applicationTrackCitiConnectCompleted;
	}
	public void setApplicationTrackCitiConnectCompleted(long applicationTrackCitiConnectCompleted)
	{
		this.applicationTrackCitiConnectCompleted = applicationTrackCitiConnectCompleted;
	}
	public long getTedsAppTrackCdTotalScenario()
	{
		return tedsAppTrackCdTotalScenario;
	}
	public void setTedsAppTrackCdTotalScenario(long tedsAppTrackCdTotalScenario)
	{
		this.tedsAppTrackCdTotalScenario = tedsAppTrackCdTotalScenario;
	}
	public long getTedsAppTrackCdTotalTestRuns()
	{
		return tedsAppTrackCdTotalTestRuns;
	}
	public void setTedsAppTrackCdTotalTestRuns(long tedsAppTrackCdTotalTestRuns)
	{
		this.tedsAppTrackCdTotalTestRuns = tedsAppTrackCdTotalTestRuns;
	}
	public long getTedsAppTrackCdTotalRunPass()
	{
		return tedsAppTrackCdTotalRunPass;
	}
	public void setTedsAppTrackCdTotalRunPass(long tedsAppTrackCdTotalRunPass)
	{
		this.tedsAppTrackCdTotalRunPass = tedsAppTrackCdTotalRunPass;
	}
	public long getTedsAppTrackCdTotalRunFailed()
	{
		return tedsAppTrackCdTotalRunFailed;
	}
	public void setTedsAppTrackCdTotalRunFailed(long tedsAppTrackCdTotalRunFailed)
	{
		this.tedsAppTrackCdTotalRunFailed = tedsAppTrackCdTotalRunFailed;
	}
	public long getTedsAppTrackStateStreetTotalScenario()
	{
		return tedsAppTrackStateStreetTotalScenario;
	}
	public void setTedsAppTrackStateStreetTotalScenario(long tedsAppTrackStateStreetTotalScenario)
	{
		this.tedsAppTrackStateStreetTotalScenario = tedsAppTrackStateStreetTotalScenario;
	}
	public long getTedsAppTrackStateStreetTotalTestRuns()
	{
		return tedsAppTrackStateStreetTotalTestRuns;
	}
	public void setTedsAppTrackStateStreetTotalTestRuns(long tedsAppTrackStateStreetTotalTestRuns)
	{
		this.tedsAppTrackStateStreetTotalTestRuns = tedsAppTrackStateStreetTotalTestRuns;
	}
	public long getTedsAppTrackStateStreetTotalRunPass()
	{
		return tedsAppTrackStateStreetTotalRunPass;
	}
	public void setTedsAppTrackStateStreetTotalRunPass(long tedsAppTrackStateStreetTotalRunPass)
	{
		this.tedsAppTrackStateStreetTotalRunPass = tedsAppTrackStateStreetTotalRunPass;
	}
	public long getTedsAppTrackStateStreetTotalRunFailed()
	{
		return tedsAppTrackStateStreetTotalRunFailed;
	}
	public void setTedsAppTrackStateStreetTotalRunFailed(long tedsAppTrackStateStreetTotalRunFailed)
	{
		this.tedsAppTrackStateStreetTotalRunFailed = tedsAppTrackStateStreetTotalRunFailed;
	}
	public long getTedsAppTrackSharedServicesTotalScenario()
	{
		return tedsAppTrackSharedServicesTotalScenario;
	}
	public void setTedsAppTrackSharedServicesTotalScenario(long tedsAppTrackSharedServicesTotalScenario)
	{
		this.tedsAppTrackSharedServicesTotalScenario = tedsAppTrackSharedServicesTotalScenario;
	}
	public long getTedsAppTrackSharedServicesTotalTestRuns()
	{
		return tedsAppTrackSharedServicesTotalTestRuns;
	}
	public void setTedsAppTrackSharedServicesTotalTestRuns(long tedsAppTrackSharedServicesTotalTestRuns)
	{
		this.tedsAppTrackSharedServicesTotalTestRuns = tedsAppTrackSharedServicesTotalTestRuns;
	}
	public long getTedsAppTrackSharedServicesTotalRunPass()
	{
		return tedsAppTrackSharedServicesTotalRunPass;
	}
	public void setTedsAppTrackSharedServicesTotalRunPass(long tedsAppTrackSharedServicesTotalRunPass)
	{
		this.tedsAppTrackSharedServicesTotalRunPass = tedsAppTrackSharedServicesTotalRunPass;
	}
	public long getTedsAppTrackSharedServicesTotalRunFailed()
	{
		return tedsAppTrackSharedServicesTotalRunFailed;
	}
	public void setTedsAppTrackSharedServicesTotalRunFailed(long tedsAppTrackSharedServicesTotalRunFailed)
	{
		this.tedsAppTrackSharedServicesTotalRunFailed = tedsAppTrackSharedServicesTotalRunFailed;
	}
	public long getTedsAppTrackCitiConnectTotalScenario()
	{
		return tedsAppTrackCitiConnectTotalScenario;
	}
	public void setTedsAppTrackCitiConnectTotalScenario(long tedsAppTrackCitiConnectTotalScenario)
	{
		this.tedsAppTrackCitiConnectTotalScenario = tedsAppTrackCitiConnectTotalScenario;
	}
	public long getTedsAppTrackCitiConnectTotalTestRuns()
	{
		return tedsAppTrackCitiConnectTotalTestRuns;
	}
	public void setTedsAppTrackCitiConnectTotalTestRuns(long tedsAppTrackCitiConnectTotalTestRuns)
	{
		this.tedsAppTrackCitiConnectTotalTestRuns = tedsAppTrackCitiConnectTotalTestRuns;
	}
	public long getTedsAppTrackCitiConnectTotalRunPass()
	{
		return tedsAppTrackCitiConnectTotalRunPass;
	}
	public void setTedsAppTrackCitiConnectTotalRunPass(long tedsAppTrackCitiConnectTotalRunPass)
	{
		this.tedsAppTrackCitiConnectTotalRunPass = tedsAppTrackCitiConnectTotalRunPass;
	}
	public long getTedsAppTrackCitiConnectTotalRunFailed()
	{
		return tedsAppTrackCitiConnectTotalRunFailed;
	}
	public void setTedsAppTrackCitiConnectTotalRunFailed(long tedsAppTrackCitiConnectTotalRunFailed)
	{
		this.tedsAppTrackCitiConnectTotalRunFailed = tedsAppTrackCitiConnectTotalRunFailed;
	}
	public long getTedsAppTrackE2ETotalScenario()
	{
		return tedsAppTrackE2ETotalScenario;
	}
	public void setTedsAppTrackE2ETotalScenario(long tedsAppTrackE2ETotalScenario)
	{
		this.tedsAppTrackE2ETotalScenario = tedsAppTrackE2ETotalScenario;
	}
	public long getTedsAppTrackE2ETotalTestRuns()
	{
		return tedsAppTrackE2ETotalTestRuns;
	}
	public void setTedsAppTrackE2ETotalTestRuns(long tedsAppTrackE2ETotalTestRuns)
	{
		this.tedsAppTrackE2ETotalTestRuns = tedsAppTrackE2ETotalTestRuns;
	}
	public long getTedsAppTrackE2ETotalRunPass()
	{
		return tedsAppTrackE2ETotalRunPass;
	}
	public void setTedsAppTrackE2ETotalRunPass(long tedsAppTrackE2ETotalRunPass)
	{
		this.tedsAppTrackE2ETotalRunPass = tedsAppTrackE2ETotalRunPass;
	}
	public long getTedsAppTrackE2ETotalRunFailed()
	{
		return tedsAppTrackE2ETotalRunFailed;
	}
	public void setTedsAppTrackE2ETotalRunFailed(long tedsAppTrackE2ETotalRunFailed)
	{
		this.tedsAppTrackE2ETotalRunFailed = tedsAppTrackE2ETotalRunFailed;
	}
	public long getFirstRowSeverity()
	{
		return firstRowSeverity;
	}
	public void setFirstRowSeverity(long firstRowSeverity)
	{
		this.firstRowSeverity = firstRowSeverity;
	}
	public long getFirstRowOpen()
	{
		return firstRowOpen;
	}
	public void setFirstRowOpen(long firstRowOpen)
	{
		this.firstRowOpen = firstRowOpen;
	}
	public long getFirstRowClosed()
	{
		return firstRowClosed;
	}
	public void setFirstRowClosed(long firstRowClosed)
	{
		this.firstRowClosed = firstRowClosed;
	}
	public long getFirstRowRejected()
	{
		return firstRowRejected;
	}
	public void setFirstRowRejected(long firstRowRejected)
	{
		this.firstRowRejected = firstRowRejected;
	}
	public long getFirstRowDefered()
	{
		return firstRowDefered;
	}
	public void setFirstRowDefered(long firstRowDefered)
	{
		this.firstRowDefered = firstRowDefered;
	}
	public long getFirstRowReOpned()
	{
		return firstRowReOpned;
	}
	public void setFirstRowReOpned(long firstRowReOpned)
	{
		this.firstRowReOpned = firstRowReOpned;
	}
	public long getSecondRowSeverity()
	{
		return secondRowSeverity;
	}
	public void setSecondRowSeverity(long secondRowSeverity)
	{
		this.secondRowSeverity = secondRowSeverity;
	}
	public long getSecondRowOpen()
	{
		return secondRowOpen;
	}
	public void setSecondRowOpen(long secondRowOpen)
	{
		this.secondRowOpen = secondRowOpen;
	}
	public long getSecondRowClosed()
	{
		return secondRowClosed;
	}
	public void setSecondRowClosed(long secondRowClosed)
	{
		this.secondRowClosed = secondRowClosed;
	}
	public long getSecondRowRejected()
	{
		return secondRowRejected;
	}
	public void setSecondRowRejected(long secondRowRejected)
	{
		this.secondRowRejected = secondRowRejected;
	}
	public long getSecondRowDefered()
	{
		return secondRowDefered;
	}
	public void setSecondRowDefered(long secondRowDefered)
	{
		this.secondRowDefered = secondRowDefered;
	}
	public long getSecondRowReOpned()
	{
		return secondRowReOpned;
	}
	public void setSecondRowReOpned(long secondRowReOpned)
	{
		this.secondRowReOpned = secondRowReOpned;
	}
	public long getThirdRowSeverity()
	{
		return thirdRowSeverity;
	}
	public void setThirdRowSeverity(long thirdRowSeverity)
	{
		this.thirdRowSeverity = thirdRowSeverity;
	}
	public long getThirdRowOpen()
	{
		return thirdRowOpen;
	}
	public void setThirdRowOpen(long thirdRowOpen)
	{
		this.thirdRowOpen = thirdRowOpen;
	}
	public long getThirdRowClosed()
	{
		return thirdRowClosed;
	}
	public void setThirdRowClosed(long thirdRowClosed)
	{
		this.thirdRowClosed = thirdRowClosed;
	}
	public long getThirdRowRejected()
	{
		return thirdRowRejected;
	}
	public void setThirdRowRejected(long thirdRowRejected)
	{
		this.thirdRowRejected = thirdRowRejected;
	}
	public long getThirdRowDefered()
	{
		return thirdRowDefered;
	}
	public void setThirdRowDefered(long thirdRowDefered)
	{
		this.thirdRowDefered = thirdRowDefered;
	}
	public long getThirdRowReOpned()
	{
		return thirdRowReOpned;
	}
	public void setThirdRowReOpned(long thirdRowReOpned)
	{
		this.thirdRowReOpned = thirdRowReOpned;
	}
	public long getFourthRowSeverity()
	{
		return fourthRowSeverity;
	}
	public void setFourthRowSeverity(long fourthRowSeverity)
	{
		this.fourthRowSeverity = fourthRowSeverity;
	}
	public long getFourthRowOpen()
	{
		return fourthRowOpen;
	}
	public void setFourthRowOpen(long fourthRowOpen)
	{
		this.fourthRowOpen = fourthRowOpen;
	}
	public long getFourthRowClosed()
	{
		return fourthRowClosed;
	}
	public void setFourthRowClosed(long fourthRowClosed)
	{
		this.fourthRowClosed = fourthRowClosed;
	}
	public long getFourthRowRejected()
	{
		return fourthRowRejected;
	}
	public void setFourthRowRejected(long fourthRowRejected)
	{
		this.fourthRowRejected = fourthRowRejected;
	}
	public long getFourthRowDefered()
	{
		return fourthRowDefered;
	}
	public void setFourthRowDefered(long fourthRowDefered)
	{
		this.fourthRowDefered = fourthRowDefered;
	}
	public long getFourthRowReOpned()
	{
		return fourthRowReOpned;
	}
	public void setFourthRowReOpned(long fourthRowReOpned)
	{
		this.fourthRowReOpned = fourthRowReOpned;
	}
	public Date getSearchDate()
	{
		return searchDate;
	}
	public void setSearchDate(Date searchDate)
	{
		this.searchDate = searchDate;
	}
	public String getSearchSdpId()
	{
		return searchSdpId;
	}
	public void setSearchSdpId(String searchSdpId)
	{
		this.searchSdpId = searchSdpId;
	}
	/*public Date getInsertedDate()
	{
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate)
	{
		this.insertedDate = insertedDate;
	}*/
	

	
}
