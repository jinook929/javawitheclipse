
public class EqualsApp {

	public static void main(String[] args) {

		String o1 = "java";
		String o2 = new String("java");
		String o3 = "java";
		String o4 = new String("java");

		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		System.out.println(o2 == o4);
		
		System.out.println(o1.equals(o2));
		System.out.println(o2.equals(o4));

	}

}
