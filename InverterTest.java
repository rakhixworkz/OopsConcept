package com.xworkz.Oops;

public class InverterTest {
	public static void main(String args[]) {
		Inverter inverter=new Inverter();
		inverter.setType("Luminous");
		inverter.setPrice(23000);
		inverter.setBatteryCapacity("1500AH");
		System.out.println(inverter.getType());
		System.out.println(inverter.getPrice());
		System.out.println(inverter.getBatteryCapacity());
		
	}

}
