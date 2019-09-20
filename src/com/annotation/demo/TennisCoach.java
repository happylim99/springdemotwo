package com.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach default constructor");
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
