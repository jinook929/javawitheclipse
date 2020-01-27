package loop;

public class ForDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("Coding everybody" + i);
		}
		
		System.out.println("=====");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Coding everybody" + ((i + 1) * 2));
		}
	}

}
