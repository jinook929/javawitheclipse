package org.opentutorials.javatutorials.Inheritance;

class Calculator {
    int left, right;
    
    public Calculator() {}
 
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void setOperands(int left, int right) {
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

class SubstractableCalculator extends Calculator {
//    public SubstractableCalculator(int left, int right) {
//		super(left, right);
//	}

	public void diff() {
        System.out.println(this.left - this.right);
    }
}

public class Example1 {

	public static void main(String[] args) {
		SubstractableCalculator c1 = new SubstractableCalculator();
        c1.setOperands(10, 20);
		System.out.println("First Number : " + c1.left);
		System.out.println("Second Number : " + c1.right);
		
        c1.sum();
        c1.avg();
        c1.diff();
	}

}
