package com.feba.daily.status.report.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.bean.RaidLogBean;
import com.feba.daily.status.report.bean.TestDesignSummaryBean;
import com.feba.daily.status.report.bean.TestExecutionSummaryBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.TestDefectSummary;
import com.feba.daily.status.report.persistance.TestDesignSummary;
import com.feba.daily.status.report.persistance.TestExecutionSummary;
import com.feba.daily.status.report.service.CommonService;
import com.feba.daily.status.report.util.DailyStatusReportUtil;
import com.feba.daily.status.report.util.DropDownMenu;
import com.feba.daily.status.report.validator.InputValidator;


@Controller
public class DailyStatusReportController 
{
	final static Logger logger = Logger.getLogger(DailyStatusReportController.class);
		
	@Autowired
	CommonService commonService;
	
	@Autowired(required=true)
	InputValidator inputValidator;
	
	boolean isFirstTimeSearch = false;
	
	private String searchDate;
	
	private String searchSdpId;
	
	public DailyStatusReportController()
	{
		BasicConfigurator.configure();
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(inputValidator);
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
//		List<RaidLogBean> raidLogBeans = new LinkedList<RaidLogBean>();
		DropDownMenu dropDownMenu = new DropDownMenu();
		ModelAndView modelAndView = new ModelAndView("input");
		dailyStatusReportBean.setReportDate(new Date());
		String todayDate = DailyStatusReportUtil.getDateToStringDate(new Date(), "MM/dd/yyyy");
		modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
		modelAndView.addObject("todayDate", todayDate);
//		modelAndView.addObject("raidLogBeans", raidLogBeans);
		logger.debug("loadDailyStatusReportNFT() - END");
		return modelAndView;
	}
	
