package com.smt.kata.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

/****************************************************************************
 * <b>Title</b>: MorseCodeTranslator.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Morse Code converter.  Take any phrase and convert it to 
 * its morse code equivelant and decode a morse code phrase back to english.  In morse
 * code, spaces separate the letters and " / " separates words
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 15, 2021
 * @updates:
 ****************************************************************************/
public class MorseCodeTranslator {
	/**
	 * 
	 */
	public MorseCodeTranslator() {
		super();
	}
	
	private static Map<String, String> morse = new HashMap<>();
	static {
		morse.put("A", ".-");
        morse.put("B", "-...");
        morse.put("C", "-.-.");
        morse.put("D", "-..");
        morse.put("E", ".");
        morse.put("F", "..-.");
        morse.put("G", "--.");
        morse.put("H", "....");
        morse.put("I", "..");
        morse.put("J", ".---");
        morse.put("K", "-.-");
        morse.put("L", ".-..");
        morse.put("M", "--");
        morse.put("N", "-.");
        morse.put("O", "---");
        morse.put("P", ".--.");
        morse.put("Q", "--.-");
        morse.put("R", ".-.");
        morse.put("S", "...");
        morse.put("T", "-");
        morse.put("U", "..-");
        morse.put("V", "...-");
        morse.put("W", ".--");
        morse.put("X", "-..-");
        morse.put("Y", "-.--");
        morse.put("Z", "--..");
        morse.put("0", "-----");
        morse.put("1", ".----");
        morse.put("2", "..---");
        morse.put("3", "...--");
        morse.put("4", "....-");
        morse.put("5", ".....");
        morse.put("6", "-....");
        morse.put("7", "--...");
        morse.put("8", "---..");
        morse.put("9", "----.");
        morse.put(".", ".-.-.-");
        morse.put(",", "--..--");
        morse.put("?", "..--..");
        morse.put(" ", "/");
	}
	
	/**
	 * Converts a phrase or word into morse code
	 * @param phrase any set of characters or numbers
	 * @return Morse code as a space delimited document
	 */
	public String encode(String phrase) {
		if (StringUtils.isEmpty(phrase)) return "";
		
		StringBuilder result = new StringBuilder();
		for (var letter : phrase.toUpperCase().toCharArray()) {
			if (letter == '-') continue;
			
			result.append(morse.get(letter + "")).append(" ");
		}
		
		return result.toString().trim();
	}
	
	/**
	 * Decodes a morse code encoded phrase
	 * @param encodedPhrase Uses spaces as the letter delimiter and / as the word delimiter
	 * @return English phrase decoded form the morse code snippet
	 */
	public String decode(String encodedPhrase) {
		if (StringUtils.isEmpty(encodedPhrase)) return "";
		
		StringBuilder sb = new StringBuilder();
		for (String s : encodedPhrase.split(" "))
			sb.append(fromMorse(s));
		
		return sb.toString().trim();
	}
	
	/**
	 * Get letter from dit-dot
	 * @param input dit-dot
	 * @return letter
	 */
	private String fromMorse(String input) {
		for (Entry<String, String> e : morse.entrySet()) 
			if (e.getValue().equals(input)) return e.getKey();		
		return "";
	}
}
