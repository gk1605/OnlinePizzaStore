package com.abc.pizza.exceptions;
public class unAuthorizeduserException extends Exception{

	String loginUser;
	
	
	
	public unAuthorizeduserException(String loginUser) {
		super();
		this.loginUser = loginUser;
	}



	public String getLoginUser() {
		return loginUser;
	}



	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}



	public String exceptionCause()
	{
		return loginUser+"not Authorized for the information";
	}
}
