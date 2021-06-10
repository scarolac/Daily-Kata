package com.smt.kata.word;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.siliconmtn.data.format.NumberUtil;
import com.siliconmtn.data.text.StringUtil;

/****************************************************************************
 * <b>Title</b>: OrderPlease.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Order Please Kata
 * 
 * Your task is to sort a given string. Each word in the string will contain a 
 * single number. This number is the position the word should have in the result.
 * 
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * 
 * If the input string is empty, return an empty string. The words in the input
 * String will only contain valid consecutive numbers.
 * If a word does not have a number, default it to 0.  Words with the same numbers will be 
 * assigned the order that they appear
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class OrderPlease {

	
	public String reorder(String phrase) {		
        return Stream.of(
        	StringUtil.defaultString(phrase).split(" "))
        		.sorted((s1, s2) -> 
        			Integer.compare(
						NumberUtil.toInt(StringUtil.removeNonNumeric(s1)),
						NumberUtil.toInt(StringUtil.removeNonNumeric(s2))))
        		.collect(Collectors.joining(" ")
        );
    }
}
