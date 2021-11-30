package com.smt.kata.time;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: DailyTemperaturesTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Daily Temperatures kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 29, 2021
 * @updates:
 ****************************************************************************/
class DailyTemperaturesTest {
	
	// Members
	private DailyTemperatures dt = new DailyTemperatures();
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		assertEquals(0, dt.calculate(null).length);
	}

	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		assertEquals(0, dt.calculate(new int[] {}).length);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateLetters() throws Exception {
		int[] days = dt.calculate(new int[] {'a', 'c', 'b', 'z', 'v', 'd'});
		assertEquals(1, days[0]);
		assertEquals(2, days[1]);
		assertEquals(1, days[2]);
		assertEquals(0, days[3]);
		assertEquals(0, days[4]);
		assertEquals(0, days[5]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		int[] days = dt.calculate(new int[] {73,74,75,71,69,72,76,73});
		assertEquals(1, days[0]);
		assertEquals(1, days[1]);
		assertEquals(4, days[2]);
		assertEquals(2, days[3]);
		assertEquals(1, days[4]);
		assertEquals(1, days[5]);
		assertEquals(0, days[6]);
		assertEquals(0, days[7]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		int[] days = dt.calculate(new int[] {30,40,50,60});
		assertEquals(1, days[0]);
		assertEquals(1, days[1]);
		assertEquals(1, days[2]);
		assertEquals(0, days[3]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		int[] days = dt.calculate(new int[] {30,60, 90});
		assertEquals(1, days[0]);
		assertEquals(1, days[1]);
		assertEquals(0, days[2]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateAllColder() throws Exception {
		int[] days = dt.calculate(new int[] {90, 80, 70, 60, 50, 40, 30});
		assertEquals(0, days[0]);
		assertEquals(0, days[1]);
		assertEquals(0, days[2]);
		assertEquals(0, days[3]);
		assertEquals(0, days[4]);
		assertEquals(0, days[5]);
		assertEquals(0, days[6]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateSmall() throws Exception {
		int[] days = dt.calculate(new int[] {20, 30});
		assertEquals(1, days[0]);
		assertEquals(0, days[1]);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DailyTemperatures#calculate(int[])}.
	 */
	@Test
	void testCalculateSingle() throws Exception {
		int[] days = dt.calculate(new int[] {20});
		assertEquals(0, days[0]);
	}

}
