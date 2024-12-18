import javax.swing.*;
import java.util.*;
public class Labsheet205 {
	
	public static void main(String[] arg) {
		Random rand  = new Random();
		int balance = rand.nextInt(9) * 100000;
		//System.out.println(balance);
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance+"\nInput money to withdraw:"));
		//ตรวจสอบเงื่อนไข
		if (moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than balance,",
					"ERROR",
					JOptionPane.ERROR_MESSAGE) ;
		}else if (moneyWithdraw > 50000 ) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than 50000,",
					"ERROR",
					JOptionPane.ERROR_MESSAGE) ;
		}else if (moneyWithdraw %100 !=0) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw " + (moneyWithdraw %100) + "bath.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE) ;
		}
		//กรณีที่ผ่านเงื่อนไขข้างต้น
		else {
			JOptionPane.showMessageDialog(null, "You withdraw" + moneyWithdraw + "bath." +
					"\n1,000 = " +(moneyWithdraw / 1000)+
					"\n500 = " + (moneyWithdraw %1000)/500)+
					"\n100 = " + (moneyWithdraw %500)/100));
		}
	}
	
}
