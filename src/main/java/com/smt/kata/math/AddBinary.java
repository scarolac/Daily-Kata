package com.smt.kata.math;

/****************************************************************************
 * <b>Title</b>: AddBinary.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Add Binary Kata
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 * Constraints:
 * 
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 * 
 * ****** Try and perform this kata in a single line of code
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 15, 2021
 * @updates:
 ****************************************************************************/
public class AddBinary {

	/**
	 * Adds two strings representing binary numbers 
	 * @param a First binary number
	 * @param b Second Binary Number
	 * @return Sum of the 2 binary numbers added together 
	 */
	public String addBinary(String a, String b) {
        return a + b;
    }

}
