package org.casio.calculatorapp;

public class USD {
	void convertRupeesToUSD(double rupees){
	double USD = rupees/64.8;
	double comm = USD * 0.03;
	double totalValue = USD - comm;
	System.out.println("The total conversion value is " +USD);
    System.out.println("The commision for conversion is" + comm);
    System.out.println("Final amount is" +totalValue);
}
	void sayHello(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		USD u = new USD();
		USD h = new USD();
		u.convertRupeesToUSD(5500);
		h.sayHello();
				
	}
}
