package com.xworkz.Oops;

public class EndUser {
	public static void displayInfo(PhonePayV001 objs[]) {
		System.out.println("Phone Pay information");
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releasingYear);
			System.out.println("----------------------------------");
		}
	}

	public static void main(String[] args) {
		PhonePayV001 phonePayV001=new PhonePayV001();
		phonePayV001.name="PhonePay";
		phonePayV001.version="V001";
		phonePayV001.releasingYear=2016;
		PhonePayV001 phonePayV0012=new PhonePayV001();
		PhonePayV001 phonePayV0013=new PhonePayV001();
		PhonePayV001 phonePayV0014=new PhonePayV001();
		PhonePayV001 objs[]= {phonePayV001,phonePayV0012,phonePayV0013};
		EndUser.displayInfo(objs);
		
	}

}
