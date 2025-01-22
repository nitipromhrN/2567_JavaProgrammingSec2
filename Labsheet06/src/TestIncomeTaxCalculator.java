public class TestIncomeTaxCalculator {
	public static void main(String[] args) {
		TestIncomeTaxCalculator taxCalculator = new IncomeTaxCalculator();
		taxCalculator.setIncome(450000);
		
		taxCalculator.displayTaxDetails();
	}

}
