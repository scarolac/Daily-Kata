package com.smt.kata.math;

/****************************************************************************
 * <b>Title:</b> BaseConverter.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Base Converter
 * 
 * In this kata, you must convert a base 10 integer into a binary, octal
 * or hexidecimal value.
 * 
 * You must also convert a binary, octal or hexidecimal number back to a base 10 integer
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 6, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class BaseConverter {

	/**
	 * Converts a decimal value to its binary equivalent
	 * @param value Decimal value to be converted
	 * @return binary number as an integer
	 */
	public int decimaltoBinary(int value) {
		return Integer.valueOf(convertToBase(value, 2));
	}
	
	/**
	 * Converts a decimal value to its octal equivalent
	 * @param value Decimal value to be converted
	 * @return Octal number as an integer
	 */
	public int decimaltoOctal(int value) {
		return Integer.valueOf(convertToBase(value, 8));
	}

	/**
	 * Converts a decimal value to its hexidecimal equivalent
	 * @param value Decimal value to be converted
	 * @return Hexideciaml number as a string
	 * 
	 */
	public String decimaltoHexidecimal(int value) {
		return convertToBase(value, 16);
	}
	
	/**
	 * Converts a decimal value into a binary, octal or hex value
	 * @param value Decimal value to convert
	 * @param base Base 2, 8 or 16
	 * @return String of the converted value.  A string is used as hex #s have characters
	 */
	private String convertToBase(int value, int base) {
		return value + base + "";
	}
	
	/**
	 * Converts a value with the given base back to decimal
	 * @param value Value to be converted
	 * @param base Base 2, 8 or 16
	 * @return Converted number in decimal (base10) format
	 */
	public int convertToDecimal(String value, int base) {
		return base;
	}
}
