
public class LoopArray {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "jjo";
		users[1] = "jsj";
		users[2] = "jua";
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("<li>" + users[i] + "</li>");
		}

	}

}
