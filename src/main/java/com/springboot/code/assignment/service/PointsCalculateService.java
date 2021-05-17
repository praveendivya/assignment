package com.springboot.code.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.springboot.code.assignment.customer.Customer;
import com.springboot.code.assignment.customer.Spend;

@Service
public class PointsCalculateService {
	
	private static final Logger logger = LogManager.getLogger("PointsCalculateService");
	
	@Value("${customer1.month1.spending}")
	public List<Integer> customer1Month1Spending;
	
	@Value("${customer1.month2.spending}")
	public List<Integer> customer1Month2Spending;
	
	@Value("${customer1.month3.spending}")
	public List<Integer> customer1Month3Spending;
	
	
	@Value("${customer2.month1.spending}")
	public List<Integer> customer2Month1Spending;
	
	@Value("${customer2.month2.spending}")
	public List<Integer> customer2Month2Spending;
	
	@Value("${customer2.month3.spending}")
	public List<Integer> customer2Month3Spending;
		
	List<Customer> customerList = new ArrayList<Customer>();
	public List<Customer> calculatePoints() {
		logger.info("calculatePoints() ");
		List<Customer> customerList = new ArrayList<>();
		logger.info("customer1Month1Spending : " + customer1Month1Spending);
		Spend cust1Spend1 = new Spend("Month1", customer1Month1Spending);
		Spend cust1Spend2 = new Spend("Month2", customer1Month2Spending);
		Spend cust1Spend3 = new Spend("Month3", customer1Month3Spending);
		
		Spend cust2Spend1 = new Spend("Month1", customer2Month1Spending);
		Spend cust2Spend2 = new Spend("Month2", customer2Month2Spending);
		Spend cust2Spend3 = new Spend("Month3", customer2Month3Spending);
		
		Customer customer1Month1 = new Customer("Customer 1", cust1Spend1);
		Customer customer1Month2 = new Customer("Customer 1", cust1Spend2);
		Customer customer1Month3 = new Customer("Customer 1", cust1Spend3);
		
		Customer customer2Month1 = new Customer("Customer 2", cust2Spend1);
		Customer customer2Month2 = new Customer("Customer 2", cust2Spend2);
		Customer customer2Month3 = new Customer("Customer 2", cust2Spend3);
		
		List<Customer> customer1SpendingList = new ArrayList<>();
		List<Customer> customer2SpendingList = new ArrayList<>();
		customer1SpendingList.add(customer1Month1);
		customer1SpendingList.add(customer1Month2);
		customer1SpendingList.add(customer1Month3);
		
		customer2SpendingList.add(customer2Month1);
		customer2SpendingList.add(customer2Month2);
		customer2SpendingList.add(customer2Month3);
		
		List<List<Customer>> listOfList = new ArrayList<>();
		listOfList.add(customer1SpendingList);
		listOfList.add(customer2SpendingList);
		
		for(List<Customer> custList  :  listOfList) {
		int totalPoints = 0;
		int monthPoints = 0;
		for(Customer cust : custList) {
			 monthPoints = 0;
			Spend spend  =  cust.getSpend();
			for(Integer amountSpend: cust.getSpend().getSpending()) {
				if( (amountSpend > 50) && (amountSpend <=100)) {
					monthPoints += (amountSpend -50);
				}else if(amountSpend > 100) {
					monthPoints += (amountSpend -100)*2;
				}
			}
			spend.setMonthlyPoint(monthPoints);
			totalPoints += monthPoints;
			cust.setTotalPoint(totalPoints);
			logger.info("After setting totalPoints: " + cust);
			customerList.add(cust);
		}
		}
		return customerList;
	}
}
