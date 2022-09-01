package com.ibtech.task.business.abstracts;

import java.util.List;

import com.ibtech.task.bag.XBag;

public interface ICrudService<T> {

	List<T> getAll();

	String add(T entity);
	
	XBag add(XBag entity);

	String delete(int id);

	String update(T entity);
	

}
