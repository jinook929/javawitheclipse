package org.opentutorials.javatutorials.polymorphism;

abstract class Calculator {
	private int num1, num2;
	
	public void setOperands(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	protected int _sum() {
		return num1 + num2;
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
		System.out.println("Sum +++ " + _sum() + " +++");
	}
	public void avg() {
		System.out.println("Average +++ " + (_sum() / 2) + " +++");
	}
}

class CalculatorMinusDeco extends Calculator {
	public void sum() {
		System.out.println("Sum --- " + _sum() + " ---");
	}
	public void avg() {
		System.out.println("Average --- " + (_sum() / 2) + " ---");
	}
}

public class CalculatorDemo {
	public static void execute(Calculator cal) {
		System.out.println("Result");
		cal.run();
	}
	
	public static void main(String[] args) {
		
		Calculator cp = new CalculatorPlusDeco();
		cp.setOperands(10, 20);
		
		Calculator cm = new CalculatorMinusDeco();
		cm.setOperands(10, 20);
		
		execute(cp);
		execute(cm);
	}
}
