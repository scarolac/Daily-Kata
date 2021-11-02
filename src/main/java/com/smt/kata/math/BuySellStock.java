package com.smt.kata.math;

/****************************************************************************
 * <b>Title</b>: BuySellStock.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Best Time to Buy and Sell Stock Kata
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * 
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * Constraints:
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 1, 2021
 * @updates:
 ****************************************************************************/
public class BuySellStock {

	/**
	 * calculate the highest possible profit based upon the dates below
	 * @param trades Cost of the stock over time
	 * @return Max profit amount.  ) if no profit (or loss)
	 */ 
	public int calculateMaxProfit(int[] trades) {
		return trades.length;
	}

}
