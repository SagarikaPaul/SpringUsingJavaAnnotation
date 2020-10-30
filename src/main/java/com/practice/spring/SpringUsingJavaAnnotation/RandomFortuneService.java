package com.practice.spring.SpringUsingJavaAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//Creating string of arrays
	private String[] data = {
			"Be aware of your wife",
			"Dont mess with your wife",
			"Always listen to your wife",
			"Your wife is right"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	

	public String getFotune() {
		int index = myRandom.nextInt(data.length);
		String theFortune  = data[index];
		return theFortune;
	}

}
