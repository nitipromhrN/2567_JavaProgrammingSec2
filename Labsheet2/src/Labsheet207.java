import java.util.Scanner;

public class Labsheet207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        int income = scanner.nextInt();

        double taxPayable = 0.0;

        if (income > 40000) {
            taxPayable += (income - 40000) * 0.30;
            income = 40000;
        }
        if (income > 20000) {
            taxPayable += (income - 20000) * 0.20;
            income = 20000;
        }
        if (income > 0) {
            taxPayable += income * 0.10;
        }

        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}
