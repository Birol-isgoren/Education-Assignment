package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.business.abstracts.ICustomerService;
import com.ibtech.task.dataAccess.abstracts.CustomerDao;
import com.ibtech.task.entities.concretes.Customer;

@Service
public class  CustomerManager implements ICustomerService<Customer>{
	
	private CustomerDao customerDao;

	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	@Override
	public List<Customer> getAll() {
		
		return customerDao.findAll();
	}


	@Override
	public String add(Customer customer) {
		this.customerDao.save(customer);
		return "Müşteri eklendi " + customer.toString();
	}


	@Override
	public String delete(int customerNumber) {
		Customer customer = this.customerDao.getByCustomerNumber(customerNumber);
		this.customerDao.deleteById(customerNumber);
		
		return "Müşteri silindi " + customer.toString();
	}


	@Override
	public String update(Customer newCustomer) {
		Customer customer = this.customerDao.getByCustomerNumber(newCustomer.getCustomerNumber());
		customer = newCustomer;
		this.customerDao.save(customer);
		return "Müşteri güncellendi " + customer.toString();
	}

}
