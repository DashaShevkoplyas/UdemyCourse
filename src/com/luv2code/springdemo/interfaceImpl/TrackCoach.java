package com.luv2code.springdemo.interfaceImpl;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "And Today... " + fortuneService.getFortune();
	}

}
