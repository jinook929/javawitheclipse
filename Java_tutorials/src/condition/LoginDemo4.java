package condition;

import javax.swing.JOptionPane;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("Input Your ID : ");
		String pw = JOptionPane.showInputDialog("Input Your Password : ");
		
		if((id.equals("jjo") || id.equals("tndk") || id.equals("wndk")) && pw.equals("0000")) {
			System.out.println("Welcome, " + id + " ~^^~");
		} else {
			System.out.println("Invalid ID or Password...");
		}
	}

}
