package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String emailid;
	@Value("${foo.team}")
	private String team;


	private FortuneService fortuneservice;
	public SwimCoach(FortuneService thefortuneservice) {
		// TODO Auto-generated constructor stub
		fortuneservice=thefortuneservice;
	}
	

	public String getEmailid() {
		return emailid;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim 1000 metre as warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
