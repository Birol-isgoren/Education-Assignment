package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.bag.XBag;
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
		
		account = newAccount;
		this.accountDao.save(account);
		return "Hesap güncellendi " + account.toString();
	}


	@Override
	public XBag add(XBag entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void changeAmount(int amount) {
		Account account = this.accountDao.getByCustomerNumber(1);
		account.setAmount(account.getAmount() + amount);
		this.accountDao.save(account);
	}

}
