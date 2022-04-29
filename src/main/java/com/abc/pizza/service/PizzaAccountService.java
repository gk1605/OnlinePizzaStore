package com.abc.pizza.service;


import java.util.List;
import com.abc.pizza.entity.*;

import org.springframework.stereotype.Service;

import com.abc.pizza.entity.OrderTransactions;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.exceptions.InvalidPizzaException;
import com.abc.pizza.exceptions.InvalidUserException;

@Service

public interface PizzaAccountService 
{
	public String login(String username,String password) throws InvalidUserException;

	public boolean logout(String username);
	
	public boolean insertPizzaAccount(PizzaAccount a);
	public PizzaAccount getPizzaAccount(int pId);
	public List<PizzaAccount> getallpizzaslist();
}
