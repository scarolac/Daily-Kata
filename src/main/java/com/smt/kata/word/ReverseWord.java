package com.smt.kata.word;

import java.util.Stack;

/****************************************************************************
 * <b>Title</b>: ReverseWord.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Reverse Words in a String
 * Given an input string, reverse the string word by word.
 * 
 * Examples
 * reverseWords("the sky is blue") ➞ "blue is sky the"
 * 
 * reverseWords("  hello world!  ") ➞ "world! hello"
 * 
 * reverseWords("a good   example") ➞ "example good a"
 * Notes
 * A word is defined as a sequence of non-space characters.
 * The input string may contain leading or trailing spaces. However, your reversed 
 * string should not contain leading or trailing spaces. You need to reduce multiple 
 * spaces between two words to a single space in the reversed string. You *** MAY NOT ***
 * utilize String.split() or parsing methods.  You must loop the phrase and process in a 
 * loop.  You may use collections to store words if desired.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 8, 2021
 * @updates:
 ****************************************************************************/
public class ReverseWord {

	/**
	 * 
	 */
	public ReverseWord() {
		super();
	}
	
	/**
	 * Takes the phrase and reverses the ords
	 * @param phrase
	 * @return
	 */
	public String processPhrase(String phrase) {
		if (phrase == null) return "";
		Stack<String> stack = new Stack<>();
		
		StringBuilder temp = new StringBuilder();
		for (var letter : phrase.trim().toCharArray()) {
			if (letter != ' ') 			
				temp.append(letter);
			else if (temp.length() > 0) {
				stack.push(temp.toString());
				temp = new StringBuilder();
			}							
		}
		stack.push(temp.toString());
		
		StringBuilder result = new StringBuilder();
		while(! stack.empty()) {
			result.append(stack.pop()).append(" ");			
		}
		
		return result.toString().trim();
	}
}
