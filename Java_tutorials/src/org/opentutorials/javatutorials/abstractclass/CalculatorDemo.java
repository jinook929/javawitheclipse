package org.opentutorials.javatutorials.abstractclass;

abstract class Calculator {
	int num1;
	int num2;
	
	public void setOperands(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int _sum() {
		return this.num1 + this.num2;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalculatorPlusDeco extends Calculator {
	public void sum() {
		System.out.println("+ Sum : " + _sum());
	}
	public void avg() {
		System.out.println("+ Average : " + (_sum() / 2));
	}
}

class CalculatorMinusDeco extends Calculator {
	public void sum() {
		System.out.println("- Sum : " + _sum());
	}
	public void avg() {
		System.out.println("- Average : " + (_sum() / 2));
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		CalculatorPlusDeco cp = new CalculatorPlusDeco();
		cp.setOperands(10, 20);
		cp.run();
		
		CalculatorMinusDeco cm = new CalculatorMinusDeco();
		cm.setOperands(10, 20);
		cm.run();
		
	}

}
