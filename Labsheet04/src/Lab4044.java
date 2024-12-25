import java.util.*;
public class Lab4044 {
	
	public static void main(String[] args) {
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDVaild, isSubjectCodeValid;
		while (true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			
			while (studentID != null && subjectCode)
			isStudentIDVaild = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			
			if(isStudentIDVaild && isSubjectCodeValid) {
				
					break;
			}else {
				System.out.println("");
			}
		}
		
	}
	
	public static boolean isLength(String input,int len) {
		return input.length() == len;
	}
	
}