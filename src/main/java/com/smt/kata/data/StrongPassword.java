package com.smt.kata.data;

// JDK 11.x
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: StrongPassword.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Strong Password
 * Create a function that determines the minimum number of characters needed to 
 * make a strong password.
 * 
 * A password is considered strong if it satisfies the following criteria:
 * 
 * Its length is at least 6.
 * It contains at least one digit.
 * It contains at least one lowercase English character.
 * It contains at least one uppercase English character.
 * It contains at least one special character: !@#$%^&*()-+
 * Types of characters in a form you can paste into your solution:
 * 
 * static final String numbers = "0123456789";
 * static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
 * static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 * static final String special_characters = "!@#$%^&*()-+";
 * Examples
 * strongPassword(“Ed1”) ➞ 3
 * 
 * strongPassword(“#Edabit”) ➞ 1
 * 
 * strongPassword("W1llth!spass?") ➞ 0
 * 
 * Notes
 * ---- Do not use regex to solve this
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 8, 2021
 * @updates:
 ****************************************************************************/
public class StrongPassword {
	/**
	 * Defines the minimum password length
	 */
	public static final int MIN_PASSWORD_LENGTH = 8;
	
	/**
	 * Special characters used in the passwords
	 */
	protected static final List<Character> SPECIAL_CHARS = Arrays.asList( '!','@','#','$','%','^','&','*','(',')','-','+' );

	// Members
	private int minPasswordLength;
	
	/**
	 * Initializes the class with the MIN_PASSWORD_LENGTH
	 */
	public StrongPassword() {
		super();
		this.minPasswordLength = MIN_PASSWORD_LENGTH;
	}

	/**
	 * min password length is assigned when initializing
	 * @param passwordLength
	 */
	public StrongPassword(int minPasswordLength) {
		super();
		this.minPasswordLength = minPasswordLength > MIN_PASSWORD_LENGTH ? minPasswordLength : MIN_PASSWORD_LENGTH;
	}
	
	/**
	 * Determines if the provided password matches the Strong Password patterns
	 * @param password USer's password
	 * @return Boolean if valid or not
	 */
	public boolean isValidPattern(String password) {
		return password == null;
	}

	/**
	 * @return the minPasswordLength
	 */
	public int getMinPasswordLength() {
		return minPasswordLength;
	}

	/**
	 * @param minPasswordLength the minPasswordLength to set
	 */
	public void setMinPasswordLength(int minPasswordLength) {
		this.minPasswordLength = minPasswordLength;
	}
}
