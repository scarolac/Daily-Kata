package com.smt.kata.database;

// JDK 11.x
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: DatabaseQuery.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 27, 2021
 * @updates:
 ****************************************************************************/
public class DatabaseQuery {

	// Memebrs 
	protected Connection conn;
	
	/**
	 * Inits the class
	 * @param conn Database connection object
	 */
	public DatabaseQuery(Connection conn) {
		super();
		this.conn = conn;
	}

	/**
	 * Executes the sql query using the sql statement and the applied parameters
	 * @param sql SQL statement to execute
	 * @param params Prepared statements for the sql query
	 * @return Collection of row data (as a map of column names and values)
	 * @throws SQLException
	 */
	public List<Map<String, Object>> execute(String sql, List<Object> params) throws SQLException {
		return new ArrayList<>();
	}
}
