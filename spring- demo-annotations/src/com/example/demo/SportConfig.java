package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example.demo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	//define Bean for SadFortuneService. method name will be bean id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
		}
	//define Bean for SwimCoach and add Dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	

}
