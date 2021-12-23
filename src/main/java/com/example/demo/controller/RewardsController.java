package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RewardsRequest;
import com.example.demo.repos.TransactionRepository;
import com.example.demo.service.CustomerTransactionService;

@RestController
public class RewardsController {
	
	@Autowired
	CustomerTransactionService customerTransactionService;
	@Autowired
	TransactionRepository transactionRepository;

	@PostMapping("/getRewards")
	public String calculateRewards(@RequestBody RewardsRequest request) {
		// customerTransactionService.calculateRewards(request);
		customerTransactionService.calculateRewards(request);
		return "success";
	}

	@RequestMapping(value = "/showRewards", method = RequestMethod.GET)
	public List<Object[]> generateCustomerRewardPoints(ModelMap modelMap) {
		List<Object[]> customerRewardsReport = transactionRepository.rewardsPointsPerMonth();
		List<Object[]> totalRewardsPoints = transactionRepository.totalRewardsPoints();
		
		return totalRewardsPoints;

	}
}
