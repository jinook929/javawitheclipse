package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {
		return "x";
	}
}

class B extends A {
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.x();
		System.out.println(obj.x());
//		obj.y(); // error
//		System.out.println(obj.y());

	}

}
