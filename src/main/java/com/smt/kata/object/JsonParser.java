package com.smt.kata.object;

// JDK 11.x
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: JsonParser.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Json Parser
 * Write a function to flatten a nested dictionary. Namespace the keys with a period.
 * 
 * For example, given the following dictionary:
 * 
 * {
 *     "key": 3,
 *     "foo": {
 *         "a": 5,
 *         "bar": {
 *             "baz": 8
 *         }
 *     }
 * }
 * 
 * it should become:
 * 
 * {
 *     "key": 3,
 *     "foo.a": 5,
 *     "foo.bar.baz": 8
 * }
 * 
 * You can assume keys do not contain dots in them, i.e. no clobbering will occur.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 19, 2021
 * @updates:
 ****************************************************************************/
public class JsonParser {

	/**
	 * Parses the json string and returns a map of unique keys and values
	 * @param json Json object to parse
	 * @return Map of keys and values.  Values are mapped to their data types
	 * @throws IOException 
	 */
	public Map<String, Object> parse(String json) throws IOException {
		Map<String, Object> data = new HashMap<>();

		return data;
	}
}
