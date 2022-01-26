package com.smt.kata.number;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MaxSequenceLengthTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Max Sequence Length Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 25, 2022
 * @updates:
 ****************************************************************************/
class MaxSequenceLengthTest {
	
	// Members
	private MaxSequenceLength msl = new MaxSequenceLength();
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		assertEquals(0, msl.calculate(null, 1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		assertEquals(0, msl.calculate(new int[] {}, 1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateZeroStep() throws Exception {
		assertEquals(5, msl.calculate(new int[] {5,5,5,5,5, 1, 100}, 0));
	}

	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(5, msl.calculate(new int[] {5, 2, 99, 3, 4, 1, 100}, 1));
	}

	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(5, msl.calculate(new int[] {9, 3, 99, 5, 7, 1, 100}, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleNgatives() throws Exception {
		assertEquals(5, msl.calculate(new int[] {-9, -3, 99, -5, -7, -1, 100}, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleSmallSequence() throws Exception {
		assertEquals(2, msl.calculate(new int[] {9, 3, 99, 5, 7, 1, 100}, 1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.MaxSequenceLength#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleNoSequence() throws Exception {
		assertEquals(1, msl.calculate(new int[] {9, 3, 99, 5, 7, 1, 37}, 1));
	}
}
