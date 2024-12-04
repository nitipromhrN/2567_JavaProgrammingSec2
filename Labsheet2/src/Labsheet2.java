import javax.swing.*;
import java.text.*;
public class Labsheet2 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int ismember;
		
		DecimalFormat frm = new DecimalFormat ("#.###.00");
		
		int numberofcustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = BUFFET * numberofcustomer;
		
		//System.out.printf("Total Price is %,.2f bath.",totalPrice);
		do {
			ismember = JOptionPane.showConfirmDialog(null,"Total Price is "+frm.format(totalPrice) +  " bath."+
					"\nDo you have a member card?");
		}while(ismember == JOptionPane.CANCEL_OPTION);
		
		if (ismember == JOptionPane.YES_OPTION) { //if(isMember == 0
			//คำนวณราคาหลังหักส่วนลด 10%
			double Priceafterdiscount = totalPrice *0.90 ;
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(Priceafterdiscount) +" bath.");
		}else if (ismember == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,"Amount be paid is " +totalPrice +" bath.");
		}
	}

}
