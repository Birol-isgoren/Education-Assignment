package com.ibtech.task.business.abstracts;

import java.util.List;

import com.ibtech.task.entities.concretes.BatchData;

public interface IBatchDataService {

	long getCountActiveStatus();
	
	void updateStatu(int siraNo);
	
	List<BatchData> getData(int startNo, int endNo);
}
