import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับข้อมูลทาง Ketboard
		Scanner input = new Scanner(System.in);
		//กำหนด object ในการจัดรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#.###.00");
		//แสดงผลและรับข้อมูลสินค้า
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		//แสดงและรับข้อมูลราคาสินค้า
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println(); //เว้น 1 บรรทัด
		//คำนวณหาผลรวมของสินค้า
		float totalPriceofProduct = productUnit * productPrice;
		System.out.print("Total Price is " +frm.format(totalPriceofProduct) +" bath."); //คำนวฯภาษีเพิ่ม 7%
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+ frm.format(totalwithVat) + "bath.");
		System.out.println(); //เว้น 1 บรรทัด
		//Output using String.format and printf
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7% is "+ frmtotalwithVat + "bath.");
		System.out.println("Output using Printf");
		System.out.printf("Add VAT 7%%  is %,.2f ", totalwithVat);
		input.close();
	}

}
