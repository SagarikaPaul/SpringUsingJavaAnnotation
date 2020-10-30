package com.practice.spring.SpringUsingJavaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theSillyCoach")
@Component
@Scope("prototype")

public class TennisCoach implements Coach {
	
    String newLine = System.getProperty("line.separator");

    @Autowired
    //@Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    
	//define a private field for dependency
	private FortuneService fortuneService1;
	
	//default constructor
	public TennisCoach(){
		System.out.print("TENNIS COACH-----Default constructor"+ newLine);
	}
	
	//AUTOWIRED USING CONSTRUCOR INJECTION
    //	@Autowired
    //	public TennisCoach(FortuneService theFortuneService) {
	//		System.out.print("TENNIS COACH----inside the constructor injection" + newLine);
    //		fortuneService1 = theFortuneService; 
    //	}
	
	//AUTOWIRED USING SETTER INJECTION
	//@Autowired
	//public void setFortuneService(FortuneService theFortuneService) {
	//	System.out.print("TENNIS COACH----inside the setter injection" + newLine);
	//	fortuneService1 = theFortuneService;
	//}

	//AUTOWIRED USING METHOD INJECTION
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.print("TENNIS COACH----inside the medthod injection" + newLine);
//		fortuneService1 = theFortuneService;
//	}
	
	
	
	
	public String getDailyWorkout() {
		return "practice back hand shot";
	}

	public String getDailyFortune() {
		return fortuneService1.getFotune();
	}
}
