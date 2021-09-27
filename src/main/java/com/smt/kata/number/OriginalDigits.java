package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: OriginalDigits.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Reconstruct Original Digits from English
 * 
 * Given a string s containing an out-of-order English representation of digits 0-9, 
 * return the digits in ascending order.
 * 
 * Example 1:
 * Input: s = "owoztneoer"
 * Output: "012"
 * 
 * Example 2:
 * Input: s = "fviefuro"
 * Output: "45"
 * 
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is one of the characters ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"].
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 9, 2021
 * @updates:
 ****************************************************************************/
public class OriginalDigits {
	
	/**
	 * Initializes the class 
	 */
	public OriginalDigits() {
		super();
	}
	
	/**
	 * Calculates the digits in the word
	 * @param source Source to find digits
	 * @return Digits in order
	 */
	public String calculate(String source) {
		if (source == null || source.isEmpty()) return "";
		source = source.toLowerCase();
		var numbers = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		var result = new StringBuilder();

		for (var i = 0; i < numbers.length; ++i)
			if (check(source, numbers[i]))
				result.append(i);

		return result.toString();
	}

	private boolean check(String source, String number) {
		for (var letter : number.toCharArray())
			if (!source.contains(letter + ""))
				return false;

		return true;
	}
}
