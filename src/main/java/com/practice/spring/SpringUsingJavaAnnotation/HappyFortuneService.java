package com.practice.spring.SpringUsingJavaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFotune() {
		return "today is your lucky day";
	}
	
}
