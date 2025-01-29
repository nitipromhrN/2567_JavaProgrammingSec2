public class Product {
	private String productID;
	private int productUnit;
	private double productPrice;
	
	public void setID(String pid) {
		productID = pid;
	}
	public String getID() {
		return productID;
	}
	public void setUnit(int proUnit) {
		productUnit = proUnit;
	}
	public int getUnit() {
		return productUnit;
	}
	public void setPrice(double proPrice) {
		productPrice = proPrice;
	}
	public double gerPrice() {
		return productPrice;
	}
	public double calculate() {
		return getUnit() * setPrice();
	}
}
