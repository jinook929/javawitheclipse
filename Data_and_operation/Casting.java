
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
//		int c = 1.5; // error
		int c = (int) 1.5;
		System.out.println(c);
		
		// 1 to String
		String str = Integer.toString(1);
		System.out.println(str.getClass().getSimpleName());

	}

}
