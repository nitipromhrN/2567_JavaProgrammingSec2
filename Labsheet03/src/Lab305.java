import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input some sentence : ");
        String input = sc.nextLine();
        if (input.endsWith(".")) {
            System.out.println("The sentence must end with full stop point : " + input);
            
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') {
                    
                    System.out.println();
                }else if (c != '.') {
                    System.out.print(c);
                }
            }
        }else {
            System.out.println("The sentence must end with full stop point : ");
        }
        sc.close();
    }
}

