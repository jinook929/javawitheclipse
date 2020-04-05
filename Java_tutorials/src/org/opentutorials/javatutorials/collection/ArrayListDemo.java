package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three";

		for(int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> arrayListObj = new ArrayList<>();
		arrayListObj.add("ONE");
		arrayListObj.add("TWO");
		arrayListObj.add("THREE");
		arrayListObj.add("FOUR");
		arrayListObj.add("FIVE");
		arrayListObj.add("SIX");
		arrayListObj.add("SEVEN");
		
		for(int i = 0; i < arrayListObj.size(); i++) {
			String value = arrayListObj.get(i);
			System.out.println(value);
		}
	}

}
