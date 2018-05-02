package org.casio.calculatorapp;

public class GSTCalculator {

	void calculateGST(double productprice){
		double gst= productprice *0.18;
		double totalcost = productprice + gst;
		System.out.println("The price of the product is " +productprice);
		System.out.println("The gst of the product is " +gst);
		System.out.println("The totalcost of the product is " +totalcost);
	}
	public static void main(String[] args) {
		GSTCalculator c = new GSTCalculator();
		c.calculateGST(155.35);
	}
}
