package org.sbru.threads.syncexamples;

import org.sbru.threads.syncexamples.runnable.Baker;
import org.sbru.threads.syncexamples.runnable.Consumer;

public class ExampleProducerConsumer {
	public static void main(String[] args) {
		Bakery b = new Bakery();
		new Thread(new Baker(b)).start();
		new Thread(new Consumer(b)).start();
	}
}
