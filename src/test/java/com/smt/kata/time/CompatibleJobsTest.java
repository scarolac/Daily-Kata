package com.smt.kata.time;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: CompatibleJobsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Compatible Jobs Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 17, 2022
 * @updates:
 ****************************************************************************/
class CompatibleJobsTest {
	
	// Members
	private CompatibleJobs cj = new CompatibleJobs();

	/**
	 * Test method for {@link com.smt.kata.time.CompatibleJobs#calculate(int[][])}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		int[][] jobs = null;
		
		int[][] res = cj.calculate(jobs);
		assertEquals(0, res.length);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.CompatibleJobs#calculate(int[][])}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		int[][] jobs = new int[][] {};
		
		int[][] res = cj.calculate(jobs);
		assertEquals(0, res.length);
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.CompatibleJobs#calculate(int[][])}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		int[][] jobs = new int[][] {
			{0, 6},{1, 4},{3, 5},{3, 8},{4, 7},{5, 9},{6, 10},{8, 11}
		};
		
		int[][] res = cj.calculate(jobs);
		assertEquals(3, res.length);
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("1");}));
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("7");}));
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("8");}));
	}

	/**
	 * Test method for {@link com.smt.kata.time.CompatibleJobs#calculate(int[][])}.
	 */
	@Test
	void testCalculateExampleOneMixed() throws Exception {
		int[][] jobs = new int[][] {
			{4, 7},{8, 11},{1, 4},{3, 5},{3, 8},{5, 9},{6, 10},{0, 6}
		};
		
		int[][] res = cj.calculate(jobs);
		assertEquals(3, res.length);
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("1");}));
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("7");}));
		assertTrue(Arrays.stream(res).anyMatch(x -> {return Arrays.toString(x).contains("8");}));
	}
}
