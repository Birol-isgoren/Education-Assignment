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

import com.ibtech.task.business.abstracts.IAccountService;
import com.ibtech.task.entities.concretes.Account;



@RestController
@RequestMapping("/api/account")
public class AccountController {

	private IAccountService<Account> accountService;

	@Autowired
	public AccountController(IAccountService<Account> accountService) {
		super();
		this.accountService = accountService;
	}
	
	@GetMapping("/getall")
	public List<Account> getAll(){
		return this.accountService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Account account) {
		return this.accountService.add(account);
	}
	
	@DeleteMapping("/delete/{customerNumber}")
	public String delete(@PathVariable(value = "customerNumber") int customerNumber) {
		return this.accountService.delete(customerNumber);
	}
	
	@PostMapping("/update")
	public String update(@RequestBody Account account) {
		return this.accountService.update(account);
	}
}
