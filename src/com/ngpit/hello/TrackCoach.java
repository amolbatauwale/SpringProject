package com.ngpit.hello;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	private String email,team;
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	/*
	 * public TrackCoach(FortuneService fortuneService) {
	 * 
	 * this.fortuneService = fortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "Run Daily 5km";

	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "just do it"+fortuneService.getFortune();
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
