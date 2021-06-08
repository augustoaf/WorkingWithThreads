package com.myapp.jobs;

public class CounterJob implements Runnable {

	@Override
	public void run() {
		
		Storage storage = Storage.getInstance();		
		Integer storedCounter = storage.getCounter();
		Integer addedTimes = 0;
		
		while (storedCounter < 1000) {
						
			boolean added = storage.add(1);
			if (added) 
				addedTimes++;
			
			storedCounter = storage.getCounter();		
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() + " added " + addedTimes + " times");
	}

}
