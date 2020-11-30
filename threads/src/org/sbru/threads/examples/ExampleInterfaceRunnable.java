package org.sbru.threads.examples;

import org.sbru.threads.examples.runnable.TripTask;

public class ExampleInterfaceRunnable {
	public static void main(String[] args) {
		new Thread(new TripTask("London")).start();
		new Thread(new TripTask("New York")).start();
		new Thread(new TripTask("Beijing")).start();
		new Thread(new TripTask("Sidney")).start();
	}
}
