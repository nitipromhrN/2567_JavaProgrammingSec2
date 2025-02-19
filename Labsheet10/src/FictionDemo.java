import java.util.*;
public class FictionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Book Title: ");
		String bookTitle = scan.nextLine();
		System.out.println("Book publish years: ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		System.out.println("Auther name: ");
		String autherName = scan.nextLine();
		System.out.println("Auther email: ");
		String autherEmail = scan.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle, publicYear);
		book1.setAutherName(autherName);
		book1.setEmail(autherEmail);
		while(!book1.checkEmail()) {
			System.out.println("Auther email, again: ");
			autherEmail = scan.nextLine();
			book1.setEmail(autherEmail);
		}
		
		Line();
		System.out.println(book1);
	}
	public static void Line() {
		for(int i=1; i<50; i++)
			System.out.print("*");
		System.out.println();
	}
}
