package test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client{
	 
	  public static void main(String[] args){
		  
	//AutowiredAnnotationBeanPostProcessor
ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring.xml");

Car c=(Car)ap.getBean("c");
System.out.println("------");
c.printData();


/*
  Bus b=(Bus)ap.getBean("b");
	b.printData();
*/

	  }
}	