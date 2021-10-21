package com.xworkz.Oops;

public class HdDiskTester {

	public static void main(String[] args) {
		HardDisk hd=new HardDisk();
		hd.setBrand("Lenovo");
		hd.setPrice(5000);
		hd.setCapacity("1Tb");
		System.out.println(hd.getBrand());
		System.out.println(hd.getPrice());
		System.out.println(hd.getCapacity());
	}
}
