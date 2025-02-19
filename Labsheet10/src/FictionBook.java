public class FictionBook implements Auther,Book {
	private String auther_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAutherName(String name) {
		auther_name = name;
		int space = auther_name.indexOf(" ");
		fname = auther_name.substring(0,space);
		lname = auther_name.substring(space+1);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String getLastName() {
		return this.lname.toUpperCase();
	}
	@Override
	public String getFirstName() {
		return this.fname.toUpperCase();	
	}
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com"));
			return true;
		return false;
	}
	public String getTitle() {
		return this.title;
	}
	public int totalPublic() {
		return 2025 - this.publicYear;
	}
	public String toString() {
		return getTitle() +"write by " + getLastName().substring(0,1) + "." + getFirstName() + "(" + getEmail() + ")" + "\nPublished for " + totalPublicYear() + "years.";
	}
}
