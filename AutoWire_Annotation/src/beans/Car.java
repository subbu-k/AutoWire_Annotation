package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car{
	@Qualifier(value="e2")
	@Autowired
	private Engine engine;
	 	
	public void printData(){
	System.out.println("EngineModelYear:"+engine.getModelYear());
	}

	
}

