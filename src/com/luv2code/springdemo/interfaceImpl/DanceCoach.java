package com.luv2code.springdemo.interfaceImpl;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class DanceCoach implements Coach {

	private FortuneService fortuneService;;

	public DanceCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Repeat new dance move fo 1h per day";
	}

	@Override
	public String getDailyFortune() {
		return "What you got: " + fortuneService.getFortune();
	}

}
