package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch_data")
public class BatchData {
	@Id
	@Column(name="sira_no")
	private int siraNo;
	
	@Column(name="status")
	private int status;
	
	@Column(name="account_number")
	private String accountNumber;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="transaction_type")
	private String transactionType;
	
	public BatchData() {
		
	}

	public BatchData(int siraNo, int status, String accountNumber, int amount, String transactionType) {
		super();
		this.siraNo = siraNo;
		this.status = status;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public int getSiraNo() {
		return siraNo;
	}

	public void setSiraNo(int siraNo) {
		this.siraNo = siraNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
	


	

	


	
	

	
}
