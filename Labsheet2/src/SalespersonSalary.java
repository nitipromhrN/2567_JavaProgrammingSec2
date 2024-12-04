import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declare constants
		final double BASE_SALARY = 1000.0;
		 final double COMMISSION_RATE = 1000.0;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 while(true) {
			 System.out.print("Enter gross sales for the salesperson(or -1 to end) : ");
			 sales = input.nextInt();
			 
			 //check for SENTINEL value
			 if (sales == SENTINEL) {
				 break;
			 }
			 //Computer salary
			 salary = BASE_SALARY + (sales * COMMISSION_RATE) ;
			 
			 //Display the salary
			 System.out.printf("The saleperson's salary is : $@2.f",salary) ;
			 
		 } //end while
		 System.out.print("bye");
		 
		 input.close();
	}

}
