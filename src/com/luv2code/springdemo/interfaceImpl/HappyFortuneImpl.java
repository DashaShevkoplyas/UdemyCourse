package com.luv2code.springdemo.interfaceImpl;

import com.luv2code.springdemo.interfaces.FortuneService;

public class HappyFortuneImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "You have got a happy fortune";
	}

}
