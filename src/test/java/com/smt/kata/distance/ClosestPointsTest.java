package com.smt.kata.distance;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// HDK 11.x
import java.util.Arrays;
import java.util.List;



/****************************************************************************
 * <b>Title</b>: ClosestPointsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Closest Points Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 16, 2021
 * @updates:
 ****************************************************************************/
class ClosestPointsTest {

	// Members
	private ClosestPoints cp = new ClosestPoints();
	
	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsNull() throws Exception {
		assertEquals(0, cp.calculateClosestPoints(null).length);
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsEmpty() throws Exception {
		assertEquals(0, cp.calculateClosestPoints(new Integer[0][0]).length);
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsExampleOne() throws Exception {
		Integer[][] closest = cp.calculateClosestPoints(new Integer[][] {{1, 1}, {-1, -1}, {3, 4}, {6, 1}, {-1, -6}, {-4, -3} });
		List<Integer> values = Arrays.asList(new Integer[] {closest[0][0], closest[0][1], closest[1][0], closest[1][1]});
		assertTrue(values.contains(-1));
		assertTrue(values.contains(1));
	}

	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsExampleTwo() throws Exception {
		Integer[][] closest = cp.calculateClosestPoints(new Integer[][] {{1, 1}, {4,4}, {7,7}, {10,10}, {-1, -6}, {2,2} });
		List<Integer> values = Arrays.asList(new Integer[] {closest[0][0], closest[0][1], closest[1][0], closest[1][1]});
		assertTrue(values.contains(1));
		assertTrue(values.contains(2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsExampleThree() throws Exception {
		Integer[][] closest = cp.calculateClosestPoints(new Integer[][] {{-1, -1}, {-4,-4}, {-7,-7}, {-10,-10}, {-1, -6}, {-2,-2} });
		List<Integer> values = Arrays.asList(new Integer[] {closest[0][0], closest[0][1], closest[1][0], closest[1][1]});
		assertTrue(values.contains(-1));
		assertTrue(values.contains(-2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.ClosestPoints#calculateClosestPoints(int[][])}.
	 */
	@Test
	void testCalculateClosestPointsExampleFour() throws Exception {
		Integer[][] closest = cp.calculateClosestPoints(new Integer[][] {{6,7}, {-4,-4}, {-7,-7}, {-10,-10}, {5,8}, {6, 10} });
		List<Integer> values = Arrays.asList(new Integer[] {closest[0][0], closest[0][1], closest[1][0], closest[1][1]});
		assertTrue(values.contains(5));
		assertTrue(values.contains(6));
		assertTrue(values.contains(7));
		assertTrue(values.contains(8));
	}
}
