package com.smt.kata.sequence;

// Junit 5.x
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: ArrayPermutationsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 12, 2022
 * @updates:
 ****************************************************************************/
class ArrayPermutationsTest {
	
	// Members
	private ArrayPermutations ap = new ArrayPermutations();
	
	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsNullArray() throws Exception {
		assertEquals(0, ap.findPermutations(null).size());
	}
	
	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsEmptyArray() throws Exception {
		assertEquals(0, ap.findPermutations(new int[0]).size());
		assertEquals(0, ap.findPermutations(new int[] {}).size());
	}

	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsExampleOne() throws Exception {
		List<List<Integer>> res = ap.findPermutations(new int[] { 1, 2, 3 });
		assertEquals(6, res.size());
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(1, 3, 2))));
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(2, 1, 3))));
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(2, 3, 1))));
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(3, 1, 2))));
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(3, 2, 1))));
	}

	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsExampleTwo() throws Exception {
		List<List<Integer>> res = ap.findPermutations(new int[] { 1, 2 });
		assertEquals(2, res.size());
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(2, 1))));
	}

	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsExampleThree() throws Exception {
		List<List<Integer>> res = ap.findPermutations(new int[] { 1 });
		assertEquals(1, res.size());
		assertTrue(res.contains(new ArrayList<>(Arrays.asList(1))));
	}

	/**
	 * Test method for
	 * {@link com.smt.kata.sequence.ArrayPermutations#findPermutations(int[])}.
	 */
	@Test
	void testFindPermutationsExampleLarge() throws Exception {
		List<List<Integer>> res = ap.findPermutations(new int[] { 1, 2, 33, 44, 3, 4, 5, 6 });
		assertEquals(40320, res.size());
	}
}
