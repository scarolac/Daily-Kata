package com.smt.kata.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: BuySellStockTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 1, 2021
 * @updates:
 ****************************************************************************/
class BuySellStockTest {
	
	// Members
	private BuySellStock bss = new BuySellStock();
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitNull() throws Exception {
		assertEquals(0, bss.calculateMaxProfit(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitEmpty() throws Exception {
		assertEquals(0, bss.calculateMaxProfit(new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitSmall() throws Exception {
		assertEquals(0, bss.calculateMaxProfit(new int[] { 3 }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitSmallValid() throws Exception {
		assertEquals(5, bss.calculateMaxProfit(new int[] { 5, 10 }));
	}

	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitExampleOne() throws Exception {
		assertEquals(5, bss.calculateMaxProfit(new int[] {7,1,5,3,6,4}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitExampleTwo() throws Exception {
		assertEquals(0, bss.calculateMaxProfit(new int[] {7,6,4,3,1}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.BuySellStock#calculateMaxProfit(int[])}.
	 */
	@Test
	void testCalculateMaxProfitExampleAscending() throws Exception {
		assertEquals(5, bss.calculateMaxProfit(new int[] {1,2,3,4,5,6}));
	}
}
