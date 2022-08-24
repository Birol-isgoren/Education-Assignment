package com.ibtech.task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.Parameter;


public interface ParameterDao extends JpaRepository<Parameter,String>{

	Parameter getByCommandName(String commandName);
	
}
