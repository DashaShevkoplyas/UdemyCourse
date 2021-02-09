package com.luv2code.springdemo.sportsimpl;

import com.luv2code.springdemo.interfaces.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km";
	}

}
