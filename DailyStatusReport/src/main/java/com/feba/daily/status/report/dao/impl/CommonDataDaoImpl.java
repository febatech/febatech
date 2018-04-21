package com.feba.daily.status.report.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feba.daily.status.report.dao.CommonDataDao;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLogTestDesignSummary;
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
	public void saveRaidLogTestDesignSummary(RaidLogTestDesignSummary raidLogTestDesignSummary) throws Exception
	{
		logger.debug("saveRaidLogTestDesignSummary() - START");
		
		manager.persist(raidLogTestDesignSummary);
		
		logger.debug("saveRaidLogTestDesignSummary() - END");
		
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
		Query query = manager.createQuery("Select dsr from DailyStatusReportNFT dsr where dsr.insertedDate >=:arg1 AND dsr.sdpId =:arg2");
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
		manager.merge(dailyStatusReportNFT);
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

}
