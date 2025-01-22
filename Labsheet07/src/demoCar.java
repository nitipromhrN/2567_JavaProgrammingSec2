public class demoCar {
	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		
		System.out.println(car);
		System.out.println("Update Car Detail:");
		
		car setCompanyName("Toyota");
		System.out.println("Company Name: "+setCompanyName);
		
		System.out.println("Model Name: ");
		System.out.println("Year: ");
	}
}
