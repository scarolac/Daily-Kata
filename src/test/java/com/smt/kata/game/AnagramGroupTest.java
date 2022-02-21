package com.smt.kata.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
// JDK 11.x
import java.util.List;

import static org.junit.Assert.assertTrue;
// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: AnagramGroupTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Anagram Group Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 21, 2022
 * @updates:
 ****************************************************************************/
class AnagramGroupTest {
	
	// Members
	private AnagramGroup ag = new AnagramGroup();

	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleOne() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {"eat", "ate", "apt", "pat", "tea", "now"});
		assertEquals(3, groups.size());
		
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("apt","pat"))) || groups.contains(new ArrayList<>(Arrays.asList("pat","pat"))));
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("now"))));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleOneMixedCase() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {"EAT", "ate", "apt", "PaT", "tea", "NoW"});
		assertEquals(3, groups.size());
		
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("apt","pat"))) || groups.contains(new ArrayList<>(Arrays.asList("pat","pat"))));
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("now"))));
	}

	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleTwo() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {"cow", "ate", "apt", "car", "mouse", "engineer"});
		assertEquals(6, groups.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleThree() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {"brown", "rownb", "ownrb", "nrbow"});
		assertEquals(1, groups.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleOneWithNullWord() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {null, "eat", "ate", "apt", "pat", "tea", null, "now"});
		assertEquals(3, groups.size());
		
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("apt","pat"))) || groups.contains(new ArrayList<>(Arrays.asList("pat","pat"))));
		assertTrue(groups.contains(new ArrayList<>(Arrays.asList("now"))));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsExampleThreeWithNullWord() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {"brown", "rownb", null, "ownrb", "nrbow"});
		assertEquals(1, groups.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsAllNullWords() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[] {null, null, null, null, null});
		assertEquals(0, groups.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsNullArray() throws Exception {
		Collection<List<String>> groups = ag.findGroups(null);
		assertEquals(0, groups.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.AnagramGroup#findGroups(java.lang.String[])}.
	 */
	@Test
	void testFindGroupsEmptyArray() throws Exception {
		Collection<List<String>> groups = ag.findGroups(new String[0]);
		assertEquals(0, groups.size());
	}
}
