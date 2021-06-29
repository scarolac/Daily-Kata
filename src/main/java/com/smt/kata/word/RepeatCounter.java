package com.smt.kata.word;

// JDK 11.x
import java.util.HashMap;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: RepeatCounter.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
public class RepeatCounter {
	// Members
	private Map<Object, Integer> counter = new HashMap<>();
	
	/**
	 * Calculates how many duplicates for each object
	 * @param items Items to calculate
	 * @return Map with each object and it's count
	 */
	public Map<Object, Integer> calculate(Object[] items) {
		return counter;
	}
	
	/**
	 * Simple Bean to be used to test complex objects
	 */
	class MyBean {
		// Members
		private Object key;
		private Object value;
		
		// Constructor to make life simpler
		public MyBean() { super(); }
		public MyBean(Object key, Object value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		// Assign the getters and setters
		public Object getKey() { return key; }
		public Object getValue() { return value; }
		public void setKey(Object key) { this.key = key; }
		public void setValue(Object value) { this.value = value; }
	}
}
