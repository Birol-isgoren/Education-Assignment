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

import com.ibtech.task.business.abstracts.IPhoneService;
import com.ibtech.task.entities.concretes.Phone;



@RestController
@RequestMapping("/api/phone")
public class PhoneController {

	private IPhoneService<Phone> phoneService;

	@Autowired
	public PhoneController(IPhoneService<Phone> phoneService) {
		super();
		this.phoneService = phoneService;
	}
	
	@GetMapping("/getall")
	public List<Phone> getAll(){
		return this.phoneService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Phone phone) {
		return this.phoneService.add(phone);
	}
	
	@DeleteMapping("/delete/{customerNumber}")
	public String delete(@PathVariable(value = "customerNumber") int customerNumber) {
		return this.phoneService.delete(customerNumber);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody Phone phone) {
		return this.phoneService.update(phone);
	}
}
