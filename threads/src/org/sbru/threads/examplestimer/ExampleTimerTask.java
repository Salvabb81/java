package org.sbru.threads.examplestimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExampleTimerTask {
	
	public static void main(String[] args) {
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task done at: " + new Date() + " thread name: " + Thread.currentThread().getName());
				System.out.println("Task end");
				timer.cancel();
			}
		}, 5000);
		System.out.println("We schedule a task for 5 seconds more...");
	}
	
}
