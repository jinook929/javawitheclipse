package org.opentutorials.javatutorials.Inheritance;

import java.util.ArrayList;

class CalculatorOverloading {
	ArrayList<Integer> nums = new ArrayList<>();
	
	public void setOperands(int first, int second) {
		nums.clear();
		nums.add(first);
		nums.add(second);
	}
	
	public void setOperands(int first, int second, int third) {
		nums.clear();
		nums.add(first);
		nums.add(second);
		nums.add(third);
	}
	
	public void setOperands(int first, int second, int third, int fourth) {
		nums.clear();
		nums.add(first);
		nums.add(second);
		nums.add(third);
		nums.add(fourth);
	}
	
	public void sum() {
		int sum = 0;
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		System.out.println("The sum of the numbers = " + sum);
	}
	
	public void avg() {
		int sum = 0;
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		int avg = sum / nums.size();
		System.out.println("The average of the numbers = " + avg);
	}	
}

public class Example4 {

	public static void main(String[] args) {
		CalculatorOverloading c = new CalculatorOverloading();
		
		c.setOperands(10, 20);
		System.out.println("How many numbers? " + c.nums.size());
		c.sum();
		c.avg();
		
		c.setOperands(10, 20, 30);
		System.out.println("How many numbers? " + c.nums.size());
		c.sum();
		c.avg();
		
		c.setOperands(10, 20, 30, 40);
		System.out.println("How many numbers? " + c.nums.size());
		c.sum();
		c.avg();
	}

}
