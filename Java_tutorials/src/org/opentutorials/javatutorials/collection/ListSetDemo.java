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
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(2);
		A.add(2);
		A.add(1);
		
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

		System.out.println("=====");
		
		Iterator<Integer> hiA = A.iterator();

		while(hiA.hasNext()) {
			System.out.println(hiA.next());
		}
		
		System.out.println("=====");

//		A.addAll(B);
		System.out.println(A.size());
		A.retainAll(B);
		System.out.println(A.size());
//		A.removeAll(B);
		System.out.println(A.size());
		
		System.out.println("=====");

		Iterator<Integer> hi1 = A.iterator();

		while(hi1.hasNext()) {
			System.out.println(hi1.next());
		}
	}

}
