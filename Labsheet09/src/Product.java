import javax.swing.JOptionPane;
public class Product {
	private int unit;
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getUnit() {
		return this.unit;
	}
	public int getTotalprice() {
		return unit * 100;
	}
	public String toString() {
		return "You buy " + unit + "units" + (" + getTotalprice() + ").";
	}
	public class Shop100Bath {
		public static void main(String[] args) {
			Product sold = new Product();
			
			String input = JOptionPane.showInputDialog("Input the number of product: ");
			int unit = Integer.parseInt(input);
			sold.setUnit(unit);
			
			JOptionPane.showMessageDialog(null, sold.toString());
		}
	}
}
