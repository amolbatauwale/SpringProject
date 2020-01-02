package com.ngpit.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//Load the Spring config files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring
		TrackCoach theCoach=context.getBean("myCoach",TrackCoach.class);
		//call method on the bean
		/* BaseballCoatch theCoach=new BaseballCoatch(); */
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortuneService());
		
		
		
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
	//close the connection
		context.close();

	}

}
