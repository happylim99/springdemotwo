package com.annotation.demo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component

public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Practice backhand";
	}

}
