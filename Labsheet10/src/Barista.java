public class Barista {
	private String name;
	private char gender;
	
	Barista(String naem, char gender) {
		this.name = name;
		this.gender = gender;
	}
	public Barista() {
		
	}
	public String getName() {
		return this.name;
	}
	public String getGenderName() {
		return this.gender;
	}
	public String getGenderName(String letter) {
		return "M".equals(letter) ? "Male" : ("F".equals(letter) ? "Female" : " ");  
	}
}
