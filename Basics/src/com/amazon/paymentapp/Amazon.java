package com.amazon.paymentapp;//method overloading  - method with sa,e name or method

public class Amazon {
    Product pay(Wallet w) {
    	System.out.println("Accepted payment using wallet");
    	System.out.println("Product is packed");
    	Product p = new Product();
    	System.out.println("Delivering the product to the customer");
    	return p;
    }
    
    Product pay(Creditcard c) {
    	System.out.println("Accepted payment using Creditcard");
    	System.out.println("Product is packed");
    	Product p = new Product();
    	System.out.println("Delivering the product to the customer");
    	return p;
    }
    
    Product pay(Debitcard d){
    	System.out.println("Accepted payment using Debitcard");
    	System.out.println("Product is packed");
    	Product p = new Product();
    	System.out.println("Delivering the product to the customer");
    	return p;
    }
}

