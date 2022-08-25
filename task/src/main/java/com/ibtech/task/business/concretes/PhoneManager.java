package com.ibtech.task.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.bag.XBag;
import com.ibtech.task.business.abstracts.IPhoneService;
import com.ibtech.task.dataAccess.abstracts.PhoneDao;
import com.ibtech.task.entities.concretes.Phone;

@Service
public class  PhoneManager implements IPhoneService<Phone>{
	
	private PhoneDao phoneDao;

	@Autowired
	public PhoneManager(PhoneDao phoneDao) {
		super();
		this.phoneDao = phoneDao;
	}


	@Override
	public List<Phone> getAll() {
		
		return phoneDao.findAll();
	}


	@Override
	public String add(Phone phone) {
		this.phoneDao.save(phone);
		return "Telefon eklendi " + phone.toString();
	}


	@Override
	public String delete(int customerNumber) {
		Phone phone = this.phoneDao.getByCustomerNumber(customerNumber);
		this.phoneDao.deleteById(customerNumber); 
		
		return "Telefon silindi " + phone.toString();
	}


	@Override
	public String update(Phone newPhone) {
		Phone phone = this.phoneDao.getByCustomerNumber(newPhone.getCustomerNumber());
		phone = newPhone;
		this.phoneDao.save(phone);
		return "Telefon güncellendi " + phone.toString();
	}


	@Override
	public XBag add(XBag entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
