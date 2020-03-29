package org.opentutorials.javatutorials.constant;

enum Fruit_enum {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color; 
	public String getColor() {
		return this.color;
	}
	Fruit_enum(String color) {
		System.out.println("Call constructor : " + this);
		this.color = color;
	}
}

enum Company_enum {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		
		for(Fruit_enum f : Fruit_enum.values()) {
			System.out.println(f);
		}

		Fruit_enum type__ = Fruit_enum.APPLE;
		switch(type__) {
			case APPLE:
				System.out.println(57 + " kcal, color = " + Fruit_enum.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(34 + " kcal, color = " + Fruit_enum.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + " kcal, color = " + Fruit_enum.BANANA.getColor());
				break;
			}

	}

}
