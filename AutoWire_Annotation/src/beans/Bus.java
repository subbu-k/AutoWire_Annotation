package beans;

public class Bus {

	private Engine engine;
	

	public  Bus( ) {
		System.out.println("Default Bus Constructor...");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public  Bus(Engine engine) {
		System.out.println("parameter Bus Constructor ");
		this.engine=engine;
		
	}
	public void printData() {
		System.out.println("Bus Engine Model Year ="+engine.getModelYear());

	}
}
