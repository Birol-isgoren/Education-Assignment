package com.ibtech.task.dataAccess.abstracts;



public interface BaseDao<T> {
	T getByCustomerNumber(int customerNumber);

}
