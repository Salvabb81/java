package org.sbru.threads.examples;

public class ExampleInterfaceRunnableFunctional {
	public static void main(String[] args) throws InterruptedException {
		
		Thread mainThread = Thread.currentThread();
		Runnable trip = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " - " + Thread.currentThread().getName());
				try {
					Thread.sleep((long) (Math.random() * 1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("At the end I am going to: " + Thread.currentThread().getName());
			System.out.println(mainThread.getState());
		};

		Thread v1 = new Thread(trip, "London");
		Thread v2 = new Thread(trip, "New York");
		Thread v3 = new Thread(trip, "Beijing");
		Thread v4 = new Thread(trip, "Sidney");
		
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		
		v1.join();
		v2.join();
		v3.join();
		v4.join();
		
//		Thread.sleep(10000);
		System.out.println("we keep executing the main method: " + mainThread.getName());
	}
}
