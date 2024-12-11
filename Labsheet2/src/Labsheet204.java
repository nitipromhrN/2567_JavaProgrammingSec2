import java.util.*;
public class Labsheet204 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input value of X: ");
		int x = scanner.nextInt();
		int y;
		do {
		    System.out.print("Input value of Y: ");
		    y = scanner.nextInt();
		    if (y <= x ) {
		        System.out.print("Y must be breater than X. Please ytry again.");
		    }
		} while (y <= x);
		int sum = x;
		int increment = 1;;
		while (sum <= y) {
		    System.out.print(sum + " + " + increment + " = " + (sum + increment));
		    sum += increment;
		    increment++;
		}
		
	}
}
