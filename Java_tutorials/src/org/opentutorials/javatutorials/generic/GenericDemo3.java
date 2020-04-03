package org.opentutorials.javatutorials.generic;

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfoTwo extends Info {
	public int rank;
	EmployeeInfoTwo(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class PersonTwo<T extends Info> {
	public T info;
	PersonTwo(T info) {
		this.info = info;
		info.getLevel();
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		PersonTwo<EmployeeInfoTwo> p1 = new PersonTwo<EmployeeInfoTwo>(new EmployeeInfoTwo(10));
		System.out.println(p1.info.getLevel());
	}

}
