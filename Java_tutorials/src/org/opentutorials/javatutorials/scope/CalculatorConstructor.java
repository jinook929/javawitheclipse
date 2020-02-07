package org.opentutorials.javatutorials.scope;

class Calculator {
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorConstructor {

	public static void main(String[] args) {

		Calculator c1 = new Calculator(90, 180);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(500, 1000);
		c2.sum();
		c2.avg();
		
	}

}
