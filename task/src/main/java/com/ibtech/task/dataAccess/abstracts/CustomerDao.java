package com.ibtech.task.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibtech.task.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> , BaseDao<Customer>{

}
