import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.print("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int scpae = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		System.out.println(abbreviatName(fullName) + firstName);
		
		input.close();
	}
	
	public static String abbreviatName(String fName) {
		String initailLetter = "";
		
		for(int i=0; i<fName.length(); i++) {
			if(fName.charAt(i)==' ') {
				initailLetter = (initailLetter + fName.charAt(i+1)).toUpperCase();
			}
		}
		return initailLetter;
	}

}
