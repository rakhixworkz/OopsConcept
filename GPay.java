package com.xworkz.Oops;

public class GPay extends OnlinePayment{
	public GPay() {
		System.out.println("Inside Google Pay");
	}
	public void dthRecharge() {
		System.out.println("DTH recharge using googlePay");
	}
	public void moneyTransfer() {
		System.out.println("Transfer money using Google pay");
		
	}
	public static void main(String args[]) {
		GPay gpay=new GPay();
		gpay.moneyTransfer();
	}
}
