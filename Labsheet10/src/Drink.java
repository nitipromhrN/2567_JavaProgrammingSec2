public class Drink {
	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	public Drink() {
		
	}
	public String getTypeName(String letter) {
		return "1".equals(letter) ? "Hot" : ("2".equals(letter) ? "cold" : " ");  
	}
	public int getTypePrice(String letter) {
		return "1".equals(letter) ? "10" : ("2".equals(letter) ? "20" : " ");
	}
	public String getSizeName(String letter) {
		return "S-s".equals(letter) ? "15" : "M-m".equals(letter) ? "20" : ("L-l".equals(letter) ? "25" : " ");
	}
	public int getSizePrice(String letter) {
		return "S-s".equals(letter) ? "15" : "M-m".equals(letter) ? "20" : ("L-l".equals(letter) ? "25" : " ");
	}
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
			
	}
}
