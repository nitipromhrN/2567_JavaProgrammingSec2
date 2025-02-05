public class Movie {
	private String id;
	private String name;
	private Director director;
	
	Movie(String id,String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	Movie() {
		
	}
	public String getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Director getdirector() {
		return this.director;
	}
	public void setDirector(Director director) {
		
	}
}
