
public class WhyMethod {

	public static void main(String[] args) {

		//...
		printATwoTimes();
//		System.out.println("-");
//		System.out.println("B");
//		System.out.println("B");
		//...
		printATwoTimes();
//		System.out.println("-");
//		System.out.println("B");
//		System.out.println("B");
		//...
		printATwoTimes();
//		System.out.println("-");
//		System.out.println("B");
//		System.out.println("B");
		
		printArgTwoTimes('a', "-");
		printArgTwoTimes('b', "*");
		printArgTwoTimes('c', "&");
		printArgTwoTimes('d', "!");

	}
	
	public static void printATwoTimes() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printArgTwoTimes(char x, String y) {
		System.out.println(y);
		System.out.println(x);
		System.out.println(x);
	}

}
