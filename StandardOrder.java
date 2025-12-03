package com.project.OrderManagementSystem;

public class StandardOrder extends Order{
		protected double shippingCharge=50.0;
		public StandardOrder(String customerName, String orderId, double orderAmount) {
			super(customerName,orderId,orderAmount);
		}

		@Override
		public void processOrder() {
			System.out.println("Standard Order final amount is: "+(orderAmount+shippingCharge));
		}	
	}
