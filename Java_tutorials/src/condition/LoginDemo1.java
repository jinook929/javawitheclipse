package condition;

import javax.swing.JOptionPane;

public class LoginDemo1 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Input Your ID : ");
		
		if(id.equals("jjo")) {
			System.out.println("Right!!!");
		} else {
			System.out.println("Wrong...");
		}
	}

}
