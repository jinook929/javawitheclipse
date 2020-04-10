package org.opentutorials.javatutorials.collection;

import java.util.*;

class Computer implements Comparable<Object> {
	int serial;
	String owner;
	public Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}

	public int compareTo(Object o) {
		return this.serial - ((Computer) o).serial;
	}
	
	public String toString() {
		return serial + " " + owner;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {

		List<Computer> computers = new ArrayList<>();
		computers.add(new Computer(500, "elephant"));
		computers.add(new Computer(200, "lion"));
		computers.add(new Computer(3233, "garlic"));
		
		Iterator<Computer> i = computers.iterator();
		System.out.println("Before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(computers);
		System.out.println("\nAfter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
