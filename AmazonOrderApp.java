package com.project.OrderManagementSystem;

import java.util.Scanner;
public class AmazonOrderApp {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Standard Order");
		System.out.println("2.Prime Order");
		System.out.println("3.International Order");
		
		System.out.println("\nSelect your order type:");
		int orderType=Integer.parseInt(sc.nextLine());
		if(orderType<=3) {
		System.out.println("Enter customer name: ");
		String customerName=sc.nextLine();
		System.out.println("Enter customer order id: ");
		String orderId=sc.nextLine();
		System.out.println("Enter order amount: ");
		double orderAmount=Double.parseDouble(sc.nextLine());
		
		switch(orderType) {
		
		case 1:
			StandardOrder s=new StandardOrder(customerName,orderId,orderAmount);
			
			System.out.println(s.displayOrdeDetails());
			s.processOrder();
			break;
		case 2:
			PrimeOrder p=new PrimeOrder(customerName,orderId,orderAmount);
			System.out.println(p.displayOrdeDetails());
			p.processOrder();
			break;
		case 3:
			InternationalOrder i=new InternationalOrder(customerName,orderId,orderAmount);
			System.out.println(i.displayOrdeDetails());
			i.processOrder();
			break;
		  }
	  }
		else {
			System.out.println("Incorrect order type number.");
		}
		sc.close();
	}

}
