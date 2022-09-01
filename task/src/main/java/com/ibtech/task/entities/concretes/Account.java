package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
	
	@Id
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="account_number")
	private String accountNumber;
	
	@Column(name="amount")
	private int amount;

	
	public Account() {
		
	}


	public Account(int customerNumber, String accountNumber, int amount) {
		super();
		this.customerNumber = customerNumber;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}




	


	

	


	
	

	
}
