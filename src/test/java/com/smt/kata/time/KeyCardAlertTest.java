package com.smt.kata.time;

// JDK 11.x
import java.util.List;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: KeyCardAlertTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for Key Card Alert Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2022
 * @updates:
 ****************************************************************************/
class KeyCardAlertTest {
	
	// Members
	private KeyCardAlert kca = new KeyCardAlert();
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindMismatchedCountTime() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis","luis"}, 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00"});
		
		assertEquals(0, results.size());
	}

	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindMismatchedCountName() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis"}, 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00", "14:00"});
		
		assertEquals(0, results.size());
	}

	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindNullNames() throws Exception {
		List<String> results = kca.find(
				null, 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00", "14:00"});
		
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindEmptyNames() throws Exception {
		List<String> results = kca.find(
				new String[0], 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00", "14:00"});
		
		assertEquals(0, results.size());
	}
	

	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindNullTime() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis","luis"}, 
				null);
		
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindEmptyTime() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis","luis"}, 
				new String[] {});
		
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis","luis"}, 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"});
		
		assertEquals(1, results.size());
		assertTrue(results.contains("daniel"));
	}

	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		List<String> results = kca.find(
				new String[] {"alice","alice","alice","bob","bob","bob","bob"}, 
				new String[] {"12:01","12:00","18:00","21:00","21:20","21:30","23:00"});
		
		assertEquals(1, results.size());
		assertTrue(results.contains("bob"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel","luis","luis","luis","luis", "james", "james", "james", "james"}, 
				new String[] {"10:00","10:40","11:00","09:00","11:00","13:00","15:00", "10:00","10:20", "10:40","11:00"});
		
		assertEquals(2, results.size());
		assertTrue(results.contains("daniel"));
		assertTrue(results.contains("james"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindOneUserMatch() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel"}, 
				new String[] {"10:00","10:40","11:00"});
		
		assertEquals(1, results.size());
		assertTrue(results.contains("daniel"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.time.KeyCardAlert#find(java.lang.String[], java.lang.String[])}.
	 */
	@Test
	void testFindOneUserNoMatch() throws Exception {
		List<String> results = kca.find(
				new String[] {"daniel","daniel","daniel"}, 
				new String[] {"10:00","11:02","11:10"});
		
		assertEquals(0, results.size());
	}
}
