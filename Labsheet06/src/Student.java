public class Student {
	//private two attribute
	private String name;
	private double[] scores;
	
	//Method to set student details
	public void setStudentDetails(String stdName,double[] stdScore) {
		name = stdName;
		scores = stdScore;
	}
	//Method to calculate average score
	public double calculateAverageScore() {
		double total = 0;
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		return total/scores.length; //return average of scores
	}
	//Method to get grade based on average score
	public String getGrade() {
		double average = calculateAverageScore();
		if(average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		}else if (average >= 70) {
			return "C";
		}else if (average >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
	//Method to display student details
	public void displayStudntDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Scores: ");
		for (int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+" ");
		}
		System.out.println("Average Score: " +calculateAverageScore());
		
	}
}
