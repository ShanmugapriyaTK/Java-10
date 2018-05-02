package org.qspiders.functions;

public class ArithmeticFunctions {
	int addNumbers(int num1, int num2){
	int result = num1 + num2;
	return result;
	}
	
	double multiplyNumbers(double num1, double num2, double num3){
	double result1 = num1 * num2 * num3;
	return result1;
	}
	
	double subtractNumbers(double num1, double num2, double num3, double num4){
		double result2 = (num1 + num2) - (num3 + num4);
		return result2;
	}
	
	void divideNumbers(int num1, double num2){
		double result3= num1/num2;
		System.out.println();
	}
	public static void main(String[] args) {
		ArithmeticFunctions a1 = new ArithmeticFunctions();
		int result = a1.addNumbers(56, 56);
		double result1 = a1.multiplyNumbers(23.56, 56.82, 89.05);
		double result2 = a1.subtractNumbers(50.23, 89.56, 23.01, 45.01);
		//double result3 = a1.divideNumbers(85, 5.2);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		a1.divideNumbers(85, 5.2);
		
		
	}
}
