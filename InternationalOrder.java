package com.project.OrderManagementSystem;

public class InternationalOrder extends Order{
	protected double customerDuty=18.0;
	protected double internationalShipping=250.0;
	
	public InternationalOrder(String customerName, String orderId, double orderAmount) {
		super(customerName,orderId,orderAmount);
		setOrderAmount(orderAmount);
	}

	@Override
	public void processOrder() {
		System.out.println("International Order final amount is: "+(orderAmount+internationalShipping+(orderAmount*(customerDuty/100))));
	}
	
	@Override
	public void setOrderAmount(double orderAmount) {
		if(orderAmount>1000) {
			this.orderAmount=orderAmount;
		}
		else {	
			System.out.println("International orders must be above Rs 1000.");
			System.exit(0);
		}	
	}
}
