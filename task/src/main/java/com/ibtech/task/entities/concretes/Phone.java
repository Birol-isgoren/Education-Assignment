package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phones")
public class Phone {
	@Id
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="operator_code")
	private String operatorCode;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Phone() {
		
	}

	public Phone(int customerNumber, String countryCode, String operatorCode, String phoneNumber) {
		super();
		this.customerNumber = customerNumber;
		this.countryCode = countryCode;
		this.operatorCode = operatorCode;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phones [customerNumber=" + customerNumber + ", countryCode=" + countryCode + ", operatorCode="
				+ operatorCode + ", phoneNumber=" + phoneNumber + "]";
	}

	

	


	
	

	
}
