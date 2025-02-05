import java.util.*;
public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input employee id	: ");
		String empId = scan.next();
		//scan.nextLine();
		System.out.println("Input emploee name	: ");
		String empName = scan.nextLine();
		System.out.println("Input employee salary	: ");
		double empSalary = scan.nextDouble();
		System.out.println("Input employee sales	: ");
		double empSales = scan.nextDouble();
		
		Sales emp1 = new Sales(empId,empName,empSalary,empSales);
		System.out.println("emp1");
		System.out.print("Total salary "+(emp1.getSalary()+emp1.getCommission())+ "bath.");
	}
}
