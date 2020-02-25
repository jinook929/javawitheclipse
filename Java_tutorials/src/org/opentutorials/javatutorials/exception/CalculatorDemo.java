package org.opentutorials.javatutorials.exception;

class Calculator {
	int firstNum, secondNum;
	public void setOperands(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public void divide() {
		try {
			System.out.print("계산 결과는 ");
		System.out.print(this.firstNum / this.secondNum);
		System.out.print(" 입니다.");
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다 : " + e.getMessage());
		}
		
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
	}
}
