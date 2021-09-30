package com.xworkz.Oops;

public class Ipod {
	String brand;
	int imeiNumber;
	int price;
	int batteryCapacity;
	String color;
	int processor;
	int ram;
	String type;
	boolean isSupportFingerPrint;
	//constructor overloading
	Ipod(){
		System.out.println("No parameter");
	}
	Ipod(String brand,int imeiNumber,int price){
		System.out.println("3 parameter passed");
		this.brand=brand;
		this.imeiNumber=imeiNumber;
		this.price=price;
	}
	Ipod(String brand,int imeiNumber,int price,int batteryCapacity,String color){
		System.out.println("constructor invoked");
		this.brand=brand;
		this.imeiNumber=imeiNumber;
		this.price=price;
		this.batteryCapacity=batteryCapacity;
		this.color=color;
		
	}
	public void switchOn() {
		System.out.println("switched on");
	}
	public void playMusic() {
		System.out.println("playing music");
	}
	public void switchOff() {
		System.out.println("switched off");
	}
	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.imeiNumber);
		System.out.println(this.price);
		System.out.println(this.batteryCapacity);
		System.out.println(this.isSupportFingerPrint);
	}

	public static void main(String[] args) {
		Ipod ipod=new Ipod();
		ipod.brand="Apple";
		ipod.batteryCapacity=3000;
		ipod.color="white";
		ipod.price=20000;
		ipod.imeiNumber=23463;
		System.out.println(ipod.brand);
		System.out.println(ipod.batteryCapacity);
		System.out.println(ipod.color);
		System.out.println(ipod.price);
		System.out.println(ipod.imeiNumber);
		
		

	
	}

}
