package com.ibtech.task.business.abstracts;

public interface IAccountService<T> extends ICrudService<T> {
	
	void changeAmount(int amount);

}
