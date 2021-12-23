package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.CustomerTransaction;



public interface TransactionRepository extends JpaRepository<CustomerTransaction, Integer> {
	
	@Query("select customer_id,monthname(transacation_date),sum(rewards_points) from CustomerTransaction group by monthname(transacation_date),customer_id")
	List<Object[]> rewardsPointsPerMonth();
	
	@Query("select customer_id,sum(rewards_points) from CustomerTransaction group by customer_id")
	List<Object[]> totalRewardsPoints();
}
	


