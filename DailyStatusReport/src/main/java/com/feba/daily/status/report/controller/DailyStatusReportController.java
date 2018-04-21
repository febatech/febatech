package com.feba.daily.status.report.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.TestDefectSummary;
import com.feba.daily.status.report.persistance.TestDesignSummary;
import com.feba.daily.status.report.persistance.TestExecutionSummary;
import com.feba.daily.status.report.service.CommonService;
import com.feba.daily.status.report.util.DailyStatusReportUtil;
import com.feba.daily.status.report.util.DropDownMenu;


@Controller
public class DailyStatusReportController 
{
	final static Logger logger = Logger.getLogger(DailyStatusReportController.class);
		
	@Autowired
	CommonService commonService;
	
	boolean isFirstTimeSearch = false;
	
	public DailyStatusReportController()
	{
		BasicConfigurator.configure();
	}
	
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public ModelAndView landingPage()
	{
		logger.debug("landingPage() - START");
		ModelAndView modelAndView = new ModelAndView("index");
		logger.debug("landingPage() - END");
		return modelAndView;
	}
	
	@RequestMapping(value = "/input.html", method = RequestMethod.GET)
	public ModelAndView loadDailyStatusReportNFT(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("loadDailyStatusReportNFT() - START");
		
		DropDownMenu dropDownMenu = new DropDownMenu();
		ModelAndView modelAndView = new ModelAndView("input");
		modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
		logger.debug("loadDailyStatusReportNFT() - END");
		return modelAndView;
	}
	
