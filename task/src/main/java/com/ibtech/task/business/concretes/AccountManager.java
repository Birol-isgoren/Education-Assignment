package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.business.abstracts.IAccountService;
import com.ibtech.task.dataAccess.abstracts.AccountDao;
import com.ibtech.task.entities.concretes.Account;

@Service
public class  AccountManager implements IAccountService<Account>{
	
	private AccountDao accountDao;

	@Autowired
	public AccountManager(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}


	@Override
	public List<Account> getAll() {
		
		return accountDao.findAll();
	}


	@Override
	public String add(Account account) {
		String iban = String.format("%s%s%s",account.getBranch(),account.getCurrencyCode(),account.getAccountNumber());
		account.setIban(iban);
		this.accountDao.save(account);
		return "Hesap eklendi " + account.toString();
	}


	@Override
	public String delete(int customerNumber) {
		Account account = this.accountDao.getByCustomerNumber(customerNumber);
		this.accountDao.deleteById(customerNumber); 
		
		return "Hesap silindi " + account.toString();
	}


	@Override
	public String update(Account newAccount) {
		Account account = this.accountDao.getByCustomerNumber(newAccount.getCustomerNumber());
		String iban = String.format("%s%s%s",newAccount.getBranch(),newAccount.getCurrencyCode(),newAccount.getAccountNumber());
		newAccount.setIban(iban);
		account = newAccount;
		this.accountDao.save(account);
		return "Hesap güncellendi " + account.toString();
	}

}
