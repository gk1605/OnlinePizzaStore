package com.abc.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.pizza.entity.*;
import org.springframework.stereotype.Repository;

import com.abc.pizza.entity.PizzaAccount;
@Repository
public interface PizzaAccountRepository extends JpaRepository<PizzaAccount, String>{

}
