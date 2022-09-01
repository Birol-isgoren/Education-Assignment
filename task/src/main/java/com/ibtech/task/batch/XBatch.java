package com.ibtech.task.batch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.business.abstracts.IAccountService;
import com.ibtech.task.business.abstracts.IBatchDataService;
import com.ibtech.task.entities.concretes.Account;

@Service
public class XBatch implements IXBatchService {

	IBatchDataService dataService;
	IAccountService<Account> accountService;

	@Autowired
	public XBatch(IBatchDataService dataService, IAccountService<Account> accountService) {
		super();
		this.dataService = dataService;
		this.accountService = accountService;
	}

	public String execute(int thread, int commitCount) {
		int startNumber = 1;
		int endNumber = 0;
		int dataCount = findFirstEndNumber(thread);

		ExecutorService executorService = Executors.newFixedThreadPool(thread);

		for (int i = 1; i <= thread; i++) {
			endNumber = (int) (i * dataCount);
			Runnable runnable = new OperationClass(accountService, dataService, startNumber, endNumber);
			executorService.execute(runnable);
			startNumber = endNumber + 1;
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			// wait
		}
		return "Finish";
	}

	private int findFirstEndNumber(int thread) {

		long recordCount = dataService.getCountActiveStatus();
		int dataCount = (int) Math.ceil(recordCount / (double) thread);
		return dataCount;
	}

}
