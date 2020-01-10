
public class AuthApp3 {

	public static void main(String[] args) {

//		String[] users = {"jjo", "jsj", "jua"};
		String[][] users = {
			{"jjo","111"}, 
			{"jsj", "222"}, 
			{"jua", "333"}
		};
		
		String inputId = args[0];
		String inputPw = args[1];
		
		boolean isLoggedIn = false;
		for(int i = 0; i < users.length; i++) {
			String currentId = users[i][0];
			String currentPw = users[i][1];
			if(inputId.equals(currentId) && inputPw.equals(currentPw)) {
				isLoggedIn = true;
				break;
			}
		}
		
		if(isLoggedIn) {
			System.out.println("Welcome, " + inputId + "!");
		} else {
			System.out.println("Please, sign up first.");
		}

	}

}
