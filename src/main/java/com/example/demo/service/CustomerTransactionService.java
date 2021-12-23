package com.example.demo.service;

import com.example.demo.entities.CustomerTransaction;

public interface CustomerTransactionService {

	public CustomerTransaction calculateRewards(com.example.demo.dto.RewardsRequest rewardsRequest);
}
