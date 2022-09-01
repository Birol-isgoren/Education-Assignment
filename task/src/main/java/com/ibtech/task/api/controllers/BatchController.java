package com.ibtech.task.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibtech.task.batch.IXBatchService;

@RestController
@RequestMapping("/api/batch")
public class BatchController {

	private IXBatchService executer;

	@Autowired
	public BatchController(IXBatchService executer) {
		super();
		this.executer = executer;
	}


	@RequestMapping("/execute")
	public String add() {
		
		
		return this.executer.execute(5,10);

	}

}
