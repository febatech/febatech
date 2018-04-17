package com.feba.daily.status.report.dao;

import java.util.Date;
import java.util.List;

import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLog;
import com.feba.daily.status.report.persistance.RaidLogTestDesignSummary;

public interface CommonDataDao 
{
	public void saveNFT(DailyStatusReportNFT dailyStatusReportNFT) throws Exception;
	
	public void saveRaidLogTestDesignSummary(RaidLogTestDesignSummary raidLogTestDesignSummary) throws Exception;
	
	public void saveRaidLog(RaidLog raidLog) throws Exception;
	
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate);
}
