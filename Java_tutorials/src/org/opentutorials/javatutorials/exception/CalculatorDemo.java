package org.opentutorials.javatutorials.exception;

class Calculator {
	int firstNum, secondNum;
	public void setOperands(int firstNum, int secondNum) {
//		if(secondNum == 0) {
//			throw new IllegalArgumentException("The secondNum cannot be zero.");
//		}
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public void divide() {
		if(secondNum == 0) {
			throw new ArithmeticException("The divisor cannot be zero.");
		}
		try {
			System.out.print("계산 결과는 ");
		System.out.print(this.firstNum / this.secondNum);
		System.out.print(" 입니다.");
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		System.out.println("Divide End");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		try {
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
