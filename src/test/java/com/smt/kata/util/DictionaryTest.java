package com.smt.kata.util;

// Junit 5
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.Set;
import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: DictionaryTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> test for the dictionary class
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 3, 2021
 * @updates:
 ****************************************************************************/
class DictionaryTest {
	
	// Members
	private Dictionary dict;
	
	@BeforeEach
	void setUpBeforeEach() throws Exception {
		dict = new Dictionary();
	}

	/**
	 * Tests the constructor
	 */
	@Test
	void test() {
		assertNotNull(dict);
	}

	/**
	 * Validates that the dictionary can be loaded from the file
	 * @throws Exception
	 */
	@Test
	void testGetDictionary() throws Exception {
		Set<String> dictSet = dict.getDictionary();
		
		assertEquals(466551, dictSet.size());
		assertTrue(dictSet.contains("the"));
		assertTrue(dictSet.contains("following"));
		assertTrue(dictSet.contains("words"));
		assertTrue(dictSet.contains("exist"));
	}
	
	/**
	 * Validates that the dictionary can be loaded from the file
	 * @throws Exception
	 */
	@Test
	void testGetDictionaryArray() throws Exception {
		String[] dictArray = dict.getDictionaryArray();
		assertEquals(466551, dictArray.length);
		assertTrue(Arrays.stream(dictArray).anyMatch("the"::equals));
		assertTrue(Arrays.stream(dictArray).anyMatch("following"::equals));
		assertTrue(Arrays.stream(dictArray).anyMatch("words"::equals));
		assertTrue(Arrays.stream(dictArray).anyMatch("exist"::equals));
	}
}
