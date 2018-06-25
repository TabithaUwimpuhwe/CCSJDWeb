package com.ccjsd.util;

public class CCJSDMaintenanceReturn {
	private String result;
	private String message;
	public static final String SUCCESS="success";
	public static final String FAILURE="failure";
	
	public CCJSDMaintenanceReturn() {
		result = "Initialized result, not yet set.";
		message = "Initialized message, not yet set.";
	}
	public CCJSDMaintenanceReturn(String result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static CCJSDMaintenanceReturn getMaintReturn(Object obj) {
		CCJSDMaintenanceReturn r = new CCJSDMaintenanceReturn();
		if (obj!=null) {
			r.setResult(SUCCESS);
			r.setMessage(obj.getClass().getSimpleName()+" maintenance success");
		}
		else {
			r.setResult(FAILURE);
			// Can't use obj.getClass() because obj is null
			r.setMessage("Not found");
		}
		return r;

	}

	/*
	 * Get a maintenance return obj and include a message
	 */
	public static CCJSDMaintenanceReturn getMaintReturn(Object obj, String msg) {
		CCJSDMaintenanceReturn r = new CCJSDMaintenanceReturn();
		if (obj!=null) {
			r.setResult(SUCCESS);
			r.setMessage(obj.getClass().getSimpleName()+" maintenance success");
		}
		else {
			r.setResult(FAILURE);
			// Can't use obj.getClass() because obj is null
			r.setMessage("msg");
		}
		return r;

	}
	
	
}
