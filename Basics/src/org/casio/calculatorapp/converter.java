package org.casio.calculatorapp;

public class converter {
	
	double convertDegreeCelciusToFarenheit(double celcius) {
		double farenheit = celcius * 1.8 + 32;
		return farenheit;
	}

	double convertFarenheitToCelcius(double farenheit) {
		double celcius = (farenheit - 32) / 1.8;
		return celcius;
	}

	public static void main(String[] args) {
		converter c = new converter();
		double farenheit = c.convertDegreeCelciusToFarenheit(23.5);
		System.out.println(farenheit);
		System.out.println(c.convertFarenheitToCelcius(54.3));
	}
}
