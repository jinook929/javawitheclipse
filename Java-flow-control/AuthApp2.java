
public class AuthApp2 {

	public static void main(String[] args) {

		String id = "jjo";
		String inputId = args[0];
		
		String pass1 = "111";
		String pass2 = "222";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		boolean isRightPass = inputPass.equals(pass1) || inputPass.equals(pass2);
		
		if(id.equals(inputId) && isRightPass) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
