package com.ibtech.task.bag;

import java.util.HashMap;
import java.util.Map;

public class XBag {

	private Map<String, Object> bag;

	public XBag() {
		super();
		this.bag = new HashMap<String, Object>();
	}
	
	public void put(String key, Object value) {
		this.bag.put(key, value);
	}
	
	public Object get(String key) {
		return this.bag.get(key);
	}

		
	
}
