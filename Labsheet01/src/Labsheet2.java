import java.util.Scanner;

public class Labsheet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remeningMinutes = minutes % minutesInYear;
        long days = remeningMinutes / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}

