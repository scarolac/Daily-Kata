package com.smt.kata.math;

/****************************************************************************
 * <b>Title</b>: LookSaySequence.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Look and Say Sequence
 * 
 * In mathematics, the look-and-say sequence is the sequence of integers beginning as follows:
 * 
 * 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, ... (sequence A005150 in the OEIS).
 * To generate a member of the sequence from the previous member, read off the digits 
 * of the previous member, counting the number of digits in groups of the same digit. For example:
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 1211 is read off as "one 1, one 2, then two 1s" or 111221.
 * 111221 is read off as "three 1s, two 2s, then one 1" or 312211
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 28, 2021
 * @updates:
 ****************************************************************************/
public class LookSaySequence {

	/**
	 * Translates a number into a look say sequence number
	 * @param number Number to translate
	 * @return A look say sequence representing the passe din number
	 */
	public int translate(int number) {
		var numString = (Math.abs(number) + "");
		var temp = numString.charAt(0);
		var count = 0;
		var result = new StringBuilder();
		for (var letter : numString.toCharArray()) {
			if (letter == temp) ++count;
			else {
				result.append(count).append(temp);
				count = 1;
				temp = letter;
			}								
		}
		result.append(count).append(temp);		
		return Integer.parseInt(result.toString());
	}
}