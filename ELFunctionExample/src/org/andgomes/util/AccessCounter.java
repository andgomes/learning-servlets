package org.andgomes.util;

public class AccessCounter {

	private static int accessCounter = 0;

	public static int accessCounter() {
		return ++accessCounter;
	}
	
}
