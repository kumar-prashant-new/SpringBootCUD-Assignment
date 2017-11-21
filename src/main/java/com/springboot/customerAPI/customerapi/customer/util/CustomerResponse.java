package com.springboot.customerAPI.customerapi.customer.util;

public class CustomerResponse {


    private String resMsg;
    private String userId;
    private String[] valError = {};
    
	public String getResMsg() {
		return resMsg;
	}

	public String getUserId() {
		return userId;
	}

	public String[] getValError() {
		return valError;
	}

	
	public CustomerResponse(String resMsg, String userId, String[] valError) {
		super();
		this.resMsg = resMsg;
		this.userId = userId;
		this.valError = valError;
	}
	
	public CustomerResponse(){}

   
}
