import javax.swing.JOptionPane;
public class CoffeeshopDemo {
class Varista {
    private String name;
    private String gender;

    public Varista(String name, String gender) {
        this.name = name;
        this.gender = gender;
        
    }
    public String toString() {
        return "Barista: " + name + " (" + gender + ")";
    }
}
class Koffee {
    private String drinkType;
    private String coffeeType;
    private String size;
    private int price;

    public Koffee(String drinkType, String coffeeType, String size) {
        this.drinkType = drinkType;
        this.coffeeType = coffeeType;
        this.size = size;
        this.price = calculatePrice();
    }
    private int calculatePrice() {
    	
        int basePrice = 100;
        if ("Americano".equalsIgnoreCase(coffeeType)) basePrice = 120;
        else if ("Espresso".equalsIgnoreCase(coffeeType)) basePrice = 150;
        else if ("Cappuccino".equalsIgnoreCase(coffeeType)) basePrice = 170;

        int sizePrice = 0;
        if ("T".equalsIgnoreCase(size)) sizePrice = 50;
        else if ("G".equalsIgnoreCase(size)) sizePrice = 100;
        else if ("V".equalsIgnoreCase(size)) sizePrice = 150;
        return basePrice + sizePrice;
    }
    public String toString() {
        return drinkType + " " + coffeeType + " (" + size + ") is " + price + " baht.";
    }
}

    public static void main(String[] args) {
        String drinkType = JOptionPane.showInputDialog("Drink type (Hot/Cold):");
        String coffeeType = JOptionPane.showInputDialog("Coffee type (1: Americano, 2: Espresso, 3: Cappuccino):");
        String size = JOptionPane.showInputDialog("Coffee size (S: Short, T: Tall, G: Grande, V: Venti):");
        String baristaNumber = JOptionPane.showInputDialog("Barista number (1: Leon, 2: Claire):");
        if ("1".equals(coffeeType)) coffeeType = "Americano";
        else if ("2".equals(coffeeType)) coffeeType = "Americano";
        else if ("2".equals(coffeeType)) coffeeType = "Espresso";
        else if ("3".equals(coffeeType)) coffeeType = "Cappuccino";

        Coffee order = new Koffee(drinkType, coffeeType, size);
        Barista barista;
        if ("1".equals(baristaNumber)) {
            barista = new Varista("Leon", "Male");
        } else {
            barista = new Varista("Claie", "Female");
        }
        JOptionPane.showMessageDialog(null, order.toString() + "\n" + barista.toString());
    }
}