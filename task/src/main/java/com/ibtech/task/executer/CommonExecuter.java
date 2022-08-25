package com.ibtech.task.executer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibtech.task.bag.XBag;
import com.ibtech.task.business.abstracts.ICustomerService;
import com.ibtech.task.constants.ResponseConstants;
import com.ibtech.task.dataAccess.abstracts.ParameterDao;
import com.ibtech.task.entities.concretes.Customer;
import com.ibtech.task.entities.concretes.Parameter;


@Service
public class CommonExecuter implements IExecuter {
	
	private ParameterDao parameterDao;
	private ICustomerService<Customer> customerService;
	
	
	@Autowired
	public CommonExecuter(ParameterDao parameterDao, ICustomerService<Customer> customerService) {
		super();
		this.parameterDao = parameterDao;
		this.customerService = customerService;
	}



	@Override
	public XBag execute(XBag inBag) { 
		Parameter parameter = parameterDao.getByCommandName(inBag.get("PARAMETER_COMMAND").toString());
		String packageName = parameter.getPackageName();
		String methodName = parameter.getMethodName();
		XBag outBag = new XBag();
		try {
			
			Class<?> c = Class.forName(packageName);
			Object obj = customerService;
			Method method = c.getDeclaredMethod(methodName, XBag.class);
			outBag = (XBag) method.invoke(obj, inBag);
			return outBag;
			
			
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
		}
		outBag.put(ResponseConstants.IS_SUCCESSFUL, false);
		outBag.put(ResponseConstants.RETURN_MESSAGE, "Teknik bir hata oluştu.");
		return outBag;
	}

}
