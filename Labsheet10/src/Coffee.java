public class Coffee {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		this.type = type;
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	Coffee(int type, int typeCoffee) {
		this.type = type;
		this.typeCoffee = typeCoffee;
	}
	public Barista getBarista() {
		return this.barista;
	}
	public String getTypeName(String letter) {
		return "1".equals(letter) ? "Americano" : "2".equals(letter) ? "Espresso" : ("3".equals(letter) ? "Cappuccino" :" "); 
	}
	public int getTypePrice(String letter) {
		return "1".equals(letter) ? "10" : ("2".equals(letter) ? "20" : " ");
		return 0;
	}
	public String getSizeName(String letter) {
		return "S".equals(letter) ? "Short" : "T".equals(letter) ? "Tall" : "G".equals(letter) ? "Grande" : ("V".equals(letter) ? "Venti" : " "); 
	}
	public int getSizePrice(String letter) {
		return "S".equals(letter) ? "100" : "T".equals(letter) ? "150" : "G".equals(letter) ? "200" : ("V".equals(letter) ? "250" : " ");
		return 0;
	}
	public int getTotalPrice(String letter) {
		return getTypePrice(letter) + Integer.parseInt(getSizeName(letter)) + getSizePrice(letter);
	}
	public String toString() {
		return getTypeName() + getTypePrice() + "(" + getSizeName() +")" + "is" + getTotalPrice("0") + "baht.";
	}
}

