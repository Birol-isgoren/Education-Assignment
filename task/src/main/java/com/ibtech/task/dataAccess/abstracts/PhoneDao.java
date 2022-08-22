package com.ibtech.task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.Phone;

public interface PhoneDao extends JpaRepository<Phone,Integer>, BaseDao<Phone>{

	
}
