package com.ibtech.task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.Account;

public interface AccountDao extends JpaRepository<Account,Integer>, BaseDao<Account>{

	
}
