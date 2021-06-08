package com.myapp;

import com.myapp.jobs.CounterJob;

public class ThreadsApp {

	public static void main(String[] args) {

		CounterJob counter = new CounterJob();
		
		//multiple threads adding values (until reach 1000) in the same place (Storage instance)
		//Note: if take off the "synchronized" from the Storage methods, this App will face issues due the Threads concurrence to call the methods 
		
		Thread counterT1 = new Thread(counter);
		counterT1.setName("counterT1");
		counterT1.start();
		
		Thread counterT2 = new Thread(counter);
		counterT2.setName("counterT2");
		counterT2.start();
		
		Thread counterT3 = new Thread(counter);
		counterT3.setName("counterT3");
		counterT3.start();
		
	}

}
