package com.ibtech.task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.Adress;

public interface AdressDao extends JpaRepository<Adress,Integer>, BaseDao<Adress>{

	
}
