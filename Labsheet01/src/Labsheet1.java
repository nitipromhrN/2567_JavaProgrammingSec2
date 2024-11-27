import java.util.*;
import java.text.*;
public class Labsheet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println("----------------------------------------------------------");
		double totalPriceofProduct = productUnit * productPrice;
		System.out.println("total Price is "+totalPriceofProduct +" bath.");
		System.out.println("----------------------------------------------------------");
		System.out.print("How many discount (%): ");
		float productVat = input.nextFloat();
		System.out.println("----------------------------------------------------------");
		System.out.println("Discount from 		"+productVat +"%"	+productUnit * productPrice*15/100 +" bath.");
		System.out.println("Amount to be paid  		"+productUnit * productPrice +"bath.");
	}

}
