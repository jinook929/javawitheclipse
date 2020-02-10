package org.opentutorials.javatutorials.Inheritance;

class DividableCalculator extends MultipliableCalculator {
	public DividableCalculator (int left, int right) {
		super(left, right);
	}
	
    public void quo() {
        System.out.println(this.left / this.right);
    }
}

public class Example3 {

	public static void main(String[] args) {
		DividableCalculator c1 = new DividableCalculator(20, 10);
//        c1.setOprands(20, 10);
		System.out.println("First Number : " + c1.left);
		System.out.println("Second Number : " + c1.right);
		
        c1.sum();
        c1.avg();
        c1.multi();
        c1.quo();
	}

}
