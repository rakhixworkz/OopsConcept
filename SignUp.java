package com.xworkz.Oops;

public class SignUp {
	public SignUp() {
		System.out.println("Inside signUp");
		
	}
	public void userSignUp(String email,String password) {
		System.out.println("SignUp through email successful!!!!!!");
	}
	public void userSignUp(long phno,String password) {
		System.out.println("Signup through phone number successful!!!!!");
	}
	public static void main(String args[]) {
		SignUp signup=new SignUp();
		signup.userSignUp(987654343l,"123");
	}

}
