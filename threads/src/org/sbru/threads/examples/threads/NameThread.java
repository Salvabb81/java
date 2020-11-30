package org.sbru.threads.examples.threads;

public class NameThread extends Thread {

	public NameThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("the method run() from the thread " + getName() + " is initialized.");

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName());
		}

		System.out.println("the thread ends");
	}

}
