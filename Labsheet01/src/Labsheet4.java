import javax.swing.JOptionPane;

	public class Labsheet4 {
	    public static void main(String[] args) {

	        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");

	        String employeeName = JOptionPane.showInputDialog("Enter employee name");

	        String hoursWorkedInput = JOptionPane.showInputDialog("Enter total hours for this employee");
	        double hoursWorked = Double.parseDouble(hoursWorkedInput);

	        String hourlyWageInput = JOptionPane.showInputDialog("Enter hourly wage for this employee");
	        double hourlyWage = Double.parseDouble(hourlyWageInput);
			
	        double grossEarnings = hoursWorked * hourlyWage;
	        double taxRate = 0.15;
	        double tax = grossEarnings * taxRate;
	        double netEarnings = grossEarnings - tax;
			
	        String output = String.format(
	            "Employee name: %s\n" +
	            "Hours worked: %.1f\n" +
	            "Hourly wage: $ %.2f\n" +
	            "Gross earnings: $ %.2f\n" +
	            "Tax rate: %.2f\n" +
	            "Tax: $ %.2f\n" +
	            "Net earnings: $ %.2f",
	            employeeName, hoursWorked, hourlyWage, grossEarnings, taxRate, tax, netEarnings
	        );
	        JOptionPane.showMessageDialog(null, output);
	    }
	}

