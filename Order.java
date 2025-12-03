package com.project.OrderManagementSystem;

class Order {
	protected String customerName;
	protected String orderId;
	protected double orderAmount;
	public static final String PLATFORM_NAME="AMAZON";
	
    public Order(){
		this.customerName="Unknown Name";
		this.orderId="Unknown order Id";
		this.orderAmount=0.0;
	}
	public Order(String customerName, String orderId, double orderAmount){
		setCustomerName(customerName);
		setOrderId(orderId);
		setOrderAmount(orderAmount);
	}
	
	public void setCustomerName(String customerName) {
		if(!customerName.isEmpty()) {
			this.customerName=customerName;
		}
		else {
			System.out.println("Customer name cannot be empty.");
			System.exit(0);
		}
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setOrderId(String orderId) {
		if(!orderId.isEmpty()) {
			this.orderId=orderId;
		}
		else {
			System.out.println("Customer Order Id cannot be empty.");
			System.exit(0);
		}
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderAmount(double orderAmount) {
		if(orderAmount>0.0) {
			this.orderAmount=orderAmount;
		}
		else {
			System.out.println("Order amount cannot be negative.");
			System.exit(0);
		}
	}
	public double getOrderAmount(){
		return orderAmount;
	}
	
	public void processOrder() {
		System.out.println("Order is processing...");
	}
	
	public String displayOrdeDetails() {
		
		return "Customer Name: "+customerName+
				"\nOrder ID: "+orderId+
				"\nOrder Amount: "+orderAmount+
				"\nPlatform name: "+PLATFORM_NAME;
	}
}


