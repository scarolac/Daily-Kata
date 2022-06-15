package com.smt.kata.lexical;

/**
 * Part one of a series designed to help design a lexical Analyzer, this Kata focuses on performing string validation before any analysis occurs.
 * 
 * The goal is to write a regex pattern that will validate an equation 
 * consists of a left side of numbers and operands (+ or -) 
 * with any number of spaces between them, an = symbol, 
 * and a right side consisting of a number.
 * 
 * All numbers will be positive.  No letters or other special characters should exist.
 * 
 * Example of a valid equation
 * 
 * 1+1=2
 * 1 + 1 = 2
 *   12 + 12 + 4 - 5 - 2=34
 *   
 *Example of invalid
 *1 = 2
 * = 2
 *1
 *1 + a = 2
 *1 + 2
 *1 + 2 2 = 7
 *1 * 5 = 5 
 * @author raptor
 *
 */
public class LexicalValidator {

	/**
	 * Validate that a given equation is of proper structure and evaluates to correct answer.
	 * @param equation
	 * @return
	 */
	public boolean validate(String equation) {
		return true;
	}
}
