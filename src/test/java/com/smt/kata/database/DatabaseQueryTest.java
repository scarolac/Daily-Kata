package com.smt.kata.database;

// JDK 11.x
import java.util.List;
import java.util.Map;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Kata Libs
import com.smt.kata.database.util.DBConnection;

/****************************************************************************
 * <b>Title</b>: DatabaseQueryTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the DatabaseQuery Class.  That class has a single 
 * method that dynamically executes a query and returns the data,  This unit test 
 * will pass the query to the databse query and get the matching results
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 27, 2021
 * @updates:
 ****************************************************************************/
class DatabaseQueryTest {
	
	// Members
	DBConnection dbConn;
	DatabaseQuery dq;
	
	// Database members
	private static final String URL = "jdbc:postgresql://dev-common-sb-db.aws.siliconmtn.com:5432/columbiad_marathon?defaultRowFetchSize=25&amp;prepareThreshold=3";
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String USER = "columbiad_user";
	private static final String PASSWORD = "sqll0gin";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	protected void setUpBeforeMethods() throws Exception {
		dbConn = new DBConnection(USER, PASSWORD, DRIVER, URL);
		dq = new DatabaseQuery(dbConn.getConnection());
	}

	/**
	 * Test method for {@link com.smt.kata.database.DatabaseQuery#execute(java.lang.String, java.util.List)}.
	 * 
	 * --- Execute a query to return all of the records form the ezform table
	 */
	@Test
	void testExecuteStar() throws Exception {
		String sql = "--- Fill Me out ---";
		
		List<Map<String, Object>> data = dq.execute(sql, null);
		assertEquals(12, data.size());
	}

	/**
	 * Test method for {@link com.smt.kata.database.DatabaseQuery#execute(java.lang.String, java.util.List)}.
	 * 
	 * --- Execute a query to return a count of all of the records in the ezform table
	 */
	@Test
	void testExecuteCountStar() throws Exception {
		String sql = "--- Fill Me out ---";
		
		List<Map<String, Object>> data = dq.execute(sql, null);
		assertEquals(12, data.size());
	}

	/**
	 * Test method for {@link com.smt.kata.database.DatabaseQuery#execute(java.lang.String, java.util.List)}.
	 * 
	 * --- Execute a query to the number of options for each question text that is 
	 * the same
	 */
	@Test
	void testExecuteOptionsPerQuestion() throws Exception {
		String sql = "--- Fill Me out ---";
		List<Map<String, Object>> data = dq.execute(sql, null);
		assertEquals(21, data.size());
		assertEquals(630, data.size());
		assertEquals(7, data.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.database.DatabaseQuery#execute(java.lang.String, java.util.List)}.
	 * 	 * 
	 * --- Execute a query to the number of options for each question text that is 
	 * the same.  Filter the query by the provided UUID
	 */
	@Test
	void testExecuteOptionsPerQuestionFilterByForm() throws Exception {
		//String uuid = "477396fc-8e71-4775-8474-43a171a0e574";
		String sql = "--- Fill Me out ---";
		List<Map<String, Object>> data = dq.execute(sql, null);
		assertEquals(20, data.size());
		assertEquals(90, data.size());
		assertEquals(2, data.size());
	}
}
