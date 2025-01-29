public class demoCar {
	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		
		System.out.println(car);
		System.out.println("Update Car Detail:");
		
		car.setCompanyName("Toyota");
		car.setmodelName("Corlla");
		car.setyear(2015);
		System.out.println("Update CAr Details:");
		System.out.println(car);
			car.setyear(1800);
			car.setCompanyName("");
	}
}
