package com.ibtech.task.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adress")
public class Adress {
	@Id
	@Column(name="customer_number")
	private int customerNumber;
	
	@Column(name="street")
	private String street;
	
	@Column(name="county")
	private String county;
	
	@Column(name="city")
	private String city;
	
	public Adress() {
		
	}

	public Adress(int customerNumber, String street, String county, String city) {
		super();
		this.customerNumber = customerNumber;
		this.street = street;
		this.county = county;
		this.city = city;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Adress [customerNumber=" + customerNumber + ", street=" + street + ", county=" + county + ", city="
				+ city + "]";
	}


	
	

	
}
