import java.util.Scanner;

public class Lab307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String text = sc.nextLine();
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        
        if (isPalindrome(cleanText)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

