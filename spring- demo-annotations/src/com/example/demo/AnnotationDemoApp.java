package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach=context.getBean("tennisCoach", Coach.class);
		
		System.out.println(thecoach.getDailyWorkOut());
		System.out.println(thecoach.getDailyFortune());
		context.close();
	}

}
