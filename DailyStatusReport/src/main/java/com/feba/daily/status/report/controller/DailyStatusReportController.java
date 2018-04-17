package com.feba.daily.status.report.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
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
import com.feba.daily.status.report.service.CommonService;
import com.feba.daily.status.report.util.DropDownMenu;


@Controller
public class DailyStatusReportController 
{
	final static Logger logger = Logger.getLogger(DailyStatusReportController.class);
		
	@Autowired
	CommonService commonService;
	
	
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
		
		DropDownMenu dropDownMenu = new DropDownMenu();
		ModelAndView modelAndView = new ModelAndView("search");
//		modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
		logger.debug("loadDailyStatusReportNFT() - END");
		return modelAndView;
	}
	
	@RequestMapping(value = "/searchDailyStaturReport.html", method = RequestMethod.POST)
	public ModelAndView searchDailyStaturReport(@ModelAttribute("searchForm") DailyStatusReportBean dailyStatusReportBean)
	{
		logger.debug("searchDailyStaturReport() - START");
		
		logger.debug("Search Date : "+dailyStatusReportBean.getSearchDate());
		Date searchDate = dailyStatusReportBean.getSearchDate();
		
		DropDownMenu dropDownMenu = new DropDownMenu();
		ModelAndView modelAndView = new ModelAndView("search");
		
		List<DailyStatusReportNFT> dailyStatusReportNFTs =  commonService.searchByInsertedDateAndSPDId(searchDate);
		if(CollectionUtils.isNotEmpty(dailyStatusReportNFTs))
		{
			logger.debug("Daily Status Report Object : "+dailyStatusReportNFTs);
			modelAndView.addObject("dailyStatusReportNFTObject", dailyStatusReportNFTs.get(0));
		}
		else
		{
			logger.debug("No Record Found");
		}
		
		
		logger.debug("searchDailyStaturReport() - END");
		return modelAndView;
	}
	
}
