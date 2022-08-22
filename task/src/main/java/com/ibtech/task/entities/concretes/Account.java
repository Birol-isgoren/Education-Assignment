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
	
	@Column(name="currency_code")
	private String currencyCode;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="iban")
	private String iban;
	
	public Account() {
		
	}

	public Account(int customerNumber, String accountNumber, String currencyCode, String branch, String iban) {
		super();
		this.customerNumber = customerNumber;
		this.accountNumber = accountNumber;
		this.currencyCode = currencyCode;
		this.branch = branch;
		this.iban = iban;
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

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Account [customerNumber=" + customerNumber + ", accountNumber=" + accountNumber + ", currencyCode="
				+ currencyCode + ", branch=" + branch + ", iban=" + iban + "]";
	}
	
	


	

	


	
	

	
}
