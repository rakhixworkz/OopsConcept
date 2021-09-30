package com.xworkz.Oops;

public class BookShopInfo {
	String shopName;
	String authorName;
	int price;
	int bAddition;
	BookShopInfo() {
		System.out.println("No parameter");
	}
	
	public void openingTime() {
		System.out.println("shop opened");
	}
	public void sellingOldBooks() {
		System.out.println("Old books selled");
	}
	public void sellingNewBooks() {
		System.out.println("New books selled");
	}
	public void closingTime() {
		System.out.println("shop closed");
	}

	public static void main(String[] args) {
		BookShopInfo bookshop=new BookShopInfo();
	}

}
