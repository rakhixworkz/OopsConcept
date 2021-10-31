package com.xworkz.Oops;

public class OnlinePayment {
	String name;
	String email;
	long phno;
	String adharNo;
	public OnlinePayment() {
		System.out.println("Inside online payment");
	}
	public void moneyTransfer() {
		System.out.println("Transfer money using phonePay");
	}
	public void recharge() {
		System.out.println("Mobile recharge done!!");
	}
}
