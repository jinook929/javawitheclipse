package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.Collection;
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
		
		ArrayList<Integer> B = new ArrayList<>();
//		Collection<Integer> B = new ArrayList<>();
//		Collection<Integer> B = new HashSet<>();
		B.add(4);
		B.add(5);
		B.add(6);
		
		Iterator<Integer> hiB = B.iterator();
		while(hiB.hasNext()) {
			System.out.println(hiB.next());
		}

	}

}
