package org.opentutorials.javatutorials.collection;

//import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo {

	public static void main(String[] args) {

		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(1);
		AL.add(2);
		AL.add(2);
		AL.add(3);
		AL.add(3);
		AL.add(3);
		
		Iterator<Integer> hiyo = AL.iterator();
		while(hiyo.hasNext()) {
			System.out.println(hiyo.next());
		}
		
		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		
		Iterator<Integer> hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		HashSet<Integer> B = new HashSet<>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<>();
		C.add(1);
		C.add(2);

		System.out.println(A.containsAll(B));
		System.out.println(A.containsAll(C));

	}

}
