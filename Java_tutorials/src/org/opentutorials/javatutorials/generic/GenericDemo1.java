package org.opentutorials.javatutorials.generic;

class StudentInfo {
	public int grade;
	StudentInfo(int grade) { this.grade = grade; }
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class Person_<T> {
	public T info;
	Person_(T info) { this.info = info; }
}

public class GenericDemo1 {

	public static void main(String[] args) {
		Person_<EmployeeInfo> p1 = new Person_<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo ei = p1.info;
		System.out.println(ei.rank);
		
//		StudentInfo si = new StudentInfo(2);
//		Person sp = new Person(si);
//		System.out.println(sp.info.grade);
//		EmployeeInfo ei = new EmployeeInfo(1);
//		EmployeePerson ep = new EmployeePerson(ei);
//		System.out.println(ep.info.rank);
	}
}
