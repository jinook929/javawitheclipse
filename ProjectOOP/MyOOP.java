
public class MyOOP {
	
	public static void main(String[] args) {

		Print p1 = new Print("----");
//		p1.delimiter ="----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
//		Print.delimiter = "----";
//		Print.A();
//		Print.A();
//		Print.B();
//		Print.B();

		Print p2 = new Print("****");
//		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
//		Print.delimiter = "****";
//		Print.A();
//		Print.A();
//		Print.B();
//		Print.B();
		
		p1.A();
		p2.A();
		p1.B();
		p2.B();
				
	}
	
//	public static void printA() {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//	}
//
//	public static void printB() {
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
	
}


