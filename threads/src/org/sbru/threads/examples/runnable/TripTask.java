package org.sbru.threads.examples.runnable;

public class TripTask implements Runnable {

	private String name;
	
	
	
	public TripTask(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " - " + name);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("At the end I am going to: " + name);
	}

}
