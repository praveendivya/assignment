package com.springboot.code.assignment.customer;

public class Customer {
	String name;
	Spend spend;
	int totalPoint;
	
	
	public Customer(String name, Spend spend) {
		super();
		this.name = name;
		this.spend = spend;
	}
	public Customer(String name, Spend spend, int totalPoint) {
		super();
		this.name = name;
		this.spend = spend;
		this.totalPoint = totalPoint;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Spend getSpend() {
		return spend;
	}
	public void setSpend(Spend spend) {
		this.spend = spend;
	}
	public int getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", spend=" + spend + ", totalPoint=" + totalPoint + "]";
	}
	
	
	
}
