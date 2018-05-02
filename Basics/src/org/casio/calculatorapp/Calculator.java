package org.casio.calculatorapp;

public class Calculator {
	
	int add(int num1,int num2){
	int res = num1 + num2;
	return res;//short form of result (can write as result or res)
	}
	
	int multiply(int num1, int num2){
	int res = num1 * num2;
	return res;
	}

	int divide (int num1, int num2){
	int res = num1 / num2;
	return res;
	}
	
	int sub(int num1, int num2){
		int res = num1 - num2;
		return res;
	}
	
	int square(int num1){
	int res = num1 * num1;
	return res;
	}
	
	int cubeOfNumbers(int num1){
	int res = num1* num1* num1;
	return res;
	}
	
	int convertHourToMinute(int hour){
	int minutes = hour * 60;
	return minutes;
	}// c*1.8+32 (to convert to farenheit)
	
		public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(25, 35);//storing a value and printing it
		System.out.println(result);
		System.out.println(c.add(54, 89));//directly printing the value
		System.out.println(c.multiply(32, 2));
		System.out.println(c.divide(590, 30));
		System.out.println(c.sub(90, 78));
		int square = c.square(15);
		System.out.println(square);
		System.out.println(c.cubeOfNumbers(34));
		int minutes= c.convertHourToMinute(34);
		System.out.println(minutes);
		
				
	
}
}
