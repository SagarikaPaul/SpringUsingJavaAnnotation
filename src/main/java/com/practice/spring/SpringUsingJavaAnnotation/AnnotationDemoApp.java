package com.practice.spring.SpringUsingJavaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
    public static void main( String[] args ) {
	    String newLine = System.getProperty("line.separator");

    	
    	//Read the spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
    	//get the spring from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

    	//call a method on the bean
		System.out.println(theCoach.getDailyWorkout() + newLine);
		System.out.println(theCoach.getDailyFortune() + newLine);

    	//close the context
    	context.close();
    	
    }
    
}
