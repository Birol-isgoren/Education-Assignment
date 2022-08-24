package com.ibtech.task.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping("/execute/{commandName}")
	public String add(@PathVariable(value = "commandName") String commandName) {
		return this.executer.execute(commandName);
	}

}
