import java.util.*;
public class Lab404 {
	
	public static void main(String[] args) {
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDVaild, isSubjectCodeValid;
		while (true) {
			//input student ID
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			//input subject code
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			
			//check lengths of student ID and subject code
			while (studentID != null && subjectCode)
			isStudentIDVaild = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			
			if(isStudentIDVaild && isSubjectCodeValid) {
				//boolean isITStudent = isITStudent(studentID);
				//boolean isITSubject = isITSubject(subjectCode);
				
				//displayData(isITStudent,isITSubject);
					break;
			}else {
				System.out.println("");
			}
		}//end while()
		
	}//end of inputStudent() Method
	
	public static boolean isLength(String input,int len) {
		return input.length() == len;
	}
	
}