package com.springboot.code.assignment.customer;

import java.util.List;

public class Spend {
	String monthName;
	List<Integer> spending;
	int monthlyPoint;
	
	
	
	public Spend(String monthName, List<Integer> spending) {
		super();
		this.monthName = monthName;
		this.spending = spending;
	}
	public Spend(String monthName, List<Integer> spending, int monthlyPoint) {
		super();
		this.monthName = monthName;
		this.spending = spending;
		this.monthlyPoint = monthlyPoint;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public List<Integer> getSpending() {
		return spending;
	}
	public void setSpending(List<Integer> spending) {
		this.spending = spending;
	}
	public int getMonthlyPoint() {
		return monthlyPoint;
	}
	public void setMonthlyPoint(int monthlyPoint) {
		this.monthlyPoint = monthlyPoint;
	}
	@Override
	public String toString() {
		return "Spend [monthName=" + monthName + ", spending=" + spending + ", monthlyPoint=" + monthlyPoint + "]";
	}
	
	
}
