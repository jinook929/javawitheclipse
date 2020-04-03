package org.opentutorials.javatutorials.generic;

class EmployeeInfoOne {
	public int rank;
	EmployeeInfoOne(int rank) {
		this.rank = rank;
	}
}

class PersonOne<T, S> {
	public T info;
	public S id;
	PersonOne(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {

		PersonOne<EmployeeInfoOne, Integer> p1 = new PersonOne<EmployeeInfoOne, Integer>(new EmployeeInfoOne(3), 1);
		System.out.println(p1.id);
		System.out.println(p1.info.rank);
		p1.printInfo("Information");

	}

}
