package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach thecoach=context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(thecoach.getDailyWorkOut());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getEmailid());
		System.out.println(thecoach.getTeam());
		context.close();
	}

}
