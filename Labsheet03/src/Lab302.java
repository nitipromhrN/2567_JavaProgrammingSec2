import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail");
		
		while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			inputEmail = JOtionPane.showInputDialog("Input your e-mail,again:");
			
		}
		if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("howmail.com")) {
			inputEmail = JOtionPane.showInputDialog(null,"Your e-mail is "+ inputEmail);
		} else {
			inputEmail = JOtionPane.showInputDialog(null,"Your e-mail is not hotmail or gmail dot com");
		}

	}

}
