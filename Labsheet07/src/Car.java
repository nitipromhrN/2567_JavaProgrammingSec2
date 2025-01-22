public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Default Constructor
	Car() {
		companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;
		//this("Unknow","Unknow",2000,0.0);
	}
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีที่ผลิต 2000 หากด่าที่ใส่ป้อนไม่ถูก
		this.year = year <1886? 2000:year;
		this.mileage = mileage;
	}
	//Getter and Setter method()
	public void setCompanyName(String companyName) {
		if (companyName != null && !companyName.trim().isEmpty()) {
		this.companyName = companyName;
	}else {
		System.out.println("Error: Invalid company name");
		}
	}
	public void setmodelName(String modeName) {
		if (modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
	}else {
		System.out.println("Error: Invalid model name");
		}
	}
	public void setyear(int year ) {
		if	(year <= 1886) {
			this.year = year;
		}else
			System.out.println("Error: Invalid year"); 
	}
	public double setmileage() {
		return mileage;
	}
	public String toString() {
		return ("Company Name: "+ companyName +"\nModel Name: "+ modelName +"\nYear: "+ year + "\nMileage: "+ setmileage());
	}
}