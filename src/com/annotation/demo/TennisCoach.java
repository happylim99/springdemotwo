package com.annotation.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach default constructor");
	}
	*/
	
	// define init method
	@PostConstruct
	public void doInitmethod() {
		System.out.println(">> this is doInitmethod");
	}
	
	// define destroy method
	// the code will be executed before bean is destroyed
	@PreDestroy
	public void doDestroyMethod() {
		System.out.println(">> this is doDestroyMethod");
	}
	
	/*
	@Autowired
	public void doSomething(FortuneService fortuneService) {
		System.out.println("do something");
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {

		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
