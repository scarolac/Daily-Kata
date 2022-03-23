package com.smt.kata.code;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/****************************************************************************
 * <b>Title</b>: ContiguousPartitionsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Contiguous Partitions Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 23, 2022
 * @updates:
 ****************************************************************************/
class ContiguousPartitionsTest {

	// Members
	private ContiguousPartitions cg = new ContiguousPartitions();
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindNull() throws Exception {
		List<List<Integer>> arr = convert(cg.find(null));
		assertEquals(0, arr.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		List<List<Integer>> arr = convert(cg.find(new int[] {}));
		assertEquals(0, arr.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindTooSmall() throws Exception {
		List<List<Integer>> arr = convert(cg.find(new int[] {5, 3}));
		assertEquals(0, arr.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<List<Integer>> arr = convert(cg.find(new int[] {3, 5, 8, 1, 7}));
		assertTrue(arr.get(0).contains(3));
		assertTrue(arr.get(1).contains(8));
		assertTrue(arr.get(2).contains(7));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindExampletwo() throws Exception {
		List<List<Integer>> arr = convert(cg.find(new int[] {1, 2, 3, 4, 5}));
		assertEquals(0, arr.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ContiguousPartitions#find(int[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		List<List<Integer>> arr = convert(cg.find(new int[] {1, 1, 1, 3, 2, -1, 2}));
		assertTrue(arr.get(0).contains(1));
		assertTrue(arr.get(1).contains(3));
		assertTrue(arr.get(2).contains(-1));
	}
	
	
	/* --------------- helpers -------------------------------------- */
	
	/**
	 * Converts the multidimensional array to a list of lists
	 * @param vals
	 * @return
	 */
	private List<List<Integer>> convert(int[][] vals) {
		List<List<Integer>> valList = new ArrayList<>();
		if (vals == null || vals.length == 0) return valList;
		
		for(int[] val : vals) {
			valList.add(IntStream.of(val).boxed().collect(Collectors.toList()));
		}
		return valList;
	}

}
