package com.xworkz.Oops;

public class Engine {
	int imei;
	String type;
	int cc;
	int hp;
	public Engine(int imei,String type,int cc,int hp) {
		System.out.println("Inside Engine");
		this.imei=imei;
		this.type=type;
		this.cc=cc;
		this.hp=hp;
	}
	public void start() {
		System.out.println("Engine started");
	}
	public void stop() {
		System.out.println("Engine stopped");
	}
}
