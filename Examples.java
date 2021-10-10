package com.xworkz.Oops;

public class Examples {

	public static void main(String[] args) {
		String userName="Bangalore";
		String name="city";
		int lengthOfString=userName.length();
		System.out.println(lengthOfString);
		int indexOf=userName.indexOf('a');
		System.out.println(indexOf);
		char charAt=userName.charAt(1);
		System.out.println(charAt);
		String concat=userName.concat(name);
		System.out.println(concat);
		boolean endsWith=userName.endsWith("ore");
		System.out.println(endsWith);
		boolean startsWith=userName.startsWith("B");
		System.out.println(startsWith);
		boolean contains=userName.contains("e");
		
		
		
	}

}
