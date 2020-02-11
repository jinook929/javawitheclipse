package org.opentutorials.javatutorials.Inheritance;

class ArrayCalculator {
	int[] operands;
	
	public void setOperands(int[] operands) {
		this.operands = operands; 
	}
	
	public void sum() {
		int sum = 0;
		for(int i = 0; i < operands.length; i++) {
			sum += operands[i];
		}
		System.out.println(sum);
	}
	
	public void avg() {
		int sum = 0;
		for(int i = 0; i < operands.length; i++) {
			sum += operands[i];
		}
		System.out.println(sum / operands.length);
	}
}

public class Example5 {

	public static void main(String[] args) {
		ArrayCalculator ac = new ArrayCalculator();
		
		ac.setOperands(new int[] {10});
		ac.sum();
		ac.avg();
		
		ac.setOperands(new int[] {10, 20});
		ac.sum();
		ac.avg();
		
		ac.setOperands(new int[] {10, 20, 30});
		ac.sum();
		ac.avg();
		
		ac.setOperands(new int[] {10, 20, 30, 40});
		ac.sum();
		ac.avg();
		
	}

}
