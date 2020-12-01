package org.sbru.threads.syncexamples;

import java.util.concurrent.ThreadLocalRandom;

public class ExampleProducerConsumerFunctional {
	public static void main(String[] args) {
		Bakery b = new Bakery();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				b.bake("Bread nº: " + i);
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				b.consume();
			}
		}).start();
	}
}
