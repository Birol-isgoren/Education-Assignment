package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parameters")
public class Parameter {
	@Id
	@Column(name="command_name")
	private String commandName;
	
	@Column(name="package_name")
	private String packageName;
	
	@Column(name="method_name")
	private String methodName;
	
	
	public Parameter() {
		
	}

	public Parameter(String commandName, String packageName, String methodName) {
		super();
		this.commandName = commandName;
		this.packageName = packageName;
		this.methodName = methodName;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	

	


	
}
