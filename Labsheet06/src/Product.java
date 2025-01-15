public class Product {
	private String name ;
	private double  price;
	private double vatRate;
	
	public void setProductDetails(String proName,double beforePrice,double aftervatRate) {
		name = proName;
		price = beforePrice;
		vatRate = aftervatRate;	
	}
	public double calculatetotalPrice() {
			return (price * vatRate / 100); 	
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details:");
		System.out.println("Product Name: "+ name);
		System.out.println("Price (Before VAT: " + price);
		System.out.println("Price (After VAT): " + calculatetotalPrice());
	}
}
