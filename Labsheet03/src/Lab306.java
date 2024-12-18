import java.util.Scanner;

public class Lab306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message : ");
        String message = sc.nextLine();
        String lowerCaseMessage = message.toLowerCase();
        
        if (lowerCaseMessage.indexOf("nichi") >= 0) {
            System.out.println("Message : " + message);
        }else {
            System.out.println("Nichi is a sentence");
        }
        sc.close();
    }
}

