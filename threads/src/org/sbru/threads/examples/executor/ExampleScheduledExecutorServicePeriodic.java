package org.sbru.threads.examples.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleScheduledExecutorServicePeriodic {

	public static void main(String[] args) throws InterruptedException {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

		System.out.println("Some task in the main ...");

		AtomicInteger count = new AtomicInteger(5);
//		CountDownLatch lock = new CountDownLatch(5);

		Future<?> future = executor.scheduleAtFixedRate(() -> {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
//				lock.countDown();
				count.getAndDecrement();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello world task ...");

		}, 1000, 2000, TimeUnit.MILLISECONDS);

//		lock.await();
//		future.cancel(true);
//		TimeUnit.SECONDS.sleep(10);

		while (count.get() >= 0) {
			if (count.get() == 0) {
				future.cancel(true);
				count.getAndDecrement();
			}
		}

		System.out.println("Some other taks in the main ...");
		executor.shutdown();
	}

}
