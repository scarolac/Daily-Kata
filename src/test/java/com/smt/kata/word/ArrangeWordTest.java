package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: ArrangeWordTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Tests the Arrange Word class.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 6, 2021
 * @updates:
 ****************************************************************************/
class ArrangeWordTest {

	/**
	 * Test method for {@link com.smt.kata.word.ArrangeWord#getPermutations(java.lang.String)}.
	 */
	@Test
	void testGetPermutations() {
		ArrangeWord aw = new ArrangeWord();
		
		// Evaluate simple word
		List<String> permutations = aw.getPermutations("god");
		assertEquals(6, permutations.size());
		assertTrue(permutations.contains("odg"));
		assertTrue(permutations.contains("dog"));
	}
	
	@Test
	void testEmpty() {
		ArrangeWord aw = new ArrangeWord();
		// Evaluate empty case
		List<String> permutations = aw.getPermutations(null);
		assertEquals(0, permutations.size());
	}	
	
	@Test
	void testSingle() {
		ArrangeWord aw = new ArrangeWord();
		// Evaluate single letter
		List<String> permutations = aw.getPermutations("a");
		assertEquals(1, permutations.size());
	}
	
	@Test
	void testLong() {
		ArrangeWord aw = new ArrangeWord();
		// Evaluate long word
		List<String> permutations = aw.getPermutations("evaluation");
		assertEquals(3628800, permutations.size());
		assertTrue(permutations.contains("noitaulave"));
		assertFalse(permutations.contains("val"));
	}

}
