public class LoanCalculater {
	private String productName;
	private double price;
	private double interestRate;
	private int year;
	
	public void setLoanDetails(String product,double price,double interestRate, int year) {
		productName = product;
		price = price;
		interestRate = interestRate;
		year = year;
	}
	public double calculaterMonthlyPayment() {
		return price + (interestRate / 2);
	}
	public void displayLoanDetails() {
		System.out.println("Product: "+ productName);
		System.out.println("Price: "+ price);
		System.out.println("Interest Rate: "+ interestRate);
		System.out.println("Monthly Payment: "+ calculaterMonthlyPayment());
	}
}
