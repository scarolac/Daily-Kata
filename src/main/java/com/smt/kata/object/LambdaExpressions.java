package com.smt.kata.object;

/****************************************************************************
 * <b>Title</b>: LambdaExpressions.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Lambda Expressions
 * 
 * Write the following methods that return a lambda expression performing a 
 * specified action:
 * 
 * PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
 * PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
 * PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.
 * 
 * Each lambda expressions will be used inside a wrapper method of the same name.
 * All of the calculation logic will be inside the lambda.
 * 
 * For example, the isOdd lambda will be wrapped in an isOdd method of this class.
 * The wrapper methods are already added for you.  You must create and implement the lambdas 
 * in this class for each of the above cases and use the output of those lambdas.  
 * Unit tests will validate that each of the 3 methods will work correctly.
 * 
 * You may use ANY class and Reference on this Kata including the internet
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 24, 2021
 * @updates:
 ****************************************************************************/
public class LambdaExpressions {
	
	/**
	 * Determines if the provided int is odd or not
	 * @param value Value to evaluate for odd 
	 * @return True if the value is odd.  False otherwise
	 */
	public boolean isOdd(int value) {
		return value == 0;
	}
	
	/**
	 * Determines if the provided value is a palindrome or not
	 * @param value Value to evaluate for being a palindrome 
	 * @return True if the value is a palindrome.  False otherwise
	 */
	public boolean isPalindrome(String value) { 
		return value == null;
	}
	
	/**
	 * Determines if the provided int is prime or not
	 * @param value Value to evaluate for being a prime 
	 * @return True if the value is a prime number.  False otherwise
	 */
	public boolean isPrime(int value) { 
		return value == 0;
	}

}
