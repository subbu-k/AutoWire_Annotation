package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car{
	@Autowired
	@Qualifier(value="engine")
	private Engine engine;
	 
	
	public void printData(){
	System.out.println("EngineModelYear:"+engine.getModelYear());
	}

	
}

