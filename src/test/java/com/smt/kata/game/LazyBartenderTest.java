package com.smt.kata.game;

// JDK 11.x
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: FavoriteDrinksTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Favorite Drinks kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 1, 2021
 * @updates:
 ****************************************************************************/
class LazyBartenderTest {
	
	// Members
	private LazyBartender fd = new LazyBartender();

	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesNull() throws Exception {
		assertEquals(0, fd.minimumTypes(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesEmpty() throws Exception {
		assertEquals(0, fd.minimumTypes(new HashMap<>()));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesOneRow() throws Exception {
		Map<Integer, List<Integer>> drinks = new HashMap<>();
		drinks.put(Integer.valueOf(0), Arrays.asList(0,1,3,6,8));
		assertEquals(1, fd.minimumTypes(drinks));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesSingle() throws Exception {
		Map<Integer, List<Integer>> drinks = new HashMap<>();
		drinks.put(Integer.valueOf(0), Arrays.asList(0,1,3,6,8));
		drinks.put(Integer.valueOf(1), Arrays.asList(1,4,7,8));
		drinks.put(Integer.valueOf(2), Arrays.asList(2,4,7,5,8));
		drinks.put(Integer.valueOf(3), Arrays.asList(3,2,5,8));
		drinks.put(Integer.valueOf(4), Arrays.asList(5,8));
		assertEquals(1, fd.minimumTypes(drinks));
	}

	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesExampleOne() throws Exception {
		Map<Integer, List<Integer>> drinks = new HashMap<>();
		drinks.put(Integer.valueOf(0), Arrays.asList(0,1,3,6));
		drinks.put(Integer.valueOf(1), Arrays.asList(1,4,7));
		drinks.put(Integer.valueOf(2), Arrays.asList(2,4,7,5));
		drinks.put(Integer.valueOf(3), Arrays.asList(3,2,5));
		drinks.put(Integer.valueOf(4), Arrays.asList(5,8));
		assertEquals(2, fd.minimumTypes(drinks));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesAllDrinks() throws Exception {
		Map<Integer, List<Integer>> drinks = new HashMap<>();
		drinks.put(Integer.valueOf(0), Arrays.asList(0));
		drinks.put(Integer.valueOf(1), Arrays.asList(2));
		drinks.put(Integer.valueOf(2), Arrays.asList(5));
		drinks.put(Integer.valueOf(3), Arrays.asList(6));
		drinks.put(Integer.valueOf(4), Arrays.asList(7));
		assertEquals(5, fd.minimumTypes(drinks));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.LazyBartender#minimumTypes()}.
	 */
	@Test
	void testMinimumTypesSomeDrinks() throws Exception {
		Map<Integer, List<Integer>> drinks = new HashMap<>();
		drinks.put(Integer.valueOf(0), Arrays.asList(0,1));
		drinks.put(Integer.valueOf(1), Arrays.asList(2,3,4));
		drinks.put(Integer.valueOf(2), Arrays.asList(5));
		drinks.put(Integer.valueOf(3), Arrays.asList(6));
		drinks.put(Integer.valueOf(4), Arrays.asList(7,8));
		assertEquals(5, fd.minimumTypes(drinks));
	}
}
