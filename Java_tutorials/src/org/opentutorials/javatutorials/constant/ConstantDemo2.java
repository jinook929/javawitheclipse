package org.opentutorials.javatutorials.constant;

enum Fruit_enum {
	APPLE, PEACH, BANANA;
}

enum Company_enum {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2 {

	public static void main(String[] args) {

		Fruit_enum type__ = Fruit_enum.APPLE;
		switch(type__) {
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
