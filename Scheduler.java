package com.poc.dao.impl;

import java.util.Timer;

public class Scheduler {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 1000); // Create Repetitively task for every 1 secs
		//System.exit(0);
	}

}
