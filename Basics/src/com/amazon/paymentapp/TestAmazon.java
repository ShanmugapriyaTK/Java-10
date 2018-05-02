package com.amazon.paymentapp;

public class TestAmazon {
	public static void main(String[] args) {
		System.out.println("OPening the Amazon Website");
		Amazon a=new Amazon();
		System.out.println("We have debit card");
		Debitcard d = new Debitcard();
		System.out.println("Making the payment using debit card");
		Product product = a.pay(d);
		System.out.println("The payment is done");
				
	}

}
