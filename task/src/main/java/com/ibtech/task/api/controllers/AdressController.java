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

import com.ibtech.task.business.abstracts.IAdressService;
import com.ibtech.task.entities.concretes.Adress;



@RestController
@RequestMapping("/api/adress")
public class AdressController {

	private IAdressService<Adress> adressService;

	@Autowired
	public AdressController(IAdressService<Adress> adressService) {
		super();
		this.adressService = adressService;
	}
	
	@GetMapping("/getall")
	public List<Adress> getAll(){
		return this.adressService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Adress adress) {
		return this.adressService.add(adress);
	}
	
	@DeleteMapping("/delete/{customerNumber}")
	public String delete(@PathVariable(value = "customerNumber") int customerNumber) {
		return this.adressService.delete(customerNumber);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody Adress adress) {
		return this.adressService.update(adress);
	}
}
