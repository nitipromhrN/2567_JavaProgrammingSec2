import java.util.*;
public class TestStudent {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Input the number of student
		System.out.print("How many student in classroom: ");
		int numberofStudent = scan.nextInt();
		//Consume newline character
		scan.nextLine();
		
		//1.Create an array of student object
		//create an array of student object
		Student[] students = new Student[numberofStudent];
		
		//Input information for each student
		for(int i=0; i<numberofStudent; i++) {
			//2.Create a new Student object
			students[i] = new Student();
			System.out.print("\nINPUT INFORMATION OF STUDENT "+ (i+1));
			Line();
			//Input  student's name
			System.out.print("Input student nmae: ");
			//String stdName = scan.nextLine();
			//students[i].setName(stdName);
			students[i].setName(scan.nextLine());
			//Input student's score and validate
			while(true) {
				System.out.print("Input student score: ");
				int score = scan.nextInt();
				if(students[i].checkScore()) {
					System.out.print("Input score, again: ");
					break;
				}
				//Consume newline character
				scan.nextLine();
				students[i].setScore(score);
			}//end of for
			//display the list of student who passed
			System.out.println("\nLIST OF PASS STUDENT(>=50): ");
			Line();
			for(Student student : students) {
				if(student.isPass()) {
					System.out.println(">> "+student.getName() + "("+student.getScore()+")");
				}
			}
		}//end of for
		
		scan.close();
	}//end of main() Method
	
	public static void Line() {
		for(int i=1; i<60;i++) {
			System.out.print("-");
		}
		System.out.print("");
	}
	public String findGrade(int score) {
		if (score >=80) {
			System.out.print("get grade A");
		}else if(score>=75) {
			System.out.print("get grade B+");
		}else if(score>=70) {
			System.out.print("get grade B");
		}else if(score>=65) {
			System.out.print("get grade C+");
		}else if(score>=60) {
			System.out.print("get grade C");
		}else if(score>=55) {
			System.out.print("get grade D+");
		}else if(score>=50) {
			System.out.print("get grade D");
		}else (score>=0) {
			System.out.print("get grade F");
		}
		System.out.println("How many student in classroom: ");
	}
}
