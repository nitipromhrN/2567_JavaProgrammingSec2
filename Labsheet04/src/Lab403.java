import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName; //The input line entered by the user.
		String firstName;//The first name, entered from the input
		
		System.out.print("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int scpae = fullName.indexOf(' '); //หาช่องว่าง (spacebar)
		firstName = fullName.substring(0,space); //ชื่อแรก
		//System.out.println(firstNmae);
		
		//to get the middle name
		System.out.println(abbreviatName(fullName));
		
		input.close();
	}//end mail() method
	
	public static String abbreviatName(String fName) {
		
	}

}
