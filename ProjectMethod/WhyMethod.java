import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {

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
		
		System.out.println("===== =====");
		
		System.out.println(twoTimes("jjo", "@"));
		
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("Q", "^"));
		fw.close();
		
//		Email.send("jinook929@gmail.com", "a two times", twoTimes("a", "&"));

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
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}

}