	@RequestMapping(value = "/submitDailyStatusReport.html", method = RequestMethod.POST)
	public String submitDailyStatusReportNFT(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, final RedirectAttributes redirectAttributes)
	{
		logger.debug("submitDailyStatusReportNFT() - START");
		try
		{
			ModelAndView modelAndView = new ModelAndView("input");
			commonService.saveDailStatusReport(dailyStatusReportBean);
			redirectAttributes.addFlashAttribute("css", "success");
			redirectAttributes.addFlashAttribute("msg", "User added successfully!");
			
			logger.debug("submitDailyStatusReportNFT() - END");
		} catch (Exception e)
		{
			logger.error("Error Occured during saving data : ", e);
		}
			return "redirect:/input.html";
	}
	
	
	@RequestMapping(value = "/search.html", method = RequestMethod.GET)
	public ModelAndView loadSearchPage(@ModelAttribute("searchForm") DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("loadDailyStatusReportNFT() - START");
		
		ModelAndView modelAndView = new ModelAndView("search");
		isFirstTimeSearch = true;
		modelAndView.addObject("isFirstTimeSearch", isFirstTimeSearch);
		logger.debug("loadDailyStatusReportNFT() - END");
		return modelAndView;
	}
	
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
				logger.debug("Daily Status Report Object : "+dailyStatusReportNFTs);
				modelAndView.addObject("dailyStatusReportNFTObject", dailyStatusReportNFTs.get(0));
				isFirstTimeSearch = false;
				modelAndView.addObject("isFirstTimeSearch", isFirstTimeSearch);
				
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
	
	
	@RequestMapping(value = "/loadUpdateDelete.html", method = RequestMethod.GET)
	public ModelAndView loadUpdateDeleteForm(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
//	public ModelAndView loadUpdateDeleteForm(HttpServletRequest request)
	{
		logger.debug("loadDailyStatusReportNFT() - START");
		ModelAndView modelAndView = new ModelAndView("updateDelete");
//		DailyStatusReportBean dailyStatusReportBean = new DailyStatusReportBean();
		try
		{
			String dateIn = request.getParameter("searchDate");
			String searchSdpId = request.getParameter("searchSdpId");
			Date searchDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", dateIn);
			
			List<DailyStatusReportNFT> dailyStatusReportNFTs;
			dailyStatusReportNFTs =  commonService.searchByInsertedDateAndSPDId(searchDate, searchSdpId);
			DailyStatusReportNFT dailyStatusReportNFT = dailyStatusReportNFTs.get(0);
			BeanUtils.copyProperties(dailyStatusReportNFT, dailyStatusReportBean);
			BeanUtils.copyProperties(dailyStatusReportNFT.getRaidLog(), dailyStatusReportBean);
			
			System.out.println("loadDailyStatusReportNFT Object Id : "+ dailyStatusReportBean.getId());
			
			Set<TestDesignSummary> testDesignSummariesSet = dailyStatusReportNFT.getTestDesignSummaries();
			Iterator<TestDesignSummary> testDesignSummariesIterator = testDesignSummariesSet.iterator();
			List<TestDesignSummary> testDesignSummaryList = new ArrayList<TestDesignSummary>();
			while(testDesignSummariesIterator.hasNext())
			{
				testDesignSummaryList.add(testDesignSummariesIterator.next());
			}
			for(TestDesignSummary var : testDesignSummaryList)
			{
				if(var.getApplicationTrackType().equals("CD"))
				{
					dailyStatusReportBean.setApplicationTrackCdTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackCdInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackCdOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackCdCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType().equals("STATE STREET"))
				{
					dailyStatusReportBean.setApplicationTrackStateStreetTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackStateStreetInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackStateStreetOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackStateStreetCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType().equals("SHARED SERVICES"))
				{
					dailyStatusReportBean.setApplicationTrackSharedServicesTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackSharedServicesInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackSharedServicesOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackSharedServicesCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType().equals("CITI CONNECT"))
				{
					dailyStatusReportBean.setApplicationTrackCitiConnectTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackCitiConnectInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackCitiConnectOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackCitiConnectCompleted(var.getCompleted());
				}
			}
			
			
			//======================================
			Set<TestExecutionSummary> testExecutionSummariesSet = dailyStatusReportNFT.getTestExecutionSummaries();
			Iterator<TestExecutionSummary> testExecutionSummaryIterator = testExecutionSummariesSet.iterator();
			List<TestExecutionSummary> testExecutionSummariesList = new ArrayList<TestExecutionSummary>();
			while(testExecutionSummaryIterator.hasNext())
			{
				testExecutionSummariesList.add(testExecutionSummaryIterator.next());
			}
			for(TestExecutionSummary var : testExecutionSummariesList)
			{
				if(var.getApplicationTrackType().equals("CD"))
				{
					dailyStatusReportBean.setTedsAppTrackCdTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackCdTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackCdTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackCdTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType().equals("STATE STREET"))
				{
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType().equals("SHARED SERVICES"))
				{
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType().equals("CITI CONNECT"))
				{
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType().equals("E2E"))
				{
					dailyStatusReportBean.setTedsAppTrackE2ETotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackE2ETotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackE2ETotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackE2ETotalRunFailed(var.getTotalTestFailed());
				}
			}
			//======================================
			Set<TestDefectSummary> testDefectSummarySet = dailyStatusReportNFT.getTestDefectSummaries();
			Iterator<TestDefectSummary> testDefectSummaryIterator = testDefectSummarySet.iterator();
			List<TestDefectSummary> testDefectSummaryList = new ArrayList<TestDefectSummary>();
			while(testDefectSummaryIterator.hasNext())
			{
				testDefectSummaryList.add(testDefectSummaryIterator.next());
			}
			for(TestDefectSummary var : testDefectSummaryList)
			{
				if(var.getSeverity() == 1L)
				{
					dailyStatusReportBean.setFirstRowOpen(var.getOpne());
					dailyStatusReportBean.setFirstRowClosed(var.getClosed());
					dailyStatusReportBean.setFirstRowRejected(var.getRejected());
					dailyStatusReportBean.setFirstRowDefered(var.getDefered());
					dailyStatusReportBean.setFirstRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 2L)
				{
					dailyStatusReportBean.setSecondRowOpen(var.getOpne());
					dailyStatusReportBean.setSecondRowClosed(var.getClosed());
					dailyStatusReportBean.setSecondRowRejected(var.getRejected());
					dailyStatusReportBean.setSecondRowDefered(var.getDefered());
					dailyStatusReportBean.setSecondRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 3L)
				{
					dailyStatusReportBean.setThirdRowOpen(var.getOpne());
					dailyStatusReportBean.setThirdRowClosed(var.getClosed());
					dailyStatusReportBean.setThirdRowRejected(var.getRejected());
					dailyStatusReportBean.setThirdRowDefered(var.getDefered());
					dailyStatusReportBean.setThirdRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 4L)
				{
					dailyStatusReportBean.setFourthRowOpen(var.getOpne());
					dailyStatusReportBean.setFourthRowClosed(var.getClosed());
					dailyStatusReportBean.setFourthRowRejected(var.getRejected());
					dailyStatusReportBean.setFourthRowDefered(var.getDefered());
					dailyStatusReportBean.setFourthRowReOpned(var.getReOpened());
				}
			}
			
			DropDownMenu dropDownMenu = new DropDownMenu();
			
			modelAndView.addObject("userForm", dailyStatusReportBean);
			modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
			
		} catch (NoResultException e)
		{
			modelAndView.addObject("userForm", dailyStatusReportBean);
			modelAndView.addObject("css", "success");
			modelAndView.addObject("msg", "No Record Found!");
		} catch (BeansException e)
		{
		}
		
		logger.debug("loadDailyStatusReportNFT() - END");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/updateDelete.html", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView updateOrDeleteDailyStatusReport(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("updateOrDeleteDailyStatusReport() - START");
		logger.debug("updateOrDeleteDailyStatusReport Object Id : "+ dailyStatusReportBean.getId());
		System.out.println("updateOrDeleteDailyStatusReport Object Id : "+ dailyStatusReportBean.getId());
		
		String sdpId = dailyStatusReportBean.getSdpId();
		logger.debug("SDP ID : "+sdpId);
		commonService.updateDailyStatusReport(dailyStatusReportBean);
		
		ModelAndView modelAndView = new ModelAndView("updateDelete");
		modelAndView.addObject("css", "success");
		modelAndView.addObject("msg", "Record has been updated!");
		logger.debug("updateOrDeleteDailyStatusReport() - START");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/deleteDailyStatusReport.html", method = RequestMethod.GET)
	public ModelAndView deleteDailyStatusReport(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
	{
		logger.debug("deleteDailyStatusReport() - START");
		logger.debug("Object Id : "+ request.getParameter("objectId"));
		String objectId = request.getParameter("objectId");
		Long longObjectId = Long.parseLong(objectId);
		commonService.deleteDailySatuReport(longObjectId);
		ModelAndView modelAndView = new ModelAndView("updateDelete");
		modelAndView.addObject("css", "success");
		modelAndView.addObject("msg", "Record has been deleted!");
		logger.debug("deleteDailyStatusReport() - END");
		return modelAndView;
	}
	
}
