package com.ibtech.task.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibtech.task.business.abstracts.ICustomerService;
import com.ibtech.task.entities.concretes.Customer;



@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	private ICustomerService<Customer> customerService;

	@Autowired
	public CustomerController(ICustomerService<Customer> customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAll(){
		return this.customerService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Customer customer) {
		return this.customerService.add(customer);
	}
	
	@DeleteMapping("/delete/{customerNumber}")
	public String delete(@PathVariable(value = "customerNumber") int customerNumber) {
		return this.customerService.delete(customerNumber);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody Customer customer) {
		return this.customerService.update(customer);
	}
}
