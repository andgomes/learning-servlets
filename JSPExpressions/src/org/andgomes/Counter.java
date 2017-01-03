package org.andgomes;

public class Counter {
	
	private static int counter = 0;	
	
	public static int getCounter() {
		return ++counter;
	}

}
