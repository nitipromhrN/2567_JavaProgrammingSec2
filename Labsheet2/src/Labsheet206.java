import java.util.Scanner;
public class Labsheet206 {

    public static void main(String[] args) {
        final int VANILLA_PRICE = 10;
        final int CHOCOLATE_PRICE = 15;
        final int TOPPING_PRICE = 5;

        Scanner scanner = new Scanner(System.in);

        int flavorPrice = 0;
        while (true) {
            System.out.println("[1] Vanilla Flavor 10 B.");
            System.out.println("[2] Chocolate Flavor 15 B.");
            System.out.print("Press number to choose flavor: ");
            int choice = scanner.nextInt();

            flavorPrice = (choice == 1) ? VANILLA_PRICE : (choice == 2) ? CHOCOLATE_PRICE : 0;

            if (flavorPrice != 0) {
                break;
            } else {
                System.out.println("ERROR: Wrong choice! Try again.");
            }
        }
        System.out.print("Do you want topping? (Yes = 1 / No = 0): ");
        int addTopping = scanner.nextInt();

        int totalPrice = flavorPrice + ((addTopping == 1) ? TOPPING_PRICE : 0);
        String flavor = (flavorPrice == VANILLA_PRICE) ? "Vanilla" : "Chocolate";
        String topping = (addTopping == 1) ? "and with topping" : "and no topping";
        System.out.println("You choose " + flavor + " flavor " + topping + ".");
        System.out.println("Total price = " + totalPrice + " B.");

        scanner.close();
    }
}

