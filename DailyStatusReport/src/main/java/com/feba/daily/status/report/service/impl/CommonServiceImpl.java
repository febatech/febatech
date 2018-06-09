package com.feba.daily.status.report.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.NoResultException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.bean.RaidLogBean;
import com.feba.daily.status.report.bean.TestDesignSummaryBean;
import com.feba.daily.status.report.bean.TestExecutionSummaryBean;
import com.feba.daily.status.report.constant.FEBATechConstant;
import com.feba.daily.status.report.dao.CommonDataDao;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLog;
import com.feba.daily.status.report.persistance.TestDefectSummary;
import com.feba.daily.status.report.persistance.TestDesignSummary;
import com.feba.daily.status.report.persistance.TestExecutionSummary;
import com.feba.daily.status.report.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService 
{
	final static Logger logger = Logger.getLogger(CommonServiceImpl.class);
	
	@Autowired
	CommonDataDao commonDataDao;
	
	public CommonServiceImpl()
	{
		BasicConfigurator.configure();
	}
	
	@Override
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate, String spdId) throws NoResultException
	{
		logger.debug("searchByInsertedDateAndSPDId() - START");
		
		logger.debug("searchByInsertedDateAndSPDId() - END");
		return commonDataDao.searchByInsertedDateAndSPDId(searchDate, spdId);
	}
	
	@Override
	public List<DailyStatusReportNFT> searchBySDPId(String spdId) throws NoResultException
	{
		logger.debug("searchBySDPId() - START");
		
		logger.debug("searchBySDPId() - END");
		return commonDataDao.searchBySDPId(spdId);
	}

	@Override
	public void deleteDailySatuReport(Long objectId)
	{
		logger.debug("deleteDailySatuReport() - START");
		commonDataDao.deleteDailySatuReport(objectId);
		logger.debug("deleteDailySatuReport() - END");
	}
	
	@Override
	public void updateDailyStatusReport(DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("updateDailyStatusReport() - START");
		DailyStatusReportNFT dailyStatusReportNFT = new DailyStatusReportNFT();
		Set<RaidLog> raidLogs = new HashSet<RaidLog>();
		Set<TestDesignSummary> testDesignSummaryBeans = new HashSet<TestDesignSummary>();
		Set<TestExecutionSummary> testExecutionSummaryBeans = new HashSet<TestExecutionSummary>();
		logger.debug("RaidLogBeanList Size : "+dailyStatusReportBean.getRaidLogBeanList().size());
		for(RaidLogBean temp : dailyStatusReportBean.getRaidLogBeanList())
		{
			logger.debug("RaidLog Bean : "+temp.getDescription());
			RaidLog raidLog = new RaidLog(); 
			BeanUtils.copyProperties(temp, raidLog);
			raidLog.setModifiedDate(new Date());
			raidLogs.add(raidLog);
		}
		
		for(TestDesignSummaryBean temp : dailyStatusReportBean.getTestDesignSummaryList())
		{
			TestDesignSummary summaryBean = new TestDesignSummary(); 
			BeanUtils.copyProperties(temp, summaryBean);
			summaryBean.setModifiedDate(new Date());
			testDesignSummaryBeans.add(summaryBean);
		}
		
		for(TestExecutionSummaryBean temp : dailyStatusReportBean.getTestExecutionSummaryList())
		{
			TestExecutionSummary summaryBean = new TestExecutionSummary(); 
			BeanUtils.copyProperties(temp, summaryBean);
			summaryBean.setModifiedDate(new Date());
			testExecutionSummaryBeans.add(summaryBean);
		}
		
		BeanUtils.copyProperties(dailyStatusReportBean, dailyStatusReportNFT);
//		BeanUtils.copyProperties(dailyStatusReportBean, dailyStatusReportNFT, "reportDate", "sdpId", "insertedDate");
		dailyStatusReportNFT.setRaidLogs(raidLogs);
		dailyStatusReportNFT.setTestDesignSummaries(testDesignSummaryBeans);
		dailyStatusReportNFT.setTestExecutionSummaries(testExecutionSummaryBeans);
		Set<TestDefectSummary> testDefectSummaries = populateTestDefectSummary(dailyStatusReportBean, FEBATechConstant.updateActivity);
		dailyStatusReportNFT.setTestDefectSummaries(testDefectSummaries);
		dailyStatusReportNFT.setTrackStatus("RAG");
		dailyStatusReportNFT.setModifiedDate(new Date());
		commonDataDao.updateDailyStatusReport(dailyStatusReportNFT);
		logger.debug("updateDailyStatusReport() - END");
	}

	@Override
	public void saveDailStatusReport(DailyStatusReportBean dailyStatusReportBean) throws Exception
	{
		logger.debug("saveDailStatusReport() - START");
		
		DailyStatusReportNFT dailyStatusReportNFT = new DailyStatusReportNFT();
		
		Set<RaidLog> raidLogs = new HashSet<RaidLog>();
		Set<TestDesignSummary> testDesignSummaryBeans = new HashSet<TestDesignSummary>();
		Set<TestExecutionSummary> testExecutionSummaryBeans = new HashSet<TestExecutionSummary>();
		
		logger.debug("RaidLogBeanList Size : "+dailyStatusReportBean.getRaidLogBeanList().size());
		for(RaidLogBean temp : dailyStatusReportBean.getRaidLogBeanList())
		{
			logger.debug("RaidLog Bean : "+temp.getDescription());
			RaidLog raidLog = new RaidLog(); 
			BeanUtils.copyProperties(temp, raidLog, "id");
			raidLog.setInsertedDate(new Date());
			raidLogs.add(raidLog);
		}
		
		for(TestDesignSummaryBean temp : dailyStatusReportBean.getTestDesignSummaryList())
		{
			TestDesignSummary summaryBean = new TestDesignSummary(); 
			BeanUtils.copyProperties(temp, summaryBean, "id");
			summaryBean.setInsertedDate(new Date());
			testDesignSummaryBeans.add(summaryBean);
		}
		
		for(TestExecutionSummaryBean temp : dailyStatusReportBean.getTestExecutionSummaryList())
		{
			TestExecutionSummary summaryBean = new TestExecutionSummary(); 
			BeanUtils.copyProperties(temp, summaryBean, "id");
			summaryBean.setInsertedDate(new Date());
			testExecutionSummaryBeans.add(summaryBean);
		}
		
		BeanUtils.copyProperties(dailyStatusReportBean, dailyStatusReportNFT, "id");
		dailyStatusReportNFT.setRaidLogs(raidLogs);
		dailyStatusReportNFT.setTestDesignSummaries(testDesignSummaryBeans);
		dailyStatusReportNFT.setTestExecutionSummaries(testExecutionSummaryBeans);
		
		/*Set<TestDesignSummary> testDesignSummaries = populateDesignSummary(dailyStatusReportBean, FEBATechConstant.saveActivity);
		Set<TestExecutionSummary> testExecutionSummaries = populateTestExecutionSummary(dailyStatusReportBean, FEBATechConstant.saveActivity);*/
		Set<TestDefectSummary> testDefectSummaries = populateTestDefectSummary(dailyStatusReportBean, FEBATechConstant.saveActivity);
		
//		dailyStatusReportNFT.setTestDesignSummaries(testDesignSummaries);
//		dailyStatusReportNFT.setTestExecutionSummaries(testExecutionSummaries);
		dailyStatusReportNFT.setTestDefectSummaries(testDefectSummaries);
		dailyStatusReportNFT.setInsertedDate(new Date());
		dailyStatusReportNFT.setTrackStatus("RAG");
		commonDataDao.saveRaidLog(dailyStatusReportNFT);
		
		logger.debug("saveDailStatusReport() - END");
	}
	
	private Set<TestDesignSummary> populateDesignSummary(DailyStatusReportBean dailyStatusReportBean, String activity)
	{
		TestDesignSummary testDesignSummaryCD = new TestDesignSummary();
		TestDesignSummary testDesignSummaryStateStreet = new TestDesignSummary();
		TestDesignSummary testDesignSummarySharedServices = new TestDesignSummary();
		TestDesignSummary testDesignSummaryCitiConnect = new TestDesignSummary();
		
		testDesignSummaryCD.setApplicationTrackType("CD");
		if("SAVE".equals(activity))
		{
			testDesignSummaryCD.setInsertedDate(new Date());
		}
		else
		{
			testDesignSummaryCD.setModifiedDate(new Date());
			testDesignSummaryCD.setId(dailyStatusReportBean.getApplicationTrackCdId());
		}
		
		
		testDesignSummaryCD.setInProgress(dailyStatusReportBean.getApplicationTrackCdInProgress());
		testDesignSummaryCD.setOnHold(dailyStatusReportBean.getApplicationTrackCdOnHold());
		testDesignSummaryCD.setCompleted(dailyStatusReportBean.getApplicationTrackCdCompleted());
		testDesignSummaryCD.setTotal(dailyStatusReportBean.getApplicationTrackCdTotal());
		
		testDesignSummaryStateStreet.setApplicationTrackType("STATE STREET");
		if("SAVE".equals(activity))
		{
			testDesignSummaryStateStreet.setInsertedDate(new Date());
		}
		else
		{
			testDesignSummaryStateStreet.setModifiedDate(new Date());
			testDesignSummaryStateStreet.setId(dailyStatusReportBean.getApplicationTrackStateStreetId());
		}
		
		testDesignSummaryStateStreet.setInProgress(dailyStatusReportBean.getApplicationTrackStateStreetInProgress());
		testDesignSummaryStateStreet.setOnHold(dailyStatusReportBean.getApplicationTrackStateStreetOnHold());
		testDesignSummaryStateStreet.setCompleted(dailyStatusReportBean.getApplicationTrackStateStreetCompleted());
		testDesignSummaryStateStreet.setTotal(dailyStatusReportBean.getApplicationTrackStateStreetTotal());
		
		testDesignSummarySharedServices.setApplicationTrackType("SHARED SERVICES");
		if("SAVE".equals(activity))
		{
			testDesignSummarySharedServices.setInsertedDate(new Date());
		}
		else
		{
			testDesignSummarySharedServices.setModifiedDate(new Date());
			testDesignSummarySharedServices.setId(dailyStatusReportBean.getApplicationTrackSharedServicesId());
		}
		
		testDesignSummarySharedServices.setInProgress(dailyStatusReportBean.getApplicationTrackSharedServicesInProgress());
		testDesignSummarySharedServices.setOnHold(dailyStatusReportBean.getApplicationTrackSharedServicesOnHold());
		testDesignSummarySharedServices.setCompleted(dailyStatusReportBean.getApplicationTrackSharedServicesCompleted());
		testDesignSummarySharedServices.setTotal(dailyStatusReportBean.getApplicationTrackSharedServicesTotal());
		
		testDesignSummaryCitiConnect.setApplicationTrackType("CITI CONNECT");
		if("SAVE".equals(activity))
		{
			testDesignSummaryCitiConnect.setInsertedDate(new Date());
		}
		else
		{
			testDesignSummaryCitiConnect.setModifiedDate(new Date());
			testDesignSummaryCitiConnect.setId(dailyStatusReportBean.getApplicationTrackCitiConnectId());
		}
		
		testDesignSummaryCitiConnect.setInProgress(dailyStatusReportBean.getApplicationTrackCitiConnectInProgress());
		testDesignSummaryCitiConnect.setOnHold(dailyStatusReportBean.getApplicationTrackCitiConnectOnHold());
		testDesignSummaryCitiConnect.setCompleted(dailyStatusReportBean.getApplicationTrackCitiConnectCompleted());
		testDesignSummaryCitiConnect.setTotal(dailyStatusReportBean.getApplicationTrackCitiConnectTotal());
		
		Set<TestDesignSummary> set = new HashSet<TestDesignSummary>();
		set.add(testDesignSummaryCD);
		set.add(testDesignSummaryStateStreet);
		set.add(testDesignSummarySharedServices);
		set.add(testDesignSummaryCitiConnect);
		
		return set;
	}
	
	private Set<TestExecutionSummary> populateTestExecutionSummary(DailyStatusReportBean dailyStatusReportBean, String activity)
	{
		TestExecutionSummary testExecutionSummaryCD = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryStateStreet = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummarySharedServices = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryCitiConnect = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryE2E = new TestExecutionSummary();
		
		testExecutionSummaryCD.setApplicationTrackType("CD");
		
		if("SAVE".equals(activity))
		{
			testExecutionSummaryCD.setInsertedDate(new Date());
		}
		else
		{
			testExecutionSummaryCD.setModifiedDate(new Date());
			testExecutionSummaryCD.setId(dailyStatusReportBean.getTedsAppTrackCdId());
		}
		testExecutionSummaryCD.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackCdTotalScenario());
		testExecutionSummaryCD.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackCdTotalTestRuns());
		testExecutionSummaryCD.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackCdTotalRunPass());
		testExecutionSummaryCD.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackCdTotalRunFailed());
		
		testExecutionSummaryStateStreet.setApplicationTrackType("STATE STREET");
		
		if("SAVE".equals(activity))
		{
			testExecutionSummaryStateStreet.setInsertedDate(new Date());
		}
		else
		{
			testExecutionSummaryStateStreet.setModifiedDate(new Date());
			testExecutionSummaryStateStreet.setId(dailyStatusReportBean.getTedsAppTrackStateStreetId());
		}
		testExecutionSummaryStateStreet.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackStateStreetTotalScenario());
		testExecutionSummaryStateStreet.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackStateStreetTotalTestRuns());
		testExecutionSummaryStateStreet.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackStateStreetTotalRunPass());
		testExecutionSummaryStateStreet.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackStateStreetTotalRunFailed());
		
		testExecutionSummarySharedServices.setApplicationTrackType("SHARED SERVICES");
		
		if("SAVE".equals(activity))
		{
			testExecutionSummarySharedServices.setInsertedDate(new Date());
		}
		else
		{
			testExecutionSummarySharedServices.setModifiedDate(new Date());
			testExecutionSummarySharedServices.setId(dailyStatusReportBean.getTedsAppTrackSharedServicesId());
		}
		testExecutionSummarySharedServices.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalScenario());
		testExecutionSummarySharedServices.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalTestRuns());
		testExecutionSummarySharedServices.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalRunPass());
		testExecutionSummarySharedServices.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalRunFailed());
		
		testExecutionSummaryCitiConnect.setApplicationTrackType("CITI CONNECT");
		
		if("SAVE".equals(activity))
		{
			testExecutionSummaryCitiConnect.setInsertedDate(new Date());
		}
		else
		{
			testExecutionSummaryCitiConnect.setModifiedDate(new Date());
			testExecutionSummaryCitiConnect.setId(dailyStatusReportBean.getTedsAppTrackCitiConnectId());
		}
		testExecutionSummaryCitiConnect.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalScenario());
		testExecutionSummaryCitiConnect.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalTestRuns());
		testExecutionSummaryCitiConnect.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalRunPass());
		testExecutionSummaryCitiConnect.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalRunFailed());
		
		testExecutionSummaryE2E.setApplicationTrackType("E2E");
		
		if("SAVE".equals(activity))
		{
			testExecutionSummaryE2E.setInsertedDate(new Date());
		}
		else
		{
			testExecutionSummaryE2E.setModifiedDate(new Date());
			testExecutionSummaryE2E.setId(dailyStatusReportBean.getTedsAppTrackE2EId());
		}
		testExecutionSummaryE2E.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackE2ETotalScenario());
		testExecutionSummaryE2E.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackE2ETotalTestRuns());
		testExecutionSummaryE2E.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackE2ETotalRunPass());
		testExecutionSummaryE2E.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackE2ETotalRunFailed());
		
		Set<TestExecutionSummary> set = new HashSet<TestExecutionSummary>();
		set.add(testExecutionSummaryCD);
		set.add(testExecutionSummaryStateStreet);
		set.add(testExecutionSummarySharedServices);
		set.add(testExecutionSummaryCitiConnect);
		set.add(testExecutionSummaryE2E);
		
		return set;
	}
	
	private Set<TestDefectSummary> populateTestDefectSummary(DailyStatusReportBean dailyStatusReportBean, String activity)
	{
		TestDefectSummary testDefectSummaryFirstRow = new TestDefectSummary();
		TestDefectSummary testDefectSummarySecondRow = new TestDefectSummary();
		TestDefectSummary testDefectSummaryThirdRow = new TestDefectSummary();
		TestDefectSummary testDefectSummaryFourthRow = new TestDefectSummary();
		
		
		if("SAVE".equals(activity))
		{
			testDefectSummaryFirstRow.setInsertedDate(new Date());
		}
		else
		{
			testDefectSummaryFirstRow.setModifiedDate(new Date());
			testDefectSummaryFirstRow.setId(dailyStatusReportBean.getFirstRowId());
		}
		testDefectSummaryFirstRow.setSeverity(dailyStatusReportBean.getFirstRowSeverity());
		testDefectSummaryFirstRow.setOpne(dailyStatusReportBean.getFirstRowOpen());
		testDefectSummaryFirstRow.setClosed(dailyStatusReportBean.getFirstRowClosed());
		testDefectSummaryFirstRow.setRejected(dailyStatusReportBean.getFirstRowRejected());
		testDefectSummaryFirstRow.setDefered(dailyStatusReportBean.getFirstRowDefered());
		testDefectSummaryFirstRow.setReOpened(dailyStatusReportBean.getFirstRowRejected());
		
		
		if("SAVE".equals(activity))
		{
			testDefectSummarySecondRow.setInsertedDate(new Date());
		}
		else
		{
			testDefectSummarySecondRow.setModifiedDate(new Date());
			testDefectSummarySecondRow.setId(dailyStatusReportBean.getSecondRowId());
		}
		testDefectSummarySecondRow.setSeverity(dailyStatusReportBean.getSecondRowSeverity());
		testDefectSummarySecondRow.setOpne(dailyStatusReportBean.getSecondRowOpen());
		testDefectSummarySecondRow.setClosed(dailyStatusReportBean.getSecondRowClosed());
		testDefectSummarySecondRow.setRejected(dailyStatusReportBean.getSecondRowRejected());
		testDefectSummarySecondRow.setDefered(dailyStatusReportBean.getSecondRowDefered());
		testDefectSummarySecondRow.setReOpened(dailyStatusReportBean.getSecondRowRejected());
		
		
		if("SAVE".equals(activity))
		{
			testDefectSummaryThirdRow.setInsertedDate(new Date());
		}
		else
		{
			testDefectSummaryThirdRow.setModifiedDate(new Date());
			testDefectSummaryThirdRow.setId(dailyStatusReportBean.getThirdRowId());
		}
		testDefectSummaryThirdRow.setSeverity(dailyStatusReportBean.getThirdRowSeverity());
		testDefectSummaryThirdRow.setOpne(dailyStatusReportBean.getThirdRowOpen());
		testDefectSummaryThirdRow.setClosed(dailyStatusReportBean.getThirdRowClosed());
		testDefectSummaryThirdRow.setRejected(dailyStatusReportBean.getThirdRowRejected());
		testDefectSummaryThirdRow.setDefered(dailyStatusReportBean.getThirdRowDefered());
		testDefectSummaryThirdRow.setReOpened(dailyStatusReportBean.getThirdRowRejected());
		
		
		if("SAVE".equals(activity))
		{
			testDefectSummaryFourthRow.setInsertedDate(new Date());
		}
		else
		{
			testDefectSummaryFourthRow.setModifiedDate(new Date());
			testDefectSummaryFourthRow.setId(dailyStatusReportBean.getFourthRowId());
		}
		testDefectSummaryFourthRow.setSeverity(dailyStatusReportBean.getFourthRowSeverity());
		testDefectSummaryFourthRow.setOpne(dailyStatusReportBean.getFourthRowOpen());
		testDefectSummaryFourthRow.setClosed(dailyStatusReportBean.getFourthRowClosed());
		testDefectSummaryFourthRow.setRejected(dailyStatusReportBean.getFourthRowRejected());
		testDefectSummaryFourthRow.setDefered(dailyStatusReportBean.getFourthRowDefered());
		testDefectSummaryFourthRow.setReOpened(dailyStatusReportBean.getFourthRowRejected());
		
		
		Set<TestDefectSummary> set = new HashSet<TestDefectSummary>();
		set.add(testDefectSummaryFirstRow);
		set.add(testDefectSummarySecondRow);
		set.add(testDefectSummaryThirdRow);
		set.add(testDefectSummaryFourthRow);
		
		return set;
	}

	@Override
	public void deleteRaidLogById(Long objectId)
	{
		logger.debug("deleteRaidLogById() - START");
		commonDataDao.deleteRaidLogById(objectId);
		logger.debug("deleteRaidLogById() - END");
		
	}

	@Override
	public void deleteTestDesignSummaryById(Long objectId)
	{
		logger.debug("deleteTestDesignSummaryById() - START");
		commonDataDao.deleteTestDesignSummaryById(objectId);
		logger.debug("deleteTestDesignSummaryById() - END");
		
	}

	@Override
	public void deleteTestExecutionSummaryById(Long objectId)
	{
		logger.debug("deleteTestExecutionSummaryById() - START");
		commonDataDao.deleteTestExecutionSummaryById(objectId);
		logger.debug("deleteTestExecutionSummaryById() - END");
		
	}

	@Override
	public Map<String, Long> getLOBNFSReportDetails(Date reportDate)
	{
		logger.debug("getLOBNFSReportDetails() - START");
		
		return commonDataDao.getLOBNFSReportDetails(reportDate);
	}


}
