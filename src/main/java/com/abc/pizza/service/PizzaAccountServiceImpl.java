package com.abc.pizza.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.entity.OrderTransactions;
import com.abc.pizza.entity.PizzaAccount;
import com.abc.pizza.exceptions.InvalidPizzaException;
import com.abc.pizza.exceptions.InvalidUserException;
import com.abc.pizza.repository.PizzaAccountRepository;
@Service
public class PizzaAccountServiceImpl implements PizzaAccountService{
	
	@Autowired
	PizzaAccountRepository pizzaAccountRepository;

	@Override
	public String login(String username, String password) throws InvalidUserException {
		// TODO Auto-generated method stub
		return null;
	}
    @Override
       public List<PizzaAccount> getallpizzaslist() {
	// TODO Auto-generated method stub
	    return pizzaAccountRepository.findAll();
    }
	    
	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean insertPizzaAccount(PizzaAccount a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PizzaAccount getPizzaAccount(int pId) {
		// TODO Auto-generated method stub
		return pizzaAccountRepository.findAll().get(pId);
	}
	

}
	
	
