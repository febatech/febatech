package com.feba.daily.status.report.dao.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feba.daily.status.report.dao.CommonDataDao;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLog;
import com.feba.daily.status.report.util.DailyStatusReportUtil;

@Repository
@Transactional
public class CommonDataDaoImpl implements CommonDataDao 
{
	final static Logger logger = Logger.getLogger(CommonDataDaoImpl.class);
	
	public CommonDataDaoImpl()
	{
		BasicConfigurator.configure();
	}
	
    @PersistenceContext
    private EntityManager manager;
    
	@Override
	public void saveNFT(DailyStatusReportNFT dailyStatusReportNFT) throws Exception
	{
		logger.debug("insertNFT() - START");
		
		manager.persist(dailyStatusReportNFT);
		
		logger.debug("insertNFT() - END");
	}

	@Override
	public void saveRaidLog(DailyStatusReportNFT dailyStatusReportNFT) throws Exception
	{
		logger.debug("saveRaidLogTestDesignSummary() - START");
		manager.persist(dailyStatusReportNFT);
		logger.debug("saveRaidLogTestDesignSummary() - END");
		
	}

	@Override
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date insertedDate, String spdId) throws NoResultException
	{
		List<DailyStatusReportNFT> list = new ArrayList<DailyStatusReportNFT>();
		logger.debug("searchByInsertedDateAndSPDId() - START");
		logger.debug("Inserted Date : "+insertedDate);
		logger.debug("SPD Id : "+spdId);
		String tempDate = DailyStatusReportUtil.getDateFormat("yyyy-MM-dd").format(insertedDate);
		Date inputDate = DailyStatusReportUtil.getDateObject("yyyy-MM-dd", tempDate);
//		List<DailyStatusReportNFT> dailyStatusReportNFTs = (List<DailyStatusReportNFT>)manager.createQuery("Select a From DailyStatusReportNFT a").getResultList();
		Query query = manager.createQuery("Select dsr from DailyStatusReportNFT dsr where dsr.reportDate =:arg1 AND dsr.sdpId =:arg2");
		query.setParameter("arg1", inputDate);
		query.setParameter("arg2", spdId);
		DailyStatusReportNFT dailyStatusReportNFT = (DailyStatusReportNFT) query.getSingleResult();
		
		list.add(dailyStatusReportNFT);
		logger.debug("searchByInsertedDateAndSPDId() - END");
			 
		return list;
//		return dailyStatusReportNFTs;
	}

	@Override
	public List<DailyStatusReportNFT> searchBySDPId(String spdId) throws NoResultException
	{
		logger.debug("searchByInsertedDateAndSPDId() - START");
		List<DailyStatusReportNFT> list = new ArrayList<DailyStatusReportNFT>();
		Query query = manager.createQuery("Select dsr from DailyStatusReportNFT dsr where dsr.sdpId =:arg1");
		query.setParameter("arg1", spdId);
		DailyStatusReportNFT dailyStatusReportNFT = (DailyStatusReportNFT) query.getSingleResult();
		list.add(dailyStatusReportNFT);
		logger.debug("searchByInsertedDateAndSPDId() - END");
			 
		return list;
	}

	@Override
	public void updateDailyStatusReport(DailyStatusReportNFT dailyStatusReportNFT)
	{
		logger.debug("updateDailyStatusReport() - START");
		DailyStatusReportNFT dailyStatusReportNFT2= (DailyStatusReportNFT)manager.find(DailyStatusReportNFT.class ,dailyStatusReportNFT.getId());
		BeanUtils.copyProperties(dailyStatusReportNFT, dailyStatusReportNFT2);
		manager.merge(dailyStatusReportNFT2);
		logger.debug("updateDailyStatusReport() - END");
	}

	@Override
	public void deleteDailySatuReport(Long objectId)
	{
		logger.debug("deleteDailySatuReport() - START");
		Query query = manager.createQuery("Select dsr from DailyStatusReportNFT dsr where dsr.id =:arg1");
		query.setParameter("arg1", objectId);
		DailyStatusReportNFT dailyStatusReportNFT = (DailyStatusReportNFT) query.getSingleResult();
		manager.remove(dailyStatusReportNFT);
		logger.debug("deleteDailySatuReport() - END");
		
	}

	@Override
	public void deleteRaidLogById(Long objectId)
	{
		logger.debug("deleteRaidLogById() - START");
		/*Query query = manager.createQuery("Select rd from RaidLog rd where rd.id =:arg1");
		query.setParameter("arg1", objectId);
		RaidLog raidLog  = (RaidLog) query.getSingleResult();
		manager.remove(raidLog);*/
		Query query = manager.createNativeQuery("DELETE FROM RAID_LOG WHERE ID = " + objectId);
		query.executeUpdate();
		logger.debug("deleteRaidLogById() - END");
		
	}

	@Override
	public void deleteTestDesignSummaryById(Long objectId)
	{
		logger.debug("deleteTestDesignSummaryById() - START");
		Query query = manager.createNativeQuery("DELETE FROM TEST_DESIGN_SUMMARY WHERE TEST_DGN_SMRY_ID = " + objectId);
		query.executeUpdate();
		logger.debug("deleteTestDesignSummaryById() - END");
		
	}

	@Override
	public void deleteTestExecutionSummaryById(Long objectId)
	{
		logger.debug("deleteTestExecutionSummaryById() - START");
		Query query = manager.createNativeQuery("DELETE FROM TEST_EXECUTION_SUMMARY WHERE TEST_EXEC_SMRY_ID = " + objectId);
		query.executeUpdate();
		logger.debug("deleteTestExecutionSummaryById() - END");
		
	}
	
	@Override
	public Map<String, Long> getLOBNFSReportDetails(Date reportDate)
	{
		logger.debug("getLOBNFSReportDetails() - START");
		String dbType = null;
		String queryChunk = null;
		String tempDate = DailyStatusReportUtil.getDateFormat("yyyy-MM-dd").format(reportDate);
		
		Map<String, Long> map = new LinkedHashMap<String, Long>();
		
		EntityManagerFactory emf = manager.getEntityManagerFactory();
		
		Map<String, Object> props = emf.getProperties();
		
		logger.debug("Entity Manager Faactory properties : "+props);
		
		String dialectType = (String)props.get("hibernate.dialect");
		
		logger.debug("Dialect Type : "+dialectType);
		
		
		if(dialectType.contains("Oracle")){
			// Database is Oracle
			logger.debug("Which data base dialect ? : "+dialectType);
			dbType = "Oracle";
			queryChunk = "TO_DATE('"+tempDate+"', 'YYYY-MM-DD')";
		}
		
		
		if(dialectType.contains("MySQL5Dialect")){
			// Database is MySql 
			logger.debug("Which data base dialect ? : "+dialectType);
			dbType = "MySQL";
			queryChunk = "STR_TO_DATE('"+tempDate+"', '%Y-%m-%d')";
		}
		
		if(dialectType.contains("SQLServerDialect")){
			// Database is SQL Server 
			dbType = "MSSql";
			logger.debug("Which data base dialect ? : "+dialectType);
			queryChunk = "convert(varchar, '"+tempDate+"',  23)";
		}
		
		logger.debug("get details for the NFS Report ");
//		String reportDateString = DailyStatusReportUtil.getDateFormat("yyyy-MM-dd").format(reportDate);
		Query query = null;
		if(reportDate == null ){
			query = manager.createNativeQuery("Select count(DAILY_STS_RPT_ID) as count, LOBS from DAILY_STATUS_REPORT_NFT group by LOBS");
		}else{
			query = manager.createNativeQuery("Select count(DAILY_STS_RPT_ID) as count, LOBS from DAILY_STATUS_REPORT_NFT where REPORT_DATE = "+queryChunk+" group by LOBS");
		}

		@SuppressWarnings("unchecked")
		List<Object[]> listObjects = query.getResultList();
		for(Object[] objArr : listObjects)
		{
			logger.debug("Inside For Loop : "+objArr[0]+" : "+objArr[1]);
			logger.debug("Data Type of Count from SQL Query : "+((objArr[0]).getClass()));
			Long count = 0L;
			if(dbType.equals("MSSql"))
			{
				count = ((Integer)objArr[0]).longValue();
			}
			else if(dbType.equals("MySQL"))
			{
				count = ((BigInteger)objArr[0]).longValue();
			}
			else
			{
				count = (Long)objArr[0];
			}
			
		    
		    String lobs = (String)objArr[1];
		    map.put(lobs, count);
		    logger.debug("Data added in HashMap : "+map);
		    System.out.println(count + " : " +lobs);
		}
		logger.debug("getLOBNFSReportDetails() - END");
		return map;
	}
}
