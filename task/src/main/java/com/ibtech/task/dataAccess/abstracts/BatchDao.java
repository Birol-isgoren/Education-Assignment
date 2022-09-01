package com.ibtech.task.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.BatchData;

public interface BatchDao extends JpaRepository<BatchData,Integer> {

	BatchData getBySiraNo(int siraNo);
	
	long countByStatus(int statu);
	List<BatchData> findBySiraNoBetweenAndStatus(int startNo, int endNo, int statu);
}
