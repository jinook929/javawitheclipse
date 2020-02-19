package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {
		return "A.x";
	}
}

class B1 extends A {
	public String x() {
		return "B1.x";
	}
	public String y() {
		return "y";
	}
}

class B2 extends A {
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj1 = new B1();
		obj1.x();
		System.out.println(obj1.x());
//		obj1.y(); // error
//		System.out.println(obj1.y());
		
		A obj2 = new B2();
		System.out.println(obj1.x());
		System.out.println(obj2.x());

	}

}
