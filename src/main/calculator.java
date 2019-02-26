package main;

public class calculator {
	
	public double Add(double num1 , double num2) {		
		return num1 + num2;
	}
	public double Multiply(double num1 , double num2) {
		return num1 * num2;
	}
	public double Devide(double num1 , double num2) throws Exception {
		if(num2 == 0) {
			throw new Exception("cannot devide by zero");
		}
		return num1 / num2;
	}
	public double Subtract(double num1 , double num2) {
		return num1 - num2;
	}
	public double Rest(double num1 , double num2) throws Exception {
		if(num2 == 0) {
			throw new Exception("cannot devide by zero");
		}
		return num1 % num2;
	}
}
