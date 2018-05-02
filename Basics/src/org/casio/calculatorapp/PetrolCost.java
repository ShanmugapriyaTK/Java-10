package org.casio.calculatorapp;

public class PetrolCost {
	void calculateAmountOfPetrol(double money){
		double litres = money/74.38;
		System.out.println("You get " +litres+ " of fuel");
	}

	public static void main(String[] args) {
		PetrolCost p = new PetrolCost();
		p.calculateAmountOfPetrol(2500.56);
	}
}
