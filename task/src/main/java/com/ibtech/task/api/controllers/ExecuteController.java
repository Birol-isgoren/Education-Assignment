package com.ibtech.task.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibtech.task.bag.XBag;
import com.ibtech.task.constants.CustomerBagConstants;
import com.ibtech.task.constants.ResponseConstants;

import com.ibtech.task.executer.IExecuter;

@RestController
@RequestMapping("/api/executer")
public class ExecuteController {

	private IExecuter executer;

	@Autowired
	public ExecuteController(IExecuter executer) {
		super();
		this.executer = executer;
	}


	@RequestMapping("/execute")
	public String add() {
		
		XBag inBag = new XBag();
		inBag.put("PARAMETER_COMMAND", "customerAdd");
		inBag.put(CustomerBagConstants.CUSTOMER_NUMBER, 5);
		inBag.put(CustomerBagConstants.CUSTOMER_NAME, "Erol");
		inBag.put(CustomerBagConstants.CUSTOMER_SURNAME, "İşgören");
		inBag.put(CustomerBagConstants.CUSTOMER_TCKN, 5);
		
		XBag outBag = this.executer.execute(inBag);		
		System.out.println(outBag.get(ResponseConstants.RETURN_MESSAGE));
		
		return outBag.get(ResponseConstants.RETURN_MESSAGE).toString();

	}

}
