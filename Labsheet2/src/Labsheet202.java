import java.util.*;
public class Labsheet202 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int newNumber = Integer.MIN_VALUE;
		int oldNumber;
		while(true) {
			System.out.println("Input number : ");
			oldNumber = Scanner.nextInt();
			if (oldNumber < newNumber) {
				break;
			}
			newNumber = oldNumber;
		}
		System.out.println("BYE BYE");
		Scanner.close();
	}
}

