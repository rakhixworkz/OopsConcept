package com.xworkz.Oops;

public class Printer {
	public Printer() {
		System.out.println("Inside printer");
	}
	public void print() {
		System.out.println("Inside print method");
		System.out.println("print the document in default setting");
	}
	public void print(String size) {
		System.out.println("Inside print method");
		System.out.println("print the document based on the size"+size);
	}
	public void print(int startIndex,int lastIndex) {
		System.out.println("Inside print method");
		System.out.println("print the document from " + startIndex +"to" +lastIndex);
	}
	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.print(20,30);
	}

}
