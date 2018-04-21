package com.feba.daily.status.report.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLog;
import com.feba.daily.status.report.persistance.RaidLogTestDesignSummary;

public interface CommonDataDao 
{
	public void saveNFT(DailyStatusReportNFT dailyStatusReportNFT) throws Exception;
	
	public void saveRaidLogTestDesignSummary(RaidLogTestDesignSummary raidLogTestDesignSummary) throws Exception;
	
	public void saveRaidLog(DailyStatusReportNFT dailyStatusReportNFT) throws Exception;
	
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate, String spdId) throws NoResultException ;
	
	public List<DailyStatusReportNFT> searchBySDPId(String spdId) throws NoResultException;
	
	public void updateDailyStatusReport(DailyStatusReportNFT dailyStatusReportNFT);
	
	public void deleteDailySatuReport(Long objectId);
}
