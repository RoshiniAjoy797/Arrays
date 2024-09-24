package com.built_In.CheckedException;

public class InterruptedException {
	/*
	 * a scenario where we have a thread that sleeps for a long time and we want to
	 * interrupt it.
	 */
	public static void main(String[] args) {

		Thread longSleepingThread = new Thread(() -> {
			System.out.println("Going to sleep for 10 sec...");
			try {
				Thread.sleep(10000); // sleep for 10 seconds..
				System.out.println("Woke up normally.....");
			} catch (java.lang.InterruptedException e) {
				System.err.println("I was rudely interrupted in 1 sec  while sleeping!");
				e.printStackTrace();
			}
		});
		longSleepingThread.start();

		// Main thread will sleep for 2 seconds and then interrupt the
		// longSleepingThread
		try {
			Thread.sleep(1000);
		} catch (java.lang.InterruptedException ignored) {
			ignored.printStackTrace();
		}
		
		longSleepingThread.interrupt();;
		
	}
}
