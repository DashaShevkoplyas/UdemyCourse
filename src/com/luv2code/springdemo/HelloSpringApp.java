package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file (creating the Spring Container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println("From Spring: " + theCoach.getDailyWorkout());

		// call another on the bean
		System.out.println("From Spring: " + theCoach.getDailyFortune());

		// close context
		context.close();
	}

}
