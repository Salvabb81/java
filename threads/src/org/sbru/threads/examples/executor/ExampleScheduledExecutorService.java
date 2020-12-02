package org.sbru.threads.examples.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExampleScheduledExecutorService {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

		System.out.println("Some task in the main ...");

		executor.schedule(() -> {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello world task ...");

		}, 2000, TimeUnit.MILLISECONDS);

		System.out.println("Some other taks in the main ...");
		executor.shutdown();
	}

}
