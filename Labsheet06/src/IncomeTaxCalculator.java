public class IncomeTaxCalculator {
	private double income;
	
	public void setIncome(double incomee) {
		income = incomee;
	}
	public double calculateTax() {
		double Tax = 0.0;
		if(income <= 150000) {
			Tax = 0.0; 
		} else if (income <= 300000) {
			Tax = (income - 150000) * 0.05;
		} else if (income <= 500000 ) {
			Tax = (150000 * 0.05) * ((income - 300000) *  0.1);
		} else {
			Tax = (150000 * 0.05) + (200000 * 0.1) + ((income - 500000) * 0.2);
		}
		return Tax;
	}
	public void displayTaxDetails() {
		System.out.println("Income: " + income);
		System.out.println("Tax: " + calculateTax());
	}
}
