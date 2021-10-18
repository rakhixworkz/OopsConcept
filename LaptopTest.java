package com.xworkz.Oops;

public class LaptopTest {
	public static void displayInfo(Laptop objs[]) {
		System.out.println("Laptop information");
		for(int i=0;i<objs.length;i++) {
			if(objs[i].ramSize>=4) {
				System.out.println(objs[i].brand);
				System.out.println(objs[i].color);
				System.out.println(objs[i].graphicsCard);
				System.out.println(objs[i].ramSize);
				System.out.println(objs[i].processor);
				System.out.println("------------------------------");
			}
		}
	}
	public static void main(String[] args) {
		Laptop laptop1=new Laptop("sony","Black",4,4,"i3");
		Laptop laptop2=new Laptop("Dell","Silver",8,4,"i4");
		Laptop laptop3=new Laptop("Lenovo","Black",4,4,"i3");
		Laptop laptop4=new Laptop("Asus","Brown",8,4,"i5");
		Laptop laptop5=new Laptop("HP","Black",2,4,"i2");
		Laptop objs[]= {laptop1,laptop2,laptop3,laptop4,laptop5};
		LaptopTest.displayInfo(objs);
		
	}

}
