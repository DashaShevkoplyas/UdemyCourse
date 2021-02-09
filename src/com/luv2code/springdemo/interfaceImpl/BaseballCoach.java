package com.luv2code.springdemo.sportsimpl;

import com.luv2code.springdemo.interfaces.Coach;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
