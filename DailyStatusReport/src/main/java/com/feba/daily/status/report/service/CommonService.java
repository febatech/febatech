package com.feba.daily.status.report.service;

import java.util.Date;
import java.util.List;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;

public interface CommonService 
{
	public void saveDailStatusReport(DailyStatusReportBean dailyStatusReportBean) throws Exception;
	
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate);
}
