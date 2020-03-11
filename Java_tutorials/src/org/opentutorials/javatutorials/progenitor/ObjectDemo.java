package org.opentutorials.javatutorials.progenitor;

//class Human {
//	protected String test() {
//		return "test";
//	}
//}

class Student implements Cloneable{
	String name;
	Student(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public boolean equals(Object obj) {
		Student _obj = (Student) obj;
		return name == _obj.name;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("jjo");
//		Student s2 = new Student("jjo");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
