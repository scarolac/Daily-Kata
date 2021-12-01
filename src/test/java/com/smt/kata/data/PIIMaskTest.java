package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: PIIMaskTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
class PIIMaskTest {
	
	// Members
	private PIIMask pm = new PIIMask();

	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskNull() throws Exception {
		assertEquals("", pm.mask(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskEmpty() throws Exception {
		assertEquals("", pm.mask(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskExampleOneEmail() throws Exception {
		assertEquals("l*****e@leetcode.com", pm.mask("LeetCode@LeetCode.com"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskExampleTwo() throws Exception {
		assertEquals("a*****b@qq.com", pm.mask("AB@qq.com"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskSmalll() throws Exception {
		assertEquals("", pm.mask("(303)123-123"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskExampleOne() throws Exception {
		assertEquals("+*-***-***-8743", pm.mask("+1(303)432-8743"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskNoCountry() throws Exception {
		assertEquals("***-***-8743", pm.mask("(303)432-8743"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskTwoDigitCountry() throws Exception {
		assertEquals("+**-***-***-8743", pm.mask("+41.303.432.8743"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#mask(java.lang.String)}.
	 */
	@Test
	void testMaskThreeDigitCountry() throws Exception {
		assertEquals("+***-***-***-8743", pm.mask("+100.303.432.8743"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.PIIMask#validEmail(java.lang.String)}.
	 */
	@Test
	void testValidEmail() throws Exception {
		assertEquals("l*****e@leetcode.com", pm.mask("leetcode@leetcode.com"));
		assertEquals("u*****r@domain.co.in", pm.mask("user@domain.co.in"));
		assertEquals("u*****e@domain.co.in", pm.mask("user.name@domain.co.in"));
		assertEquals("", pm.mask("LeetCode@Leet@Code.com"));
		assertEquals("", pm.mask("@yahoo.com"));
	}
}
