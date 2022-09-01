package com.ibtech.task.batch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibtech.task.business.abstracts.IAccountService;
import com.ibtech.task.business.abstracts.IBatchDataService;
import com.ibtech.task.entities.concretes.Account;
import com.ibtech.task.entities.concretes.BatchData;

public class OperationClass implements Runnable {
	
	@Autowired
	IAccountService<Account> accountService;
	@Autowired
	IBatchDataService dataService;
	int startNumber;
	
	int endNumber;



	public OperationClass(IAccountService<Account> accountService, IBatchDataService dataService, int startNumber, int endNumber) {
		super();
		this.accountService = accountService;
		this.dataService = dataService;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	@Override
	public void run() {
		
		List<BatchData> dataList = dataService.getData(startNumber, endNumber);
		for (BatchData batchData : dataList) {
			int amount = batchData.getTransactionType().equals("A") ? batchData.getAmount() : batchData.getAmount() * -1;
			accountService.changeAmount(amount);
			dataService.updateStatu(batchData.getSiraNo());
			
		}
		/*System.out.println("thread sleep");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread wake up");
		*/
	}

	
}
