package com.abc.pizza.repository;

import com.abc.pizza.exceptions.InvalidUserException;

public interface CustomuserRepository {
	public String verifyUser(String username,String password)throws InvalidUserException;

}
