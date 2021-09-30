package com.xworkz.Oops;

public class RestaurantInfo {
	String restrauName;
	String restrauAddress;
	String foodType;
	int price;
	int noOfWorkers;
	int noOfDishes;
	RestaurantInfo(String restauName,String restrauAddress,int price){
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

	public static void main(String[] args) {
		RestaurantInfo restaurant=new RestaurantInfo("ABC","Bangalore", 200);
		System.out.println(restaurant.restrauName);
		System.out.println(restaurant.restrauAddress);
		System.out.println(restaurant.price);
	}

}
