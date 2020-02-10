package org.opentutorials.javatutorials.Inheritance;

//class Calculator {
//    int left, right;
// 
//    public void setOprands(int left, int right) {
//        this.left = left;
//        this.right = right;
//    }
// 
//    public void sum() {
//        System.out.println(this.left + this.right);
//    }
// 
//    public void avg() {
//        System.out.println((this.left + this.right) / 2);
//    }
//}

class MultipliableCalculator extends Calculator {
    public MultipliableCalculator(int left, int right) {
		super(left, right);
	}

	public void multi() {
        System.out.println(this.left * this.right);
    }
}

public class Example2 {

	public static void main(String[] args) {
		MultipliableCalculator c1 = new MultipliableCalculator(10, 20);
//        c1.setOprands(10, 20);
		System.out.println("First Number : " + c1.left);
		System.out.println("Second Number : " + c1.right);
		
        c1.sum();
        c1.avg();
        c1.multi();
	}

}
