package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}

public class ScopeDemo3 {
	
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.v);
		System.out.println("===");
		c1.m();
//		System.out.println(c1.m().v); error
	}

}
