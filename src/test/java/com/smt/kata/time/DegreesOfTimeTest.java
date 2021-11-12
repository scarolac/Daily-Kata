package com.smt.kata.time;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: DegreesOfTimeTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Test for the Degrees of Time Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 10, 2021
 * @updates:
 ****************************************************************************/
class DegreesOfTimeTest {
	
	// Members
	private DegreesOfTime dot = new DegreesOfTime();
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		assertEquals(0, dot.calculate(null));
	}

	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		assertEquals(0, dot.calculate(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateInvalidHour() throws Exception {
		assertEquals(0, dot.calculate("kk:00"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateInvalidMinute() throws Exception {
		assertEquals(0, dot.calculate("12:ef"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateInvalidSeparator() throws Exception {
		assertEquals(0, dot.calculate("12|33"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateHourTooLarge() throws Exception {
		assertEquals(0, dot.calculate("120:33"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateMinuteTooLarge() throws Exception {
		assertEquals(0, dot.calculate("12:133"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateMinuteNegative() throws Exception {
		assertEquals(0, dot.calculate("12:-33"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateHGourNegative() throws Exception {
		assertEquals(0, dot.calculate("-2:33"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateThreeFortyFive() throws Exception {
		assertEquals(180, dot.calculate("3:45"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateThreeFortyFivePM() throws Exception {
		assertEquals(180, dot.calculate("15:45"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateElevenFiftyNine() throws Exception {
		assertEquals(24, dot.calculate("23:59"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateElevenOne() throws Exception {
		assertEquals(324, dot.calculate("23:01"));
	}

	/**
	 * Test method for {@link com.smt.kata.time.DegreesOfTime#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateMidnight() throws Exception {
		assertEquals(0, dot.calculate("00:00"));
	}
}
