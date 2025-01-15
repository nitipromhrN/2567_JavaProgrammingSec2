import java.util.*;
public class TestEmployeeInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		
		//create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Input date for first employee
		System.out.println("Enter details for employee 1:");
		System.out.println("Name: ");
		String empName1 = scan.nextLine();
		System.out.println("Hours Worked: ");
		int empHourWorked1 = scan.nextInt();
		System.out.println("Hourly Rate : ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHourWorked1, empHourlyRate1);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		scan.nextLine();
		
		//Input date for second employee
		System.out.println("Enter details for employee 1:");
		System.out.println("Name: ");
		String empName2 = scan.nextLine();
		System.out.println("Hours Worked: ");
		int empHourWorked2 = scan.nextInt();
		System.out.println("Hourly Rate : ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHourWorked2, empHourlyRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		scan.close();
	}// end of Main
	//Line method
	public static void Line(char symbol) {
		//System.out.println("------------------------------------------------------");
		for(int i=1;i<=50;i++) {
			System.out.println("-");
		}
	}//end of Line() method
}
