package com.xworkz.Oops;

public class Validation {
	String name;
	String email;
	String phNo;
	String city;
	int pinCode;
	public static String validateUser(String name,String phNo,String city, String pinCode,String email) {
		if(name.isEmpty()&&name.length()!=4) {
			return "invalid input";
		}
		if(phNo.isEmpty()&&phNo.startsWith("6")&&phNo.startsWith("7")&&phNo.startsWith("8")&&phNo.startsWith("9")) {
			return "invalid input";
		}
		if(city.isEmpty()&&city.length()<4) {
			return "invalid input";
		}
		if(pinCode.isEmpty()&&pinCode.length()==6) {
			return "invalid input";
		}
		if(email.isEmpty()&&email.startsWith(".com")&&email.startsWith("@")) {
			return "invalid input";
		}
			
		return "registraition Successful";
		
		
	}
	
	public static void main(String[] args) {
		String validateUser=Validation.validateUser("rakhi","9874534346","Munger","811214","rakhii@gmail.com");
		System.out.println(validateUser);
	}

}
