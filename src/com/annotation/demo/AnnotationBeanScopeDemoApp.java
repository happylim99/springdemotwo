package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object:" + result);
		
		System.out.println("\nMemory for theCoach:" + theCoach);
		
		System.out.println("\nMemory for theCoach:" + alphaCoach);
		
		// close the context
		context.close();
	}

}
