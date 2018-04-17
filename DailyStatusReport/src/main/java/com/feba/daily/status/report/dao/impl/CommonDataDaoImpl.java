package com.feba.daily.status.report.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.jboss.logging.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feba.daily.status.report.dao.CommonDataDao;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;
import com.feba.daily.status.report.persistance.RaidLog;
import com.feba.daily.status.report.persistance.RaidLogTestDesignSummary;
import com.feba.daily.status.report.service.impl.CommonServiceImpl;

@Repository
@Transactional
public class CommonDataDaoImpl implements CommonDataDao 
{
	final static Logger logger = Logger.getLogger(CommonDataDaoImpl.class);
	
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
	public void saveRaidLog(RaidLog raidLog) throws Exception
	{
		logger.debug("saveRaidLogTestDesignSummary() - START");
		
		manager.persist(raidLog);
		
		logger.debug("saveRaidLogTestDesignSummary() - END");
		
	}

	@Override
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date insertedDate)
	{
		logger.debug("searchByInsertedDateAndSPDId() - START");
		
		List<DailyStatusReportNFT> dailyStatusReportNFTs = manager.createQuery("Select a From DailyStatusReportNFT a", DailyStatusReportNFT.class).getResultList();
		
		/*Query query = em.createQuery("from STUDENT_INFO where StudentName = ?");
        query.setParameter(1, studentName);
         
        return (StudentInfo) query.getSingleResult();*/
		
		logger.debug("searchByInsertedDateAndSPDId() - END");
		
		return dailyStatusReportNFTs;
	}

}
