package beans;
public class Engine{
	private String modelYear;
	//generategetters and setters

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		System.out.println("Engine Setter method");
		this.modelYear = modelYear;
	}
	
}