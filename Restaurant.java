package com.xworkz.Oops;

public class Restaurant {
	String restrauName;
	String restrauAddress;
	String foodType;
	int price;
	int noOfWorkers;
	int noOfDishes;
	Restaurant(String restauName,String restrauAddress,int price){
		this.restrauName=restrauName;
		this.restrauAddress=restrauAddress;
		this.price=price;
	}
	public void makeFood() {
		System.out.println("Food given to customers");
	}
	public void takeOrders() {
		System.out.println("customers order taken");
	}
	public void supplyingFood() {
		System.out.println("food supplied");
	}
}
