package condition;

import javax.swing.JOptionPane;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Input Your ID : ");
		
		if(id.equals("jjo")) {
			String pw = JOptionPane.showInputDialog("Input Your Password : ");
			if(pw.equals("123")) {
				System.out.println("Right!!!");
			} else {
				System.out.println("Invalid Password...");
			}
		} else {
			System.out.println("Invalid ID...");
		}
	}

}
