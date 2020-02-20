package org.opentutorials.javatutorials.polymorphism;

interface I {}

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class C implements I {}

class D implements I2, I3 {
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		I obj = new C();
		
		D obj1 = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj1.A();
		obj1.B();
		System.out.println(obj1.A());
		System.out.println(obj1.B());
		
		System.out.println(objI2.A());
//		System.out.println(objI2.B()); // error
		
//		System.out.println(objI3.A()); // error
		System.out.println(objI3.B());
	}

}
