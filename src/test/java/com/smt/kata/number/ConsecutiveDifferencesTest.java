package com.smt.kata.number;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
// JDK 11.x
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: ConsecutiveDifferencesTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Consecutive Differences Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 1, 2021
 * @updates:
 ****************************************************************************/
class ConsecutiveDifferencesTest {
	
	// Members
	private ConsecutiveDifferences cd = new ConsecutiveDifferences();
	
	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindInvalidDataOne() throws Exception {
		assertEquals(0, cd.find(3, 10).size());
		assertEquals(0, cd.find(3, -1).size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindInvalidDataTwo() throws Exception {
		assertEquals(0, cd.find(-3, 1).size());
		assertEquals(0, cd.find(10, 1).size());
	}

	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		int[] matches = new int[] {181,292,707,818,929};
		List<Integer> diff = cd.find(3, 7);
		List<Integer> results = new ArrayList<>(Arrays.stream(matches).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList()));
		assertTrue(results.containsAll(diff));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		int[] matches = new int[] {10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98};
		List<Integer> diff = cd.find(2, 1);
		List<Integer> results = new ArrayList<>(Arrays.stream(matches).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList()));
		
		assertTrue(results.containsAll(diff));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		int[] matches = new int[] {11,22,33,44,55,66,77,88,99};
		List<Integer> diff = cd.find(2, 0);
		List<Integer> results = new ArrayList<>(Arrays.stream(matches).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList()));
		
		assertTrue(results.containsAll(diff));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ConsecutiveDifferences#find(int, int)}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		int[] matches = new int[] {13,20,24,31,35,42,46,53,57,64,68,75,79,86,97};
		List<Integer> diff = cd.find(2, 2);
		List<Integer> results = new ArrayList<>(Arrays.stream(matches).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList()));
		
		assertTrue(results.containsAll(diff));
	}

}
