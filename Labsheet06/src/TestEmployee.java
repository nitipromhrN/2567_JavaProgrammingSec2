
public class TestEmployee {

	public static void main(String[] args) {
		//create two employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		 //Set employee details
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//display employee details
		System.out.println("Employee 1 Deatails");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Deatails");
		emp2.displayEmployeeDetails();
	}

}
