package com.myapp.jobs;

public class Storage {

	private static Storage storage = null;
	private Integer counter = null;

	//singleton pattern
	public synchronized static Storage getInstance() {
		
		if (storage == null) {
			storage = new Storage();
			storage.setCounter(0);
		}
		return storage;
	}

	public synchronized Integer getCounter() {
		return counter;
	}

	private void setCounter(Integer counter) {
		this.counter = counter;
	}
	
	public synchronized boolean add(Integer num) {
		if (this.getCounter() < 1000) {//this is because sometimes both threads are inside the while loop and the counter value is already updated to 1000 for one of the threads before the other thread calls the add method  
			this.setCounter(this.getCounter() + num);
			return true;
		}	
		return false;
	}	
	
}
