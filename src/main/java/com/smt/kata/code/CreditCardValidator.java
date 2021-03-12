package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: CreditCardValidator.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Validate Credit Card Number
 * Create a function that takes a number as an argument and returns true if the number 
 * is a valid credit card number, false otherwise.
 * 
 * Credit card numbers must valid, and pass the Luhn test, described below:
 * 
 * Remove the last digit (this is the "check digit").
 * Reverse the number.
 * Double the value of each digit in odd-numbered positions. If the doubled 
 * value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
 * Add all digits.
 * Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.
 * 
 * Examples
 * validateCard(1234567890123456) ➞ false
 * 
 * // Step 1: check digit = 6, num = 123456789012345
 * // Step 2: num reversed = 543210987654321
 * // Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
 * // Step 4: sum = 58
 * // Step 5: 10 - 8 = 2 (not equal to 6) ➞ false
 * 
 * isValid(1234567890123452) ➞ true
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 8, 2021
 * @updates:
 ****************************************************************************/
public class CreditCardValidator {
	
	/**
	 * Validates the provided CC number
	 * @param ccn
	 * @return
	 */
	public boolean isValid(String ccn) {
		if (ccn == null || ccn.length() == 0 || ccn.matches(".*\\D.*")) return false;
		
		char check = ccn.charAt(ccn.length() - 1);
		String reversed = new StringBuilder(ccn.substring(0, ccn.length() - 1)).reverse().toString();
			
		int temp = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < reversed.length(); ++i) {
			
			if ((i + 1) % 2 != 0) {
				temp = Integer.parseInt(reversed.charAt(i) + "") * 2;
				if (temp > 9) {
					int sum = 0;
					while (temp > 0) {
						sum += temp % 10;
						temp /= 10;
					}
					temp = sum;
				}
				result.append(temp);				
			}
			else
				result.append(reversed.charAt(i));
		}
		
		int sum = 0;
		for (int i = 0; i < result.length(); ++i)
		{
			sum += Integer.parseInt(result.charAt(i) + "");
		}
		
		return (10 - (sum % 10) == Integer.parseInt(check + ""));
	}
}
