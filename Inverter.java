package com.xworkz.Oops;

public class Inverter {
	private String type;
	private int price;
	private String color;
	private String batteryCapacity;
	public void switchOn() {
		System.out.println("Inverter switched on");
		
	}
	public void chargeBattery() {
		System.out.println("Battery charged");
	}
	public void switchOff() {
		System.out.println("Inverter switched off");
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity=batteryCapacity;
	}
	public String getType() {
		return this.type;
	}
	public int getPrice() {
		return this.price;
	}
	public String getBatteryCapacity() {
		return this.batteryCapacity;
	}

}
