import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee{
	private String name;
	private String dept;

	public void insert() throws IOException {
		//ประกาศ object input เพื่อรับข้อมูลทาง Keyboard
		Scanner input = new Scanner(System.in);
		//ประกาศ object input เพื่อรับข้อมูลทาง WritFile เพื่อบันทึกข้อมูลทางไฟล์โดยใช้คลาส PrintStream
		PrintWriter WriteFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt"));
		String answer;
		do {
			super.header();
			//รับข้อมูลชื่อกับแผนกทาง Keyboard
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			//บันทึกข้อมูลชื่อกับแผนกลงไปในไฟล์ที่กำหนดไว้
			WriteFile.println(name + "\t"+dept);
			System.out.print("Do you want to input data again?: ");
			answer = input.next();
			
		}while(answer.equals("y"));
	}//end of insert
	public void searchData() throws IOException {
		try {
			//ใช้ Class Scanner สำหรับอ่านไฟล์
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i=0;
			boolean check = false;
			super.header();
			
			while(readFile.hasNext()) {
			name = readFile.next();
			dept = readFile.next(); //ตัวแปร dept ในไฟล์ employee
					
			if(dept.equalsIgnoreCase(super.getDept())) {
				i++;
				System.out.println(i+")" + name);
				check = true;
			}
			if(check) {
				super.header();
				System.out.print("Employee in dept "+ super.getDept() + " is " + i +"person(s).");
				System.out.println("");
				super.header();
				}
			else {
				System.out.print("\nSorry, no dept : "+ super.getDept() + "in file,");
				}
			}
		}catch(IOException e) {
			System.out.println("\nSorry, File not found...");
		}
	}//end searchData
}
