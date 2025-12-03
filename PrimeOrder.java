package com.project.OrderManagementSystem;

public class PrimeOrder extends Order{
	
	protected double discount=10.0;
	
	public PrimeOrder(String customerName,String orderId,double orderAmount) {
		super(customerName,orderId,orderAmount);
	}
	
	@Override
	public void processOrder() {
		System.out.println("Prime order final amount is: "+ (orderAmount-(orderAmount*0.10)));
	}
}
