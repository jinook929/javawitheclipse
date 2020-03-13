package org.opentutorials.javatutorials.constant;

interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo {

//	private final static int FRUIT_APPLE = 1;
//	private final static int FRUIT_PEACH = 2;
//	private final static int FRUIT_BANANA = 3;
//	
//	private final static int COMPANY_GOOGLE = 1;
//	private final static int COMPANY_APPLE = 2;
//	private final static int COMPANY_ORACLE = 3;
//	
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
		
//		if(FRUIT.APPLE == COMPANY.APPLE) {
//			System.out.println("Fruit Apple equals to Company Apple.");
//		}
		
		int type_ = FRUIT.APPLE;
		switch(type) {
		case FRUIT.APPLE:
			System.out.println(57 + " kcal");
			break;
		case FRUIT.PEACH:
			System.out.println(34 + " kcal");
			break;
		case FRUIT.BANANA:
			System.out.println(93 + " kcal");
			break;
		}

		
	}

}
