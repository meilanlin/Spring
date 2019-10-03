package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the boject
		System.out.println(theCoach.getDailyWOrkout());
	}

}
