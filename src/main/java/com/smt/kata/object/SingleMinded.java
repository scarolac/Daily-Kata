package com.smt.kata.object;

import java.util.HashMap;
// JDK 11.x
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: SingleMinded.java <b>Project</b>: SMT-Kata 
 * <b>Description: </b>Kata challenge. 
 * "The singleton pattern is a design pattern that restricts the
 * instantiation of a class to one object. This is useful when exactly one
 * object is needed to coordinate actions across the system." - Wikipedia:
 * Singleton Pattern Create a Singleton class that keeps a collection of
 * configuration items (key and value) that can be shared across many classes.
 * The collection will have an add, remove and get method to manage the
 * collection.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 7, 2021
 * @updates:
 ****************************************************************************/
public class SingleMinded {

	private Map<String, String> collection;
	private static SingleMinded instance;

	/**
	 * Returns a single instance of the single minded class
	 * 
	 * @return Instance of this class
	 */
	public static SingleMinded getInstance() {
		if (instance == null)
			instance = new SingleMinded();
		return instance;
	}

	private SingleMinded() {
		collection = new HashMap<>();
	}

	/**
	 * Adds an item to the configuration map. If a key already exists, the value
	 * will be updated with the new value
	 * 
	 * @param key   Item key by which it is referenced
	 * @param value Value to store for the specified key
	 */
	public void addConfigItem(String key, String value) {
		collection.put(key, value);
	}

	/**
	 * Removes an item from the configuration map
	 * 
	 * @param key Map key of the item to remove
	 */
	public void removeConfigItem(String key) {
		collection.remove(key);
	}

	/**
	 * Collection of configuration items to retrieve
	 * 
	 * @return config collection
	 */
	public Map<String, String> getConfig() {
		return collection;
	}

	/**
	 * Retrieves a configuration item
	 * 
	 * @param key Key to search against the config collection
	 * @return Value corresponding to the provided key. Null otherwise
	 */
	public String getConfigItem(String key) {
		return collection.get(key);
	}
}
