package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: NextOneBit.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Next One Bit
 * 
 * Given an integer n, find the next biggest integer with the same number of 
 * 1-bits on. For example, given the number 6 (0110 in binary), return 9 (1001)
 * 
 * Constraints:
 * input empty: return "";
 * input not a binary number: return "";
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 21, 2022
 * @updates:
 ****************************************************************************/
public class NextOneBit {

	/**
	 * Calculates the next integer from the provided binary number containing 
	 * the same number of ones
	 * @param binNum Binary number in string format
	 * @return Next binary number with the same number of ones
	 */
	public String calculate(String binNum) {
		if (badInput(binNum)) return "";
		
		var count = countBits(binNum);		
		var value = Integer.parseInt(binNum, 2);
		var binary = Integer.toBinaryString(++value);
		
		while(countBits(binary) != count)
			binary = Integer.toBinaryString(++value);
		
		return binary;
	}
	
	private boolean badInput(String binNum) {
		return binNum == null 
				|| binNum.isEmpty() 
				|| binNum.chars().filter(c -> !(c =='1' || c == '0')).count() > 0;		
	}
	
	private long countBits(String number) {
		return number.chars().filter(c -> c == '1').count();
	}
}
