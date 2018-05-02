package com.mr.markerbasicexample;

public class Marker {
	String color;
   int price = 100;
String brand ="Camlin";

void ShowDetails(){
	System.out.println(color+" "+price+" "+brand);
}



public static void main(String[] args) {
	Marker m1 = new Marker();
	System.out.println(m1);
	System.out.println(m1.color+" "+m1.price+" "+m1.brand);
	m1.color = "Black";
	System.out.println(m1.color+" "+m1.price+" "+m1.brand);
	
	//Another Method to reduce lines of code
	// Marker m1 = new Marker();
	//System.out.println(m1);
	m1.ShowDetails();
	m1.color = "Blue";
	m1.price = 300;
	m1.brand = "Nike";
	m1.ShowDetails();
	
	Marker m2 = new Marker();
	System.out.println(m2);
	m2.ShowDetails();
	m2.color = "Red";
	m2.ShowDetails();
}
	
	
}

