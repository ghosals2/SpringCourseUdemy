package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		Coach thecoach=context.getBean("tennisCoach", Coach.class);
		
		System.out.println(thecoach.getDailyWorkOut());
		System.out.println(thecoach.getDailyFortune());
		context.close();
	}

}
