package com.annotation.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"random data 1",
			"random data 2",
			"random data 3"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
