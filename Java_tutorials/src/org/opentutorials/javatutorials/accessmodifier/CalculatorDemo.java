package org.opentutorials.javatutorials.accessmodifier;

class Calculator {
	private int num1, num2;
	
	public void setOperands(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	private int _sum() {
		return num1 + num2;
	}
	
	public void sumDecoPlus() {
		System.out.println("+++ " + _sum() + " +++");
	}
	
	public void sumDecoMinus() {
		System.out.println("--- " + _sum() + " ---");
	}
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(10, 20);
		c.sumDecoPlus();
		c.sumDecoMinus();
	}

}
