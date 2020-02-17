package org.opentutorials.javatutorials.accessmodifier;

class A {
	public String x() {
		return "public void x()";
	}
	
	private String y() {
		return "public void y()";
	}
	
	public String z() {
		return y();
	}
}

public class AccessDemo1 {	
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.x());
//		System.out.println(a.y()); // error
		System.out.println(a.z());
	}
}
