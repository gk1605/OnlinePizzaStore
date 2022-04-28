package com.abc.pizza.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.pizza.exceptions.*;



public class CustomuserRepositoryImpl implements CustomuserRepository{
	
	@Autowired
	EntityManager jpa;
	
	@Override
	public String verifyUser(String username, String password)throws InvalidUserException 
	{
		Session spring = jpa.unwrap(Session.class);
		
		String query = "select role from User u where username =:enteredUsername and password =:enteredPassword";
		
		Query<String> q = spring.createQuery(query);
		q.setParameter("enteredUsername", username);
		q.setParameter("enteredPassword", password);
		
		List<String> output =  q.getResultList();
		System.out.println(output);
		if(output.size()!=0)
		{
			
			return output.get(0); 
			
			
		}
		else
		{
			
			throw new InvalidUserException(username,password);
			
		}
	} 


}

