package org.sbru.threads.examples;

import org.sbru.threads.examples.runnable.PrintSentences;

public class ExampleThreadSync {
	public static void main(String[] args) throws InterruptedException {
		new Thread(new PrintSentences("Hi!", " How are you?")).start();;
		new Thread(new PrintSentences("Who", " are you?")).start();
		Thread.sleep(100);
		Thread t3 = new Thread(new PrintSentences("Thank you", " very much."));
		t3.start();
		Thread.sleep(100);
		System.out.println(t3.getState());
	}

	public synchronized static void printSentences(String sentence1, String sentence2) {
		System.out.print(sentence1);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(sentence2);
	}
}
