package com.xworkz.Oops;

public class Car {
	String brand;
	int price;
	String color;
	Engine engine=new Engine(12345,"Diesel",3000,120);
	public void travel() {
		engine.start();
		System.out.println("Travelling");
		engine.stop();
	}
	

	public static void main(String[] args) {
		Car car=new Car();
		car.travel();
	}

}
