package com.feba.daily.status.report.controller;

import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.TestDesignSummary;
import com.feba.daily.status.report.persistance.TestExecutionSummary;
import com.feba.daily.status.report.service.CommonService;


@Controller
public class DailyStatusReportSearchController 
{
	final static Logger logger = Logger.getLogger(DailyStatusReportSearchController.class);
		
	@Autowired
	CommonService commonService;
	
	boolean isFirstTimeSearch = false;

	@RequestMapping(value = "/searchDailyStaturReport.html", method = RequestMethod.POST)
	public ModelAndView searchDailyStaturReport(@ModelAttribute("searchForm") DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("searchDailyStaturReport() - START");
		ModelAndView modelAndView = new ModelAndView("search");
		try
		{
			logger.debug("Search Date : "+dailyStatusReportBean.getSearchDate());
			logger.debug("Search SDP Id : "+dailyStatusReportBean.getSearchSdpId());
			Date searchDate = dailyStatusReportBean.getSearchDate();
			String spdId = dailyStatusReportBean.getSearchSdpId();
			
			List<DailyStatusReportNFT> dailyStatusReportNFTs;
			dailyStatusReportNFTs = commonService.searchByInsertedDateAndSPDId(searchDate, spdId);
			if(CollectionUtils.isNotEmpty(dailyStatusReportNFTs))
			{
				double testDesignPahse = 0;
				double testExecutionPahse = 0;
				logger.debug("Daily Status Report Object : "+dailyStatusReportNFTs);
				modelAndView.addObject("dailyStatusReportNFTObject", dailyStatusReportNFTs.get(0));
				DailyStatusReportNFT dailyStatusReportNFT = dailyStatusReportNFTs.get(0);
				for(TestDesignSummary designSummary : dailyStatusReportNFT.getTestDesignSummaries())
				{
					testDesignPahse += designSummary.getCompleted() / designSummary.getTotal();
				}
				for(TestExecutionSummary executionSummary : dailyStatusReportNFT.getTestExecutionSummaries())
				{
					testExecutionPahse += executionSummary.getTotalTestPass() / ((executionSummary.getTotatlScenario() + executionSummary.getTotalTestRun()) / 2);
				}
				logger.debug("Test Design Pahse : "+testDesignPahse);
				logger.debug("Test Execution Pahse : "+testExecutionPahse);
				isFirstTimeSearch = false;
				modelAndView.addObject("isFirstTimeSearch", isFirstTimeSearch);
				modelAndView.addObject("testDesignPahse", Math.round(testDesignPahse));
				modelAndView.addObject("testExecutionPahse", Math.round(testExecutionPahse));
				
			}
			else
			{
				logger.debug("No Record Found");
			}
		} 
		catch (NoResultException e)
		{
			modelAndView.addObject("css", "failed");
			modelAndView.addObject("msg", "No Record Found!");
		}
		logger.debug("searchDailyStaturReport() - END");
		return modelAndView;
	}
	
}
