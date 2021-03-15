package com.smt.kata.math;

import org.apache.commons.lang3.StringUtils;

import com.smt.kata.code.RomanNumerals;

/****************************************************************************
 * <b>Title</b>: RomanNumeralMath.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Roman Numeral Math
 * Take 2 roman numerals and return the sum or difference between the 2 values.
 * When subtracting, use absolute value for the difference to ensure the number
 * returned is always positive
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 15, 2021
 * @updates:
 ****************************************************************************/
public class RomanNumeralMath {
	
	private RomanNumerals romanNumerals;
	
	public RomanNumeralMath() {
		romanNumerals = new RomanNumerals();
	}
	
	/**
	 * Takes two roman numerals and adds them together
	 * @param first
	 * @param second
	 * @return
	 */
	public String add(String first, String second) {
		if (StringUtils.isEmpty(first) || StringUtils.isEmpty(second) || 
				first.matches("\\d") || second.matches("\\d")) return "";		
		
		return romanNumerals.getRomanNumeral(
				romanNumerals.getNumberFromRoman(first) +
				romanNumerals.getNumberFromRoman(second));
	}
	
	/**
	 * Takes two roman numerals and subtracts them.  Absolute value is
	 * used to ensure a positive number
	 * @param first
	 * @param second
	 * @return
	 */
	public String subtract(String first, String second) {		
		return romanNumerals.getRomanNumeral(
				romanNumerals.getNumberFromRoman(first) -
				romanNumerals.getNumberFromRoman(second));
	}
}
