package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibtech.task.bag.XBag;
import com.ibtech.task.constants.CustomerBagConstants;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_surname")
	private String customerSurname;
	
	@Column(name="customer_tckn")
	private String customerTckn;
	
	public Customer() {
		
	}

	public Customer(int customerNumber, String customerName, String customerSurname, String customerTckn) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerTckn = customerTckn;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public String getCustomerTckn() {
		return customerTckn;
	}

	public void setCustomerTckn(String customerTckn) {
		this.customerTckn = customerTckn;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerSurname="
				+ customerSurname + ", customerTckn=" + customerTckn + "]";
	}
	
	public void fromBag(XBag inBag) {
		this.customerNumber = Integer.valueOf(inBag.get(CustomerBagConstants.CUSTOMER_NUMBER).toString());
		this.customerName = inBag.get(CustomerBagConstants.CUSTOMER_NAME).toString();
		this.customerSurname = inBag.get(CustomerBagConstants.CUSTOMER_SURNAME).toString();
		this.customerTckn = inBag.get(CustomerBagConstants.CUSTOMER_TCKN).toString();
	}
	

	
}
