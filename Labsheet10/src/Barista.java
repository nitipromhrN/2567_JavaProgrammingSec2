public class Barista {
	private String name;
	private char gender;
	
	Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	public Barista() {
		
	}
	public String getName() {
		return this.name;
	}
	public char getGenderName() {
		return this.gender;
	}
	public String getGenderName(String letter) {
		return "M".equals(letter) ? "Male" : ("F".equals(letter) ? "Female" : " ");  
	}
}
