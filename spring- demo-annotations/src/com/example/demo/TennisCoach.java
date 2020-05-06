package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	//Field Injection
	@Autowired
	@Qualifier("randomFortuneService")// will create specific bean id for multiple bean creation problem 
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println("inside tennis coach");
	}
	// define init method
	@PostConstruct
	public void doMystartupstuff() {
		System.out.println("inside method domystartupstuff");
	}
	// define destroy method
	@PreDestroy	
	public void doMycleanupstuff() {
			System.out.println("inside method domycleanupstuff");
		}
	
	//constructor injection
	/*@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
*/
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice backhand";
	}
	//Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("inside setter method");
		fortuneService=thefortuneService;
	}*/
	//Method Injection
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
		System.out.println("inside dosomecrazystuff method");
		fortuneService=thefortuneService;
	}
*/
	@Override
	public String getDailyFortune() {
		// 
		return fortuneService.getFortune();
	}

}
