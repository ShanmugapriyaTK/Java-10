package com.mr.markerbasicexample;

public class NewMarker {
	String color;
	int price = 52;
	String brand = "Camlin";
	
	NewMarker(String color)
	{
		this.color = color;
	}
			
	public static void main(String[] args) {
		NewMarker n1 = new NewMarker("Blue");
		System.out.println(n1.color+" "+n1.price+" "+n1.brand);
	}

}
