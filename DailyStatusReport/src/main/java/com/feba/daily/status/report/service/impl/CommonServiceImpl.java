package com.feba.daily.status.report.service.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.feba.daily.status.report.bean.DailyStatusReportBean;
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
	
	@Override
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate)
	{
		logger.debug("searchByInsertedDateAndSPDId() - START");
		
		logger.debug("searchByInsertedDateAndSPDId() - END");
		return commonDataDao.searchByInsertedDateAndSPDId(searchDate);
	}

	@Override
	public void saveDailStatusReport(DailyStatusReportBean dailyStatusReportBean) throws Exception
	{
		logger.debug("saveDailStatusReport() - START");
		
		DailyStatusReportNFT dailyStatusReportNFT = new DailyStatusReportNFT();
		RaidLog raidLog = new RaidLog(); 
	
		
		dailyStatusReportNFT.setInsertedDate(new Date());
		raidLog.setInsertedDate(new Date());
		
		BeanUtils.copyProperties(dailyStatusReportBean, dailyStatusReportNFT);
		BeanUtils.copyProperties(dailyStatusReportBean, raidLog);
		raidLog.setDailyStatusReportNFT(dailyStatusReportNFT);
		
		Set<TestDesignSummary> testDesignSummaries = populateDesignSummary(dailyStatusReportBean);
		Set<TestExecutionSummary> testExecutionSummaries = populateTestExecutionSummary(dailyStatusReportBean);
		Set<TestDefectSummary> testDefectSummaries = populateTestDefectSummary(dailyStatusReportBean);
		
		dailyStatusReportNFT.setTestDesignSummaries(testDesignSummaries);
		dailyStatusReportNFT.setTestExecutionSummaries(testExecutionSummaries);
		dailyStatusReportNFT.setTestDefectSummaries(testDefectSummaries);
		
		commonDataDao.saveRaidLog(raidLog);
		
		logger.debug("saveDailStatusReport() - END");
	}
	
	private Set<TestDesignSummary> populateDesignSummary(DailyStatusReportBean dailyStatusReportBean)
	{
		TestDesignSummary testDesignSummaryCD = new TestDesignSummary();
		TestDesignSummary testDesignSummaryStateStreet = new TestDesignSummary();
		TestDesignSummary testDesignSummarySharedServices = new TestDesignSummary();
		TestDesignSummary testDesignSummaryCitiConnect = new TestDesignSummary();
		
		testDesignSummaryCD.setApplicationTrackType("CD");
		testDesignSummaryCD.setInProgress(dailyStatusReportBean.getApplicationTrackCdInProgress());
		testDesignSummaryCD.setOnHold(dailyStatusReportBean.getApplicationTrackCdOnHold());
		testDesignSummaryCD.setCompleted(dailyStatusReportBean.getApplicationTrackCdCompleted());
		testDesignSummaryCD.setTotal(dailyStatusReportBean.getApplicationTrackCdTotal());
		
		testDesignSummaryStateStreet.setApplicationTrackType("STATE STREET");
		testDesignSummaryStateStreet.setInProgress(dailyStatusReportBean.getApplicationTrackStateStreetInProgress());
		testDesignSummaryStateStreet.setOnHold(dailyStatusReportBean.getApplicationTrackStateStreetOnHold());
		testDesignSummaryStateStreet.setCompleted(dailyStatusReportBean.getApplicationTrackStateStreetCompleted());
		testDesignSummaryStateStreet.setTotal(dailyStatusReportBean.getApplicationTrackStateStreetTotal());
		
		testDesignSummarySharedServices.setApplicationTrackType("SHARED SERVICES");
		testDesignSummarySharedServices.setInProgress(dailyStatusReportBean.getApplicationTrackSharedServicesInProgress());
		testDesignSummarySharedServices.setOnHold(dailyStatusReportBean.getApplicationTrackSharedServicesOnHold());
		testDesignSummarySharedServices.setCompleted(dailyStatusReportBean.getApplicationTrackSharedServicesCompleted());
		testDesignSummarySharedServices.setTotal(dailyStatusReportBean.getApplicationTrackSharedServicesTotal());
		
		testDesignSummaryCitiConnect.setApplicationTrackType("CITI CONNECT");
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
	
	private Set<TestExecutionSummary> populateTestExecutionSummary(DailyStatusReportBean dailyStatusReportBean)
	{
		TestExecutionSummary testExecutionSummaryCD = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryStateStreet = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummarySharedServices = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryCitiConnect = new TestExecutionSummary();
		TestExecutionSummary testExecutionSummaryE2E = new TestExecutionSummary();
		
		testExecutionSummaryCD.setApplicationTrackType("CD");
		testExecutionSummaryCD.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackCdTotalScenario());
		testExecutionSummaryCD.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackCdTotalTestRuns());
		testExecutionSummaryCD.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackCdTotalRunPass());
		testExecutionSummaryCD.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackCdTotalRunFailed());
		
		testExecutionSummaryStateStreet.setApplicationTrackType("STATE STREET");
		testExecutionSummaryStateStreet.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackStateStreetTotalScenario());
		testExecutionSummaryStateStreet.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackStateStreetTotalTestRuns());
		testExecutionSummaryStateStreet.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackStateStreetTotalRunPass());
		testExecutionSummaryStateStreet.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackStateStreetTotalRunFailed());
		
		testExecutionSummarySharedServices.setApplicationTrackType("SHARED SERVICES");
		testExecutionSummarySharedServices.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalScenario());
		testExecutionSummarySharedServices.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalTestRuns());
		testExecutionSummarySharedServices.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalRunPass());
		testExecutionSummarySharedServices.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackSharedServicesTotalRunFailed());
		
		testExecutionSummaryCitiConnect.setApplicationTrackType("CITI CONNECT");
		testExecutionSummaryCitiConnect.setTotatlScenario(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalScenario());
		testExecutionSummaryCitiConnect.setTotalTestRun(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalTestRuns());
		testExecutionSummaryCitiConnect.setTotalTestPass(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalRunPass());
		testExecutionSummaryCitiConnect.setTotalTestFailed(dailyStatusReportBean.getTedsAppTrackCitiConnectTotalRunFailed());
		
		testExecutionSummaryE2E.setApplicationTrackType("E2E");
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
	
	private Set<TestDefectSummary> populateTestDefectSummary(DailyStatusReportBean dailyStatusReportBean)
	{
		TestDefectSummary testDefectSummaryFirstRow = new TestDefectSummary();
		TestDefectSummary testDefectSummarySecondRow = new TestDefectSummary();
		TestDefectSummary testDefectSummaryThirdRow = new TestDefectSummary();
		TestDefectSummary testDefectSummaryFourthRow = new TestDefectSummary();
		
		testDefectSummaryFirstRow.setSeverity(dailyStatusReportBean.getFirstRowSeverity());
		testDefectSummaryFirstRow.setOpne(dailyStatusReportBean.getFirstRowOpen());
		testDefectSummaryFirstRow.setClosed(dailyStatusReportBean.getFirstRowClosed());
		testDefectSummaryFirstRow.setRejected(dailyStatusReportBean.getFirstRowRejected());
		testDefectSummaryFirstRow.setDefered(dailyStatusReportBean.getFirstRowDefered());
		testDefectSummaryFirstRow.setReOpened(dailyStatusReportBean.getFirstRowRejected());
		
		testDefectSummarySecondRow.setSeverity(dailyStatusReportBean.getSecondRowSeverity());
		testDefectSummarySecondRow.setOpne(dailyStatusReportBean.getSecondRowOpen());
		testDefectSummarySecondRow.setClosed(dailyStatusReportBean.getSecondRowClosed());
		testDefectSummarySecondRow.setRejected(dailyStatusReportBean.getSecondRowRejected());
		testDefectSummarySecondRow.setDefered(dailyStatusReportBean.getSecondRowDefered());
		testDefectSummarySecondRow.setReOpened(dailyStatusReportBean.getSecondRowRejected());
		
		testDefectSummaryThirdRow.setSeverity(dailyStatusReportBean.getThirdRowSeverity());
		testDefectSummaryThirdRow.setOpne(dailyStatusReportBean.getThirdRowOpen());
		testDefectSummaryThirdRow.setClosed(dailyStatusReportBean.getThirdRowClosed());
		testDefectSummaryThirdRow.setRejected(dailyStatusReportBean.getThirdRowRejected());
		testDefectSummaryThirdRow.setDefered(dailyStatusReportBean.getThirdRowDefered());
		testDefectSummaryThirdRow.setReOpened(dailyStatusReportBean.getThirdRowRejected());
		
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


	
}
