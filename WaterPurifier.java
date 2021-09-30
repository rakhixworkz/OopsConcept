package com.xworkz.Oops;

public class WaterPurifier {
	String brand;
	int price;
	String model;
	int serialNumber;
	WaterPurifier(String brand,int price,String model,int serialNumber){
		System.out.println("waterpurifier invoked");
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.serialNumber=serialNumber;
		
	}
	public void fillWater() {
		System.out.println("filling water");
	}
	public void purify() {
		System.out.println("purifying water");
	}
	public static void main(String[] args) {
		WaterPurifier waterpurifier=new WaterPurifier("eureka",20000,"m12",1234);
		System.out.println(waterpurifier.brand);
		System.out.println(waterpurifier.price);
		System.out.println(waterpurifier.model);
		System.out.println(waterpurifier.serialNumber);
			
	}

}
