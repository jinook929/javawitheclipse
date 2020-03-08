package org.opentutorials.javatutorials.progenitor;

class Calculator {
	int firstNum, SecondNum;
	
	public void setOperands(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.SecondNum = secondNum;
	}
	public void sum() {
		System.out.println(this.firstNum + this.SecondNum);
	}
	
	public void avg() {
		System.out.println((this.firstNum + this.SecondNum) / 2);
	}
	
	public String toString() {
		return "First Number : " + this.firstNum + ", Second Number : " +this.SecondNum;
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}

}
