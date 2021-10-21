package com.xworkz.Oops;

public class Medicine {
	private String name;
	private String mfd;
	private String expDate;
	private int price;
	private double mg;
	public void cureDisease() {
		System.out.println("Curing disease");
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setExpDate(String expDate) {
		this.expDate=expDate;
	}
	public void setMg(double mg) {
		if(mg<100) {
			this.mg=mg;
		}else {
			System.out.println("Initialize valid value");
		}
	}
	public String getName() {
		return this.name;
	}
	public double getmg() {
		return this.mg;
		
	}
	public String getExpDate() {
		return this.expDate;
	}

}
