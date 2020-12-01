package org.sbru.threads.examplestimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleTimerPeriodTask {

	public static void main(String[] args) {

		AtomicInteger atomicCount = new AtomicInteger(3);
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				int i = atomicCount.getAndDecrement();
				if (i > 0) {
					System.out.println("Periodic task " + i + "  at: " + new Date() + " thread name: "
							+ Thread.currentThread().getName());
				} else {
					System.out.println("Task end");
					timer.cancel();
				}
			}
		}, 5000, 10000);
		System.out.println("We schedule an immediate task that repeats itself each 10 seconds...");
	}

}
