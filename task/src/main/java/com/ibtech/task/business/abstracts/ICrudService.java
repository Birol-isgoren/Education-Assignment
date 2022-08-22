package com.ibtech.task.business.abstracts;

import java.util.List;

public interface ICrudService<T> {

	List<T> getAll();

	String add(T entity);

	String delete(int id);

	String update(T entity);
}
