package com.paytm.paytmapp;

public class TestPaytm {
	public static void main(String[] args) {
		System.out.println("Paytm app is opened");
		Paytm p = new Paytm();
		System.out.println("Login using the mobile number");
		p.Login(8985895672L, "qspiders");
		System.out.println("Logged in");
	}

}
