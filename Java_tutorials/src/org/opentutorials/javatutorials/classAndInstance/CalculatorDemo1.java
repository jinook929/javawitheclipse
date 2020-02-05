package org.opentutorials.javatutorials.classAndInstance;

class Calculator {
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void sum_base() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
	public void avg_base() {
		System.out.println((this.left + this.right + base) / 2);
	}
}

class Calculator_static {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
		
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.sum_base();
		c1.avg();
		System.out.println(c1.PI);

		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.sum_base();
		c2.avg();
		System.out.println(c2.PI);

		System.out.println(Calculator.PI);
		
		Calculator.base = 10;
		c1.sum();
		c1.sum_base();
		c2.sum();
		c2.sum_base();
		
		Calculator_static.sum(10, 20);
		Calculator_static.avg(10, 20);
		
		Calculator_static.sum(20, 40);
		Calculator_static.avg(20, 40);
	}

}
