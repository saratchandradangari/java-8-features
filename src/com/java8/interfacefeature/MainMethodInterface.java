package com.java8.interfacefeature;

import java.time.Clock;
import java.time.LocalTime;
import java.util.logging.Logger;

public interface MainMethodInterface {
	Logger log = Logger.getLogger(MainMethodInterface.class.getName());
	public static void greet() {
		Clock ck = Clock.systemDefaultZone();
		LocalTime loclaTime = LocalTime.now(ck);
		if (loclaTime.getHour() <= 12) {
			System.out.println("Good Morning Dear, Have a Learnful day !");
		} else {
			System.out.println("Good Evening Dear,Hurry up and learn somenew new for the day !");
		}
	}

	public static void main(String[] args) {
		greet();
		log.info("I am in main method from info logger .. ");
		System.out.println("I am main from Interface... ");
	}
}
