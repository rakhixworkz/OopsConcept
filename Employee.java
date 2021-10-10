package com.xworkz.Oops;

final class Employee {
	final int age;
	final String name;
	Employee(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Employee e=new Employee(24,"rakhi");
		System.out.println("Name:"+e.getName() + ", Age:"+e.getAge());
	}

}
