package com.smt.kata.data;

// JDK 11.x
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: QueryStringParser.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Using the standard parsing of Query String rules, convert 
 * the query string elements into a Map of values.  All rules of query string 
 * will be implemented.  You may use collections and anything else not requiring
 * an import
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class QueryStringParser {

	/**
	 * Separates the KV and stores into a String, String[]
	 * @param qs
	 * @return
	 */
	public Map<String, List<String>> parseString(String qs){
		Map<String, List<String>> mapping = new HashMap<>();
		mapping.put(qs,  null);
		return new HashMap<>();
	}
}
