package com.ngpit.hello;

public class BaseballCoach implements Coach {
	FortuneService fortuneservice;

	@Override
	public String getDailyWorkout() {

		return "get daily 30 min practice";

	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

	public BaseballCoach(FortuneService fortuneservice) {

		this.fortuneservice = fortuneservice;
	}

}
