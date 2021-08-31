package com.smt.kata.word;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: AlienAlphabet.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Alien Alphabet Kata
 * 
 * You come across a dictionary of sorted words in a language you've never seen 
 * before. Write a program that returns the correct order of letters in this language.
 * 
 * For example, given ['xwwd', 'wxyzww', 'wxyww', 'ywx', 'ywz'], 
 * you should return ['x', 'z', 'w', 'y'].
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 23, 2021
 * @updates:
 ****************************************************************************/
public class AlienAlphabet {

	LinkedList<Character> alphabet = new LinkedList<>();
	Set<Character> used = new HashSet<>();

	/**
	 * Finds the "Alien" alphabet in order
	 * @param words List of words in the proper order
	 * @return Order of the characters
	 */
	public char[] alphabetize(String[] words) {
		if (ArrayUtils.isEmpty(words))
			return new char[0];

		for (int x = 0; x < words.length - 1; x++) {
			String firstWord = words[x];
			String secondWord = words[x + 1];

			for (int y = 0; y < firstWord.length(); y++) {
				// If one word has ended, you cant learn anything more
				if (firstWord.length() <= y || secondWord.length() <= y)
					break;

				char firstChar = firstWord.charAt(y);
				char secondChar = secondWord.charAt(y);

				// You learn nothing if both are the same
				if (firstChar == secondChar)
					continue;

				// We can assume we are getting some information
				int firstIndex = alphabet.indexOf(firstChar);
				int secondIndex = alphabet.indexOf(secondChar);
				boolean firstIsInAlphabet = firstIndex != -1;
				boolean secondIsInAlphabet = secondIndex != -1;

				// These are already in the alphabet
				if (firstIsInAlphabet && secondIsInAlphabet) {

					// We check to see if this is new info and we need to move the values
					if (firstIndex > secondIndex) {
						alphabet.remove(firstIndex);
						alphabet.add(secondIndex, firstChar);
					}
				} else if (firstIsInAlphabet) {
					alphabet.add(firstIndex + 1, secondChar);
					break;
				} else if (secondIsInAlphabet) {
					alphabet.add(secondIndex, firstChar);
					break;
				} else {
					alphabet.add(firstChar);
					alphabet.add(secondChar);
					break;
				}
			}
		}

		char[] result = new char[alphabet.size()];
		for (var i = 0; i < alphabet.size(); ++i)
			result[i] = alphabet.get(i);

		return result;
	}
}