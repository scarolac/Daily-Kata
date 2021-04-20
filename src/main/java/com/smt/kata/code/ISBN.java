package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: ISBN.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> The ISBN-10 format is 9 digits (0 to 9) plus one check 
 * character (either a digit or an X only). In the case the check character is an X, 
 * this represents the value '10'. These may be communicated with or without hyphens, and 
 * can be checked for their validity by the following formula:
 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) % 11 == 0
 * If the result is 0, then it is a valid ISBN-10, otherwise it is invalid.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 7, 2021
 * @updates:
 ****************************************************************************/
public class ISBN {

	/**
	 * Reverse the number and compare to the original
	 * @param startNumber
	 * @return
	 */
	public boolean isISBN(String isbnNumber){
		
		return "".equals(isbnNumber);
	}

}
