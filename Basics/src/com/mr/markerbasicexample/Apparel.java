package com.mr.markerbasicexample;

public class Apparel {
	String type;
	String color;
	char size;

	Apparel(String type, String color, char size)//constructor
	{
		this.type = type;
		this.color = color;
		this.size = size;
	}
	
	
	Apparel(String type, char size) {
		
		this.type = type;
		this.size = size;
		this.color = "Black";
	}

	public static void main(String[] args) {
		Apparel a =  new Apparel("Jean", "Blue", 'M');
		a.ShowDetails();
		
		Apparel a1 = new Apparel("T Shirt", "Black", 'L');
		a1.ShowDetails();
		
		Apparel a2 = new Apparel("shirt", 'S');
		a2.ShowDetails();
	}
	
	void ShowDetails()
	{
		System.out.println(this.type+" "+this.color+" "+this.size);
	}
	
}
