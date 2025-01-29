import java.util.*;
public class demoBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input auther name: ");
		String autherName = scan.nextLine();
		System.out.println("Input auther e-mail: ");
		String autherEmail = scan.nextLine();
		Auther auther = new Auther(autherName,autherEmail);
		System.out.println(auther); //Call toString method()
		System.out.println();
		System.out.println("Input book title: ");
		String bookTitle = scan.nextLine();
		System.out.print("Input book page: ");
		int bookPage = scan.nextInt();
		Book book = new Book(bookTitle,auther,bookPage);
		System.out.println(book);//Call toString() method
	}
}
