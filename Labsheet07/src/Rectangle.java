public class Rectangle {
	//Private to attribute
	private float length;
	private float weidth;
	
	//default Constructor
	/*Rectangle() {
		length = 1.0f;
		weidth = 1.0f;
	} */

	//private to attribute
	private float lngth=1.0f;
	private float width=1.0f;
	
	//Default Constructor
	Rectangle () {}
		
	//Perimeterize Constructor
	Rectangle (float length,float width) {
		this.length = length;
	}
	//Getter and Setter method
	public float getLength() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return this.width;
	}
	public void setWidth(float width) {
		this.weidth = width;
	}
	//Method to calculate area
	public double getArea() {
		return this.length * this.width;
	}
	//Method to calculate perimether
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	//Method to display
	public String showData() {
		return "Rectangle[length= " + this.length + ",width = " + this.width + "]";
	}
	//Method to display using toString
}
