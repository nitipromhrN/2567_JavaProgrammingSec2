import java.util.*;
import java.io.*;
public class Lab1101 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
	}//end of main()
	public static void printHeader(int sec) {
		System.out.println("**************************************************************");
		System.out.println("\t\tLit of Data for Section " + sec);
		System.out.println("**************************************************************");
	}//end of printHeader()
	
	public static void displayStudentList(int section) throws IOException {
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp="";
			while((temp = readFile.readLine()) !=null) {
				String[] data = temp.split("\t");
				
				if(data.length < 6) continue; //Ensure Valid data format
				int studentSection = Integer.parseInt(data[3]); //แปลงกลุ่มเรียนในไฟล์ให้เป็น int
				
				
				if(studentSection==section) {
					double Midterm = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					System.out.printf("%s %s\t%.2f\t%.2f \t%s%n",data[0],data[2],Midterm,finalScore,determineResult(Midterm,finalScore));	
				}
			}//end of while
			
		}//end try
	}//end displayStudentList()
	public static String determineResult(double Mid, double Fin) {
		return (Mid+Fin) <=40?"Fail" : "Pass";
	}
}
