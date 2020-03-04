package org.opentutorials.javatutorials.exception;

import java.io.IOException;

class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOException1() throws IOException {
		throw new IOException();
	}
	void throwIOException2() {
		try {
			throw new IOException();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

public class ThrowExceptionDemo2 {

	public static void main(String[] args) {
		int[] nums = {1, 0};
		
		try {
		    System.out.println(nums[1] / nums[2]);
		} catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e){
		    System.out.println("ArithmeticException");
		} catch(Exception e){
		    System.out.println("Exception");
		}
	}
}
