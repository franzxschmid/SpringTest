package de.franz.spring;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");  
		context.registerShutdownHook();
		Shape shape = (Circle)context.getBean("circle");
		System.out.println(shape);

	}

}
