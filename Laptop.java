package com.xworkz.Oops;

public class Laptop {
	String brand;
	String color;
	int graphicsCard;
	int ramSize;
	String processor;
	public Laptop(String brand,String color,int graphicsCard,int ramSize,String processor) {
		this.brand=brand;
		this.color=color;
		this.graphicsCard=graphicsCard;
		this.ramSize=ramSize;
		this.processor=processor;
	}
	public void switchOn() {
		System.out.println("switched on");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
	public void switchOff() {
		System.out.println("switched off");
	}

}
