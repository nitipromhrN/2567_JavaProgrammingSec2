import javax.swing.*;
public class Lab402 {
    public static void main(String[] args) {
        int year = 2020;
        if (checkYear(year)) {
            if (isLeapYear(year)) {
                System.out.println(year + " is Leap year. (Leap Year)");
            } else {
                System.out.println(year + " is NOT Leap year.");
            }
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
         return false;
    }
    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}
