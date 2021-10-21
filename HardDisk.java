package com.xworkz.Oops;

public class HardDisk {
	private String brand;
	private int price;
	private String capacity;
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setCapacity(String capacity) {
		this.capacity=capacity;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}
	public String getCapacity() {
		return this.capacity;
	}
}
