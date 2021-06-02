package com.smt.kata.code;

import com.siliconmtn.data.text.StringUtil;

/****************************************************************************
 * <b>Title</b>: DashatizeIt.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description: </b> Dashatize It
 * 
 * Given a variable n,
 * 
 * If n is an integer, Return a string with dash'-'marks before and after each
 * odd integer, but do not begin or end the string with a dash mark. If n is
 * negative, then the negative sign should be removed.
 * 
 * If n is not an integer, return an empty value.
 * 
 * Ex:
 * dashatize(274) -> '2-7-4' 
 * dashatize(6815) -> '68-1-5'
 * 
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class DashatizeIt {

	/**
	 * Formats the string of numbers into a Dashatize format
	 * @param input String to be processed.  All non numeric characters are omitted
	 * @return Formatted string.  Empty string if input is empty or null
	 */
    public String process(String input) {
    	var result = new StringBuilder();
    	if (StringUtil.isEmpty(input)) return result.toString();
    	
    	for (var letter : input.toCharArray()) {
    		if (Character.isDigit(letter)) {
    			if (Integer.valueOf(letter) % 2 == 0)
    				result.append(letter);
    			else
    				result.append("-").append(letter).append("-");
    		}
    	}
    	if (result.length() == 0) return result.toString();
    	
    	var resultStr = result.toString().replace("--","-");
    	if (resultStr.charAt(0) == '-')
    		resultStr = resultStr.substring(1);
    	if (resultStr.charAt(resultStr.length() - 1) == '-')
    		resultStr = resultStr.substring(0, resultStr.length() - 1);
    	return resultStr;
    }
}