	@RequestMapping(value = "/submitDailyStatusReport.html", method = RequestMethod.POST)
	public ModelAndView submitDailyStatusReportNFT(@ModelAttribute("userForm") @Validated DailyStatusReportBean dailyStatusReportBean, 
			BindingResult result, Model model, final RedirectAttributes redirectAttributes, HttpServletRequest request)
	{
		logger.debug("submitDailyStatusReportNFT() - START");
		ModelAndView modelAndView = null;
		if (result.hasErrors()) 
		{
			DropDownMenu dropDownMenu = new DropDownMenu();
			modelAndView = new ModelAndView("input");
			modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
		} 
		else 
		{
			try
			{
				List<RaidLogBean> raidLogBeanList = new LinkedList<RaidLogBean>();
				List<TestExecutionSummaryBean> testExecutionSummaryBeansList = new LinkedList<TestExecutionSummaryBean>();
				List<TestDesignSummaryBean> testDesignSummaryBeansList = new LinkedList<TestDesignSummaryBean>();
				
				RaidLogBean raidLogBean = null;
				TestDesignSummaryBean testDesignSummaryBean = null;
				TestExecutionSummaryBean testExecutionSummaryBean = null;
				
				if(request.getParameter("rowCount") != null && !"".equals(request.getParameter("rowCount")) && request.getParameter("rowCount").length() > 0)
				{
					int rowCount = Integer.parseInt(request.getParameter("rowCount"));
					System.out.println("Row Count Value "+rowCount);
					logger.debug("Row Count Value "+rowCount);
					for(int i = 1; i <= rowCount; i++)
					{
						System.out.println("Type Value : "+request.getParameter("type"+i));
						logger.debug("Type Value : "+request.getParameter("type"+i));
						raidLogBean = new RaidLogBean();
						raidLogBean.setType(request.getParameter("type"+i));
						raidLogBean.setImpactedApp(request.getParameter("impactedApp"+i));
						raidLogBean.setDescription(request.getParameter("description"+i));
						raidLogBean.setStatus(request.getParameter("status"+i));
						raidLogBean.setPortfolioManager(request.getParameter("portfolioManager"+i));
						raidLogBean.setRadiOwner(request.getParameter("radiOwner"+i));
						raidLogBean.setRag(request.getParameter("rag"+i));
						logger.debug("Logged Date : "+request.getParameter("dateLogged"+i));
						Date loggedDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("dateLogged"+i));
						raidLogBean.setDateLogged(loggedDate);
						Date targetClosureDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("targetClosureDate"+i));
						raidLogBean.setTargetClosureDate(targetClosureDate);
						raidLogBean.setAge(request.getParameter("age"+i));
						raidLogBean.setMileStoneImpacted(request.getParameter("mileStoneImpacted"+i));
						raidLogBean.setRaidBackToGreenPlan(request.getParameter("raidBackToGreenPlan"+i));
						raidLogBeanList.add(raidLogBean);
					}
					dailyStatusReportBean.setRaidLogBeanList(raidLogBeanList);
				}
				
				if(request.getParameter("testDesignSummaryRowCount") != null && !"".equals(request.getParameter("testDesignSummaryRowCount")) && request.getParameter("testDesignSummaryRowCount").length() > 0)
				{
					int rowCount = Integer.parseInt(request.getParameter("testDesignSummaryRowCount"));
					for(int i = 1; i <= rowCount; i++)
					{
						testDesignSummaryBean = new TestDesignSummaryBean();
						testDesignSummaryBean.setApplicationTrackType((request.getParameter("applicationTrack"+i) == null ) ? "NA" : request.getParameter("applicationTrack"+i));
						testDesignSummaryBean.setTotal((request.getParameter("tdsTotal"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsTotal"+i)));
						testDesignSummaryBean.setInProgress((request.getParameter("tdsInProgress"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsInProgress"+i)));
						testDesignSummaryBean.setOnHold((request.getParameter("tdsOnHold"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsOnHold"+i)));
						testDesignSummaryBean.setCompleted((request.getParameter("tdsCompleted"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsCompleted"+i)));
						
						testDesignSummaryBeansList.add(testDesignSummaryBean);
					}
					dailyStatusReportBean.setTestDesignSummaryList(testDesignSummaryBeansList);
				}
				
				if(request.getParameter("testExectuionSummaryRowCount") != null && !"".equals(request.getParameter("testExectuionSummaryRowCount")) && request.getParameter("testExectuionSummaryRowCount").length() > 0)
				{
					int rowCount = Integer.parseInt(request.getParameter("testExectuionSummaryRowCount"));
					for(int i = 1; i <= rowCount; i++)
					{
						testExecutionSummaryBean = new TestExecutionSummaryBean();
						testExecutionSummaryBean.setApplicationTrackType((request.getParameter("tesApplicationTrack"+i) == null ) ? "NA" : request.getParameter("tesApplicationTrack"+i));
						testExecutionSummaryBean.setTotatlScenario((request.getParameter("totalScenario"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalScenario"+i)));
						testExecutionSummaryBean.setTotalTestRun((request.getParameter("totalTestRun"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRun"+i)));
						testExecutionSummaryBean.setTotalTestPass((request.getParameter("totalTestRunPass"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunPass"+i)));
						testExecutionSummaryBean.setTotalTestFailed((request.getParameter("totalTestRunFailed"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunFailed"+i)));
												
						testExecutionSummaryBeansList.add(testExecutionSummaryBean);
					}
					dailyStatusReportBean.setTestExecutionSummaryList(testExecutionSummaryBeansList);
				}
				
				modelAndView = new ModelAndView("input");
				commonService.saveDailStatusReport(dailyStatusReportBean);
				modelAndView.addObject("css", "success");
				modelAndView.addObject("msg", "Record inserted successfully!");
				
				logger.debug("submitDailyStatusReportNFT() - END");
			} catch (Exception e)
			{
				logger.error("Error Occured during saving data : ", e);
				modelAndView = new ModelAndView("input");
				modelAndView.addObject("css", "success");
				modelAndView.addObject("msg", "Duplicate Entry please insert uniqueu record!");
			}
			
		}
		return modelAndView;
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
	
	@RequestMapping(value = "/loadUpdateDelete.html", method = RequestMethod.GET)
	public ModelAndView loadUpdateDeleteForm(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
	{
		logger.debug("loadDailyStatusReportNFT() - START");
		ModelAndView modelAndView = new ModelAndView("updateDelete");
		try
		{
			String dateIn = request.getParameter("searchDate");
			String searchSdpId = request.getParameter("searchSdpId");
			Date searchDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", dateIn);
			this.searchDate = dateIn;
			this.searchSdpId = searchSdpId;
			
			List<DailyStatusReportNFT> dailyStatusReportNFTs;
			dailyStatusReportNFTs =  commonService.searchByInsertedDateAndSPDId(searchDate, searchSdpId);
			DailyStatusReportNFT dailyStatusReportNFT = dailyStatusReportNFTs.get(0);
			BeanUtils.copyProperties(dailyStatusReportNFT, dailyStatusReportBean);
			
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
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("CD"))
				{
					dailyStatusReportBean.setApplicationTrackCdId(var.getId());
					dailyStatusReportBean.setApplicationTrackCdTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackCdInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackCdOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackCdCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("STATE STREET"))
				{
					dailyStatusReportBean.setApplicationTrackStateStreetId(var.getId());
					dailyStatusReportBean.setApplicationTrackStateStreetTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackStateStreetInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackStateStreetOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackStateStreetCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("SHARED SERVICES"))
				{
					dailyStatusReportBean.setApplicationTrackSharedServicesId(var.getId());
					dailyStatusReportBean.setApplicationTrackSharedServicesTotal(var.getTotal());
					dailyStatusReportBean.setApplicationTrackSharedServicesInProgress(var.getInProgress());
					dailyStatusReportBean.setApplicationTrackSharedServicesOnHold(var.getOnHold());
					dailyStatusReportBean.setApplicationTrackSharedServicesCompleted(var.getCompleted());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("CITI CONNECT"))
				{
					dailyStatusReportBean.setApplicationTrackCitiConnectId(var.getId());
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
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("CD"))
				{
					dailyStatusReportBean.setTedsAppTrackCdId(var.getId());
					dailyStatusReportBean.setTedsAppTrackCdTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackCdTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackCdTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackCdTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("STATE STREET"))
				{
					dailyStatusReportBean.setTedsAppTrackStateStreetId(var.getId());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackStateStreetTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("SHARED SERVICES"))
				{
					dailyStatusReportBean.setTedsAppTrackSharedServicesId(var.getId());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackSharedServicesTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("CITI CONNECT"))
				{
					dailyStatusReportBean.setTedsAppTrackCitiConnectId(var.getId());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalScenario(var.getTotatlScenario());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalTestRuns(var.getTotalTestRun());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalRunPass(var.getTotalTestPass());
					dailyStatusReportBean.setTedsAppTrackCitiConnectTotalRunFailed(var.getTotalTestFailed());
				}
				if(var.getApplicationTrackType() != null && var.getApplicationTrackType().equals("E2E"))
				{
					dailyStatusReportBean.setTedsAppTrackE2EId(var.getId());
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
					dailyStatusReportBean.setFirstRowId(var.getId());
					dailyStatusReportBean.setFirstRowOpen(var.getOpne());
					dailyStatusReportBean.setFirstRowClosed(var.getClosed());
					dailyStatusReportBean.setFirstRowRejected(var.getRejected());
					dailyStatusReportBean.setFirstRowDefered(var.getDefered());
					dailyStatusReportBean.setFirstRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 2L)
				{
					dailyStatusReportBean.setSecondRowId(var.getId());
					dailyStatusReportBean.setSecondRowOpen(var.getOpne());
					dailyStatusReportBean.setSecondRowClosed(var.getClosed());
					dailyStatusReportBean.setSecondRowRejected(var.getRejected());
					dailyStatusReportBean.setSecondRowDefered(var.getDefered());
					dailyStatusReportBean.setSecondRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 3L)
				{
					dailyStatusReportBean.setThirdRowId(var.getId());
					dailyStatusReportBean.setThirdRowOpen(var.getOpne());
					dailyStatusReportBean.setThirdRowClosed(var.getClosed());
					dailyStatusReportBean.setThirdRowRejected(var.getRejected());
					dailyStatusReportBean.setThirdRowDefered(var.getDefered());
					dailyStatusReportBean.setThirdRowReOpned(var.getReOpened());
				}
				if(var.getSeverity() == 4L)
				{
					dailyStatusReportBean.setFourthRowId(var.getId());
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
			modelAndView.addObject("raidLogStausDropDownList", dropDownMenu.raidLogStausDropDownList());
			logger.debug("RaidLog list size : "+dailyStatusReportNFT.getRaidLogs().size());
			modelAndView.addObject("raidLogsList", dailyStatusReportNFT.getRaidLogs());
			modelAndView.addObject("testDesignSummary", dailyStatusReportNFT.getTestDesignSummaries());
			modelAndView.addObject("testExecutionSummary", dailyStatusReportNFT.getTestExecutionSummaries());
			
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
	public ModelAndView updateOrDeleteDailyStatusReport(@ModelAttribute("userForm") @Validated DailyStatusReportBean dailyStatusReportBean, 
			BindingResult result, Model model, final RedirectAttributes redirectAttributes, HttpServletRequest request)
	{
		logger.debug("updateOrDeleteDailyStatusReport() - START");
		logger.debug("updateOrDeleteDailyStatusReport Object Id : "+ dailyStatusReportBean.getId());
		ModelAndView modelAndView = new ModelAndView("updateDelete");
		if (result.hasErrors()) 
		{
			DropDownMenu dropDownMenu = new DropDownMenu();
			modelAndView.addObject("trackWiseStausDropDownList", dropDownMenu.trackWiseStausDropDownList());
			return modelAndView;
		} 
		else 
		{
			try
			{
				String addAsANewRecord = request.getParameter("addAsANewRecord");
				if("Yes".equals(addAsANewRecord))
				{
					List<RaidLogBean> raidLogBeanList = new LinkedList<RaidLogBean>();
					List<TestExecutionSummaryBean> testExecutionSummaryBeansList = new LinkedList<TestExecutionSummaryBean>();
					List<TestDesignSummaryBean> testDesignSummaryBeansList = new LinkedList<TestDesignSummaryBean>();
					
					RaidLogBean raidLogBean = null;
					TestDesignSummaryBean testDesignSummaryBean = null;
					TestExecutionSummaryBean testExecutionSummaryBean = null;
					
					if(request.getParameter("rowCount") != null && !"".equals(request.getParameter("rowCount")) && request.getParameter("rowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("rowCount"));
						System.out.println("Row Count Value "+rowCount);
						logger.debug("Row Count Value "+rowCount);
						for(int i = 1; i <= rowCount; i++)
						{
							System.out.println("Type Value : "+request.getParameter("type"+i));
							logger.debug("Type Value : "+request.getParameter("type"+i));
							raidLogBean = new RaidLogBean();
							logger.debug("RaidLog Id : "+request.getParameter("id"+i));
							System.out.println("RaidLog Id : "+request.getParameter("id"+i));
	//						raidLogBean.setId(Long.parseLong(request.getParameter("id"+i)));
	//						raidLogBean.setType(request.getParameter("type"+i));
							raidLogBean.setImpactedApp(request.getParameter("impactedApp"+i));
							raidLogBean.setDescription(request.getParameter("description"+i));
							raidLogBean.setStatus(request.getParameter("status"+i));
							raidLogBean.setPortfolioManager(request.getParameter("portfolioManager"+i));
							raidLogBean.setRadiOwner(request.getParameter("radiOwner"+i));
							raidLogBean.setRag(request.getParameter("rag"+i));
							logger.debug("Logged Date : "+request.getParameter("dateLogged"+i));
							Date loggedDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("dateLogged"+i));
							raidLogBean.setDateLogged(loggedDate);
							Date targetClosureDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("targetClosureDate"+i));
							raidLogBean.setTargetClosureDate(targetClosureDate);
							raidLogBean.setAge(request.getParameter("age"+i));
							raidLogBean.setMileStoneImpacted(request.getParameter("mileStoneImpacted"+i));
							raidLogBean.setRaidBackToGreenPlan(request.getParameter("raidBackToGreenPlan"+i));
							raidLogBeanList.add(raidLogBean);
						}
						dailyStatusReportBean.setRaidLogBeanList(raidLogBeanList);
					}
					
					if(request.getParameter("testDesignSummaryRowCount") != null && !"".equals(request.getParameter("testDesignSummaryRowCount")) && request.getParameter("testDesignSummaryRowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("testDesignSummaryRowCount"));
						for(int i = 1; i <= rowCount; i++)
						{
							testDesignSummaryBean = new TestDesignSummaryBean();
							testDesignSummaryBean.setApplicationTrackType((request.getParameter("applicationTrack"+i) == null ) ? "NA" : request.getParameter("applicationTrack"+i));
							testDesignSummaryBean.setTotal((request.getParameter("tdsTotal"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsTotal"+i)));
							testDesignSummaryBean.setInProgress((request.getParameter("tdsInProgress"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsInProgress"+i)));
							testDesignSummaryBean.setOnHold((request.getParameter("tdsOnHold"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsOnHold"+i)));
							testDesignSummaryBean.setCompleted((request.getParameter("tdsCompleted"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsCompleted"+i)));
							
							testDesignSummaryBeansList.add(testDesignSummaryBean);
						}
						dailyStatusReportBean.setTestDesignSummaryList(testDesignSummaryBeansList);
					}
					
					if(request.getParameter("testExectuionSummaryRowCount") != null && !"".equals(request.getParameter("testExectuionSummaryRowCount")) && request.getParameter("testExectuionSummaryRowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("testExectuionSummaryRowCount"));
						for(int i = 1; i <= rowCount; i++)
						{
							testExecutionSummaryBean = new TestExecutionSummaryBean();
							testExecutionSummaryBean.setApplicationTrackType((request.getParameter("tesApplicationTrack"+i) == null ) ? "NA" : request.getParameter("tesApplicationTrack"+i));
							testExecutionSummaryBean.setTotatlScenario((request.getParameter("totalScenario"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalScenario"+i)));
							testExecutionSummaryBean.setTotalTestRun((request.getParameter("totalTestRun"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRun"+i)));
							testExecutionSummaryBean.setTotalTestPass((request.getParameter("totalTestRunPass"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunPass"+i)));
							testExecutionSummaryBean.setTotalTestFailed((request.getParameter("totalTestRunFailed"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunFailed"+i)));
													
							testExecutionSummaryBeansList.add(testExecutionSummaryBean);
						}
						dailyStatusReportBean.setTestExecutionSummaryList(testExecutionSummaryBeansList);
					}
					
					commonService.saveDailStatusReport(dailyStatusReportBean);
					modelAndView.addObject("css", "success");
					modelAndView.addObject("msg", "Record inserted successfully!");
				}
				else
				{
					List<RaidLogBean> raidLogBeanList = new LinkedList<RaidLogBean>();
					List<TestExecutionSummaryBean> testExecutionSummaryBeansList = new LinkedList<TestExecutionSummaryBean>();
					List<TestDesignSummaryBean> testDesignSummaryBeansList = new LinkedList<TestDesignSummaryBean>();
					
					RaidLogBean raidLogBean = null;
					TestDesignSummaryBean testDesignSummaryBean = null;
					TestExecutionSummaryBean testExecutionSummaryBean = null;
					
					if(request.getParameter("rowCount") != null && !"".equals(request.getParameter("rowCount")) && request.getParameter("rowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("rowCount"));
						System.out.println("Row Count Value "+rowCount);
						logger.debug("Row Count Value "+rowCount);
						for(int i = 1; i <= rowCount; i++)
						{
							System.out.println("Type Value : "+request.getParameter("type"+i));
							logger.debug("Type Value : "+request.getParameter("type"+i));
							raidLogBean = new RaidLogBean();
							logger.debug("RaidLog Id : "+request.getParameter("id"+i));
							System.out.println("RaidLog Id : "+request.getParameter("id"+i));
							if(request.getParameter("id"+i) != null && !request.getParameter("id"+i).equals("") && request.getParameter("id"+i).length() > 0)
							{
								raidLogBean.setId(Long.parseLong(request.getParameter("id"+i)));
							}
							raidLogBean.setType(request.getParameter("type"+i));
							raidLogBean.setImpactedApp(request.getParameter("impactedApp"+i));
							raidLogBean.setDescription(request.getParameter("description"+i));
							raidLogBean.setStatus(request.getParameter("status"+i));
							raidLogBean.setPortfolioManager(request.getParameter("portfolioManager"+i));
							raidLogBean.setRadiOwner(request.getParameter("radiOwner"+i));
							raidLogBean.setRag(request.getParameter("rag"+i));
							logger.debug("Logged Date : "+request.getParameter("dateLogged"+i));
							Date loggedDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("dateLogged"+i));
							raidLogBean.setDateLogged(loggedDate);
							Date targetClosureDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", request.getParameter("targetClosureDate"+i));
							raidLogBean.setTargetClosureDate(targetClosureDate);
							raidLogBean.setAge(request.getParameter("age"+i));
							raidLogBean.setMileStoneImpacted(request.getParameter("mileStoneImpacted"+i));
							raidLogBean.setRaidBackToGreenPlan(request.getParameter("raidBackToGreenPlan"+i));
							raidLogBeanList.add(raidLogBean);
						}
						dailyStatusReportBean.setRaidLogBeanList(raidLogBeanList);
					}
					
					if(request.getParameter("testDesignSummaryRowCount") != null && !"".equals(request.getParameter("testDesignSummaryRowCount")) && request.getParameter("testDesignSummaryRowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("testDesignSummaryRowCount"));
						for(int i = 1; i <= rowCount; i++)
						{
							testDesignSummaryBean = new TestDesignSummaryBean();
							if(request.getParameter("tdsId"+i) != null && !request.getParameter("tdsId"+i).equals("") && request.getParameter("tdsId"+i).length() > 0)
							{
								testDesignSummaryBean.setId(Long.parseLong(request.getParameter("tdsId"+i)));
							}
							testDesignSummaryBean.setApplicationTrackType((request.getParameter("applicationTrack"+i) == null ) ? "NA" : request.getParameter("applicationTrack"+i));
							testDesignSummaryBean.setTotal((request.getParameter("tdsTotal"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsTotal"+i)));
							testDesignSummaryBean.setInProgress((request.getParameter("tdsInProgress"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsInProgress"+i)));
							testDesignSummaryBean.setOnHold((request.getParameter("tdsOnHold"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsOnHold"+i)));
							testDesignSummaryBean.setCompleted((request.getParameter("tdsCompleted"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("tdsCompleted"+i)));
							
							testDesignSummaryBeansList.add(testDesignSummaryBean);
						}
						dailyStatusReportBean.setTestDesignSummaryList(testDesignSummaryBeansList);
					}
					
					if(request.getParameter("testExectuionSummaryRowCount") != null && !"".equals(request.getParameter("testExectuionSummaryRowCount")) && request.getParameter("testExectuionSummaryRowCount").length() > 0)
					{
						int rowCount = Integer.parseInt(request.getParameter("testExectuionSummaryRowCount"));
						for(int i = 1; i <= rowCount; i++)
						{
							testExecutionSummaryBean = new TestExecutionSummaryBean();
							if(request.getParameter("tedId"+i) != null && !request.getParameter("tedId"+i).equals("") && request.getParameter("tedId"+i).length() > 0)
							{
								testExecutionSummaryBean.setId(Long.parseLong(request.getParameter("tedId"+i)));
							}
							testExecutionSummaryBean.setApplicationTrackType((request.getParameter("tesApplicationTrack"+i) == null ) ? "NA" : request.getParameter("tesApplicationTrack"+i));
							testExecutionSummaryBean.setTotatlScenario((request.getParameter("totalScenario"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalScenario"+i)));
							testExecutionSummaryBean.setTotalTestRun((request.getParameter("totalTestRun"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRun"+i)));
							testExecutionSummaryBean.setTotalTestPass((request.getParameter("totalTestRunPass"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunPass"+i)));
							testExecutionSummaryBean.setTotalTestFailed((request.getParameter("totalTestRunFailed"+i) == null ) ? 0 : Integer.parseInt(request.getParameter("totalTestRunFailed"+i)));
													
							testExecutionSummaryBeansList.add(testExecutionSummaryBean);
						}
						dailyStatusReportBean.setTestExecutionSummaryList(testExecutionSummaryBeansList);
					}
					
					commonService.updateDailyStatusReport(dailyStatusReportBean);
					modelAndView.addObject("css", "success");
					modelAndView.addObject("msg", "Record has been updated!");
				}
			
			} 
			catch (Exception e)
			{
				modelAndView.addObject("css", "fail");
				modelAndView.addObject("msg", "Duplicate Entry please insert uniqueu record!");
				e.printStackTrace();
			}
		}
		
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
	
	@RequestMapping(value = "/deleteRaidLogById.html", method = RequestMethod.GET)
	public String deleteRaidLogById(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
	{
		logger.debug("deleteDailyStatusReport() - START");
		logger.debug("Object Id : "+ request.getParameter("objectId"));
		String raidLogIdStr = request.getParameter("raidLogId");
		Long raidLogId = Long.parseLong(raidLogIdStr);
		commonService.deleteRaidLogById(raidLogId);
		ModelAndView modelAndView = new ModelAndView("updateDelete");
//		modelAndView.addObject("css", "success");
//		modelAndView.addObject("msg", "Record has been deleted!");
		logger.debug("deleteDailyStatusReport() - END");
		return "redirect:loadUpdateDelete.html?searchDate="+searchDate+"&searchSdpId="+searchSdpId+"";
	}
	
	@RequestMapping(value = "/deleteTestDesignSummaryById.html", method = RequestMethod.GET)
	public String deleteTestDesignSummaryById(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
	{
		logger.debug("deleteDailyStatusReport() - START");
		String tdsIdStr = request.getParameter("tdsId");
		Long tdsId = Long.parseLong(tdsIdStr);
		commonService.deleteTestDesignSummaryById(tdsId);
		ModelAndView modelAndView = new ModelAndView("updateDelete");
//		modelAndView.addObject("css", "success");
//		modelAndView.addObject("msg", "Record has been deleted!");
		logger.debug("deleteDailyStatusReport() - END");
		return "redirect:loadUpdateDelete.html?searchDate="+searchDate+"&searchSdpId="+searchSdpId+"";
	}
	
	@RequestMapping(value = "/deleteTestExecutionSummaryById.html", method = RequestMethod.GET)
	public String deleteTestExecutionSummaryById(@ModelAttribute("userForm") DailyStatusReportBean dailyStatusReportBean, HttpServletRequest request)
	{
		//loadUpdateDelete.html?searchDate=2018-05-07&searchSdpId=4444
		logger.debug("deleteDailyStatusReport() - START");
		String tedIdStr = request.getParameter("tedId");
		Long tedId = Long.parseLong(tedIdStr);
		commonService.deleteTestExecutionSummaryById(tedId);
		ModelAndView modelAndView = new ModelAndView("updateDelete");
//		modelAndView.addObject("css", "success");
//		modelAndView.addObject("msg", "Record has been deleted!");
		logger.debug("deleteDailyStatusReport() - END");
		return "redirect:loadUpdateDelete.html?searchDate="+searchDate+"&searchSdpId="+searchSdpId+"";
	}
	
}
