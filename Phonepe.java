package com.xworkz.Oops;

public class Phonepe {
	long phoneNo;
	String panNo;
	String adharNo;
	String place;
	String name;
	String email;
	public Phonepe(String name,long phoneNo,String place) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.place=place;	
	}
	public Phonepe(String name,long phoneNo,String place,String adharNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.place=place;
		this.adharNo=adharNo;
	}
	public Phonepe(String name,long phoneNo,String place,String adharNo,String panNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.place=place;
		this.adharNo=adharNo;
		this.panNo=panNo;
	}
	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.phoneNo);
		System.out.println(this.place);
		System.out.println(this.adharNo);
		System.out.println(this.panNo);
	}

}
