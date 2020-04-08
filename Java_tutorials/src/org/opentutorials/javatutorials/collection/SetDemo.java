package org.opentutorials.javatutorials.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator<Integer> hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}

	}

}
