package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	public static void main(String[] args) {
		/*
		 * 1. apple
		 * 2. peach
		 * 3. banana
		 */
		int type = 1;
		switch(type) {
			case 1:
				System.out.println(57);
				break;
			case 2:
				System.out.println(34);
				break;
			case 3:
				System.out.println(93);
				break;
		}
		
		int type_ = APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57 + " kcal");
			break;
		case PEACH:
			System.out.println(34 + " kcal");
			break;
		case BANANA:
			System.out.println(93 + " kcal");
			break;
		}

		
	}

}
