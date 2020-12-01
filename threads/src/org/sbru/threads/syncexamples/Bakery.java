package org.sbru.threads.syncexamples;

public class Bakery {
	
	private String bread;
	private boolean available;
	
	public synchronized void bake(String dough) {
		
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.bread = dough;
		System.out.println("Baker bakes: " + this.bread);
		this.available = true;
		notify();
	}
	
	public synchronized String consume() {
		while(!available) {
			while(!available) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Customer consumes: " + this.bread);
		this.available = false;
		notify();
		
		return bread;
	}

}
