package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.business.abstracts.IBatchDataService;
import com.ibtech.task.dataAccess.abstracts.BatchDao;
import com.ibtech.task.entities.concretes.BatchData;

@Service
public class  BatchDataManager implements IBatchDataService {
	
	private BatchDao batchDao;

	@Autowired
	public BatchDataManager(BatchDao batchDao) {
		super();
		this.batchDao = batchDao;
	}

	@Override
	public long getCountActiveStatus() {
		
		return batchDao.countByStatus(0);
	}


	public String add(BatchData batchData) {
		
		this.batchDao.save(batchData);
		return "Kayit eklendi " ;
	}

	@Override
	public void updateStatu(int siraNo) {
		BatchData data = this.batchDao.getBySiraNo(siraNo);
		data.setStatus(1);
		this.batchDao.save(data);
	}

	@Override
	public List<BatchData> getData(int startNo, int endNo) {
		List<BatchData> dataList = batchDao.findBySiraNoBetweenAndStatus(startNo, endNo, 0);
		return dataList;
	}



}
