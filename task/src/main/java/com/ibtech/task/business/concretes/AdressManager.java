package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.bag.XBag;
import com.ibtech.task.business.abstracts.IAdressService;
import com.ibtech.task.dataAccess.abstracts.AdressDao;
import com.ibtech.task.entities.concretes.Adress;

@Service
public class  AdressManager implements IAdressService<Adress>{
	
	private AdressDao adressDao;

	@Autowired
	public AdressManager(AdressDao adressDao) {
		super();
		this.adressDao = adressDao;
	}


	@Override
	public List<Adress> getAll() {
		
		return adressDao.findAll();
	}


	@Override
	public String add(Adress adress) {
		this.adressDao.save(adress);
		return "Adres eklendi " + adress.toString();
	}


	@Override
	public String delete(int customerNumber) {
		Adress adress = this.adressDao.getByCustomerNumber(customerNumber);
		this.adressDao.deleteById(customerNumber); 
		
		return "Adres silindi " + adress.toString();
	}


	@Override
	public String update(Adress newAccount) {
		Adress account = this.adressDao.getByCustomerNumber(newAccount.getCustomerNumber());
		account = newAccount;
		this.adressDao.save(account);
		return "Adres güncellendi " + account.toString();
	}


	@Override
	public XBag add(XBag entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
