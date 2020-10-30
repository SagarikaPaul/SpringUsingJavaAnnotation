package com.practice.spring.SpringUsingJavaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanDemoApp {

	public static void main(String[] args) {
	    String newLine = System.getProperty("line.separator");


		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theAlpha = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are same
		boolean result =(theCoach == theAlpha);
		
		//print out the results
		System.out.print("\n pointing the same result " + result + newLine);
		System.out.println("pointing the same address location" + theCoach + newLine);
		System.out.println("pointing the same address location" + theAlpha + newLine);
		
		//close the context
		context.close();
		
	}

}
