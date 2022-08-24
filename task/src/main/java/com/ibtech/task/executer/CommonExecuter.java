package com.ibtech.task.executer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.dataAccess.abstracts.ParameterDao;
import com.ibtech.task.entities.concretes.Parameter;
@Service
public class CommonExecuter implements IExecuter {
	
	private ParameterDao parameterDao;
	
	
	@Autowired
	public CommonExecuter(ParameterDao parameterDao) {
		super();
		this.parameterDao = parameterDao;
	}



	@Override
	public String execute(String commandName) { 
		Parameter parameter = parameterDao.getByCommandName(commandName);
		String packageName = parameter.getPackageName();
		String methodName = parameter.getMethodName();
		try {
			
			Class<?> c = Class.forName(packageName);
			Object obj = c.newInstance();
			Method method = c.getDeclaredMethod(methodName, String.class);
			return (String) method.invoke(obj, "Ali");	
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hatalı bitti";
	}

}
