package com.smt.kata.math;

/****************************************************************************
 * <b>Title:</b> ClassAverage.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Bring Down The Class Average
 * 
 * What is the percentage you can score on a test, which single-handedly 
 * brings down the class average by 5%. Given an array of your classmates 
 * scores, create a function that returns the answer. Round to the nearest percent.
 * 
 * Examples
 * takeDownAverage(["95%", "83%", "90%", "87%", "88%", "93%"]) ➞ "58%"
 * takeDownAverage(["10%"]) ➞ "9%"
 * takeDownAverage(["53%", "79%"]) ➞ "56%"
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 23, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class ClassAverage {

	/**
	 * Calculates what the next score will need to be to reduce the average by 5%
	 * @param scores Current scores
	 * @return Score required to bring down the overall average by 5%
	 */
	public String takeDownAverage(String[] scores) {
		return scores[0];
	}
}
