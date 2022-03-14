package com.smt.kata.number;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: SingleRecurrenceTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Single Recurrence Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 14, 2022
 * @updates:
 ****************************************************************************/
class SingleRecurrenceTest {
	
	// Memebrs
	private SingleRecurrence sr = new SingleRecurrence();
	
	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindNullData() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(null)).boxed().collect(Collectors.toList());
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(new int[]{})).boxed().collect(Collectors.toList());
		assertEquals(0, vals.size());
	}

	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(new int[] {2, 4, 6, 8, 10, 2, 6, 10})).boxed().collect(Collectors.toList());
		assertTrue(vals.contains(4));
		assertTrue(vals.contains(8));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(new int[] {1,2,3,4,5,1,2,3,5,6})).boxed().collect(Collectors.toList());
		assertTrue(vals.contains(4));
		assertTrue(vals.contains(6));
	}

	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindNoSingles() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(new int[] {2, 4, 6, 8, 10, 2, 6, 10, 4, 8})).boxed().collect(Collectors.toList());
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SingleRecurrence#find(int[])}.
	 */
	@Test
	void testFindAllSingles() throws Exception {
		List<Integer> vals = Arrays.stream(sr.find(new int[] {1, 2, 3, 4, 5})).boxed().collect(Collectors.toList());
		assertTrue(vals.contains(1));
		assertTrue(vals.contains(2));
		assertTrue(vals.contains(3));
		assertTrue(vals.contains(4));
		assertTrue(vals.contains(5));
	}
}
