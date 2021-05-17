package com.springboot.code.assignment.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.code.assignment.customer.Customer;
import com.springboot.code.assignment.service.PointsCalculateService;

@Component
@RestController
public class AssignmentController {
	
	@Autowired
	PointsCalculateService service;
	
	private static final Logger logger = LogManager.getLogger("AssignmentController");
	
	@GetMapping("/getPoints")
	public List<Customer> calculatePoints() {
		
		logger.info("in getPoints call, about to call PointsCalculateService()");
		logger.info("service  : ", service);
		List<Customer> customerList = service.calculatePoints();
		return customerList;
	}

}
