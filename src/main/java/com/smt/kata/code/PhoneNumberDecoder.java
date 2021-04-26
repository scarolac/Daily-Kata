package com.smt.kata.code;

import java.util.HashMap;
import java.util.Map;

/****************************************************************************
 * <b>Title:</b> PhoneNumberDecoder.java
 * <b>Project:</b> Daily-Kata
 * <b>Description:</b> Phone Number Word Decoder
 * 
 * Create a program that converts a phone number with letters to one with only numbers.
 * Examples
 * 
 * textToNum("123-647-EYES") ➞  "123.647.3937"
 * textToNum("(325)444-TEST") ➞ "325.444.8378"
 * textToNum("653-TRY-THIS") ➞  "653.879.8447"
 * textToNum("435-224-7613") ➞  "435.224.7613"
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
public class PhoneNumberDecoder {
	
	private static Map<String, Integer> letterMap = new HashMap<>();
	static {
		letterMap.put("ABC", 2);
		letterMap.put("DEF", 3);
		letterMap.put("GHI", 4);
		letterMap.put("JKL", 5);
		letterMap.put("MNO", 6);
		letterMap.put("PQRS", 7);
		letterMap.put("TUV", 8);
		letterMap.put("WXYZ", 9);
	}

	/**
	 * 
	 */
	public PhoneNumberDecoder() {
		super();
	}

	/**
	 * Converts a phone number with text to a formatted phone number
	 * @param pn phone number to parse
	 * @return formatted phone number.
	 */
	public String textToNum(String pn) {
		if (pn == null) return "";
		String newPn = pn.replaceAll("[^\\w]", "");
		if (newPn.length() != 10) return "";
		
		StringBuilder result = new StringBuilder();
		for (var letter : newPn.toUpperCase().toCharArray()) {
			if (Character.isDigit(letter)) 
				result.append(letter);
			else {
				for (var entry : letterMap.entrySet()) {
					if (entry.getKey().contains(letter + "")) {
						result.append(entry.getValue());
						break;
					}
				}
			}
			if (result.length() == 3 || result.length() == 7)
				result.append(".");
		}
		return result.toString();
	}
}
