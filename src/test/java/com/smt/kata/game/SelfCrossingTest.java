package com.smt.kata.game;

// Junit 5
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SelfCrossingTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit test for the Self Crossing Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 15, 2021
 * @updates:
 ****************************************************************************/
class SelfCrossingTest {
	
	// Members
	private SelfCrossing sc = new SelfCrossing();
	
	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsNull() throws Exception {
		assertFalse(sc.overlaps(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsEmpty() throws Exception {
		assertFalse(sc.overlaps(new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsSmall() throws Exception {
		assertFalse(sc.overlaps(new int[] {2,1,1}));
	}

	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsExampleOne() throws Exception {
		assertTrue(sc.overlaps(new int[] {2,1,1,2}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsExampleTwo() throws Exception {
		assertFalse(sc.overlaps(new int[] {1,2,3,4}));
	}

	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsExampleThree() throws Exception {
		assertTrue(sc.overlaps(new int[] {1,1,1,3}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.SelfCrossing#overlaps(int[])}.
	 */
	@Test
	void testOverlapsExampleFour() throws Exception {
		assertFalse(sc.overlaps(new int[] {3,3,1,1}));
	}
}
