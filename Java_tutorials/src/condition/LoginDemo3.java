package condition;

import javax.swing.JOptionPane;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Input Your ID : ");
		String pw = JOptionPane.showInputDialog("Input Your Password : ");
		
		if(id.equals("jjo") && pw.equals("111")) {
			System.out.println("Welcome, " + id + " ~^^~");
		} else {
			System.out.println("Invalid ID or Password...");
		}
	}

}
