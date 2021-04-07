package com.smt.kata.math;

import java.util.Arrays;
import java.util.EnumMap;
// JDK 11.x
import java.util.Map;

/****************************************************************************
 * <b>Title:</b> PurchaseChange.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Purchase Change
 * 
 * Correctly determine the fewest number of coins/bills to be given to a customer such 
 * that the sum of the coins' value would equal the correct amount of change.
 * 
 * For example
 * 
 * A price of .10 and a .25 paid should return one nickel (5) and one 
 * dime (10) or {DIME=1, NICKEL=1}
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 2, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class PurchaseChange {
	
	/**
	 * Currency enum to track money types
	 */
	public enum Currency {
		TWENTY_DOLLAR(20.00), TEN_DOLLAR(10.00), FIVE_DOLLAR(5.00), DOLLAR(1.00), QUARTER(0.25), DIME(0.10), NICKEL(0.05), PENNY(0.01);

		double value;
		Currency(double d) {
			this.value = d;
		}
	}
	
	/**
	 * Calculates the change
	 * @param purchaseAmount The amount of the purchase
	 * @param moneyPaid The amount given to pay for the purchase
	 * @return Map with currencies and amounts
	 */
	public Map<Currency, Integer> calculate(double purchaseAmount, double moneyPaid) {
		Map<Currency, Integer> result = new EnumMap<>(Currency.class);
		double change = moneyPaid - purchaseAmount;
		if (change < 0) return result;
		for (var item : Currency.values()) {
			double value = item.value;
			if (value > change)	continue;

			result.put(item, (int) (change / value));
			change %= value;
		}
		result.computeIfPresent(Currency.PENNY, (key, val) -> val + 1);

		return result;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }    
    private static void pA(Currency[] currencies) { System.out.println(Arrays.toString(currencies));}
//    private static void pM(char[][] matrix) { p(matrix.length + "x" + matrix[0].length); for (var row : matrix) pA(row); }
}
