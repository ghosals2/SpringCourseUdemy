package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from container
		Coach thecoach=context.getBean("tennisCoach", Coach.class);
		
		Coach alphacoach=context.getBean("tennisCoach", Coach.class);
		
		boolean result=(thecoach==alphacoach);
		
		System.out.println("pointing to same object :"+result);
		
		System.out.println("memory location for thecoach" +thecoach);
		System.out.println("memory location for alphacoach"+ alphacoach);
		
		context.close();

	}

}
