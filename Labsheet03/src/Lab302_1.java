import javax.swing.JOptionPane.*;
public class Lab302_1 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail");
		
		while(true) {
			inputEmail = JOtionPane.showDialog("Input your e-mail").toLowerCase();
			inputEmail = JOptionPane.showDialog("Input your e-mail,agian:");
		}//end of while
		
		chkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("hotmail.com");
		if (chkkEmail) {//if (chkEmail==true
			JOptionPane.showMessageDialog(null, "You e-mail is"+ inputEmail);
			break;
		}

	}

}
