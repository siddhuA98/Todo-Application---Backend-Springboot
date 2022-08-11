package com.firstproject.basic.auth;

public class BeanAuth extends AuthenticationBean 
{
	String message;
	public BeanAuth(String message)
	{
		this.message = message;
	}
	@Override
	public String toString() {
		return "BeanAuth [message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
