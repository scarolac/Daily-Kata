package com.smt.kata.database;

// JDK 11.x
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: DatabaseIntro.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Database Intro
 * This kata is designed to provide a basic understanding of database connections 
 * and queries in java.  This class has 2 methods that must be configured.  The first
 * is designed to teach you how to load meta data information form the database.
 * The second method is designed to help you pull data from the database using 
 * SQL packages
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 26, 2021
 * @updates:
 ****************************************************************************/
public class DatabaseIntro {
	
	// Members
	protected Connection conn;

	/**
	 * Initializes the class with the database connection
	 * @param dbConn
	 */
	public DatabaseIntro(Connection conn) throws SQLException {
		super();
		this.conn = conn;
	}

	/**
	 * Retrieves the metadata for the provided column
	 * @param tableName Table to retrieve metadata
	 * @return Map with the column name as the key and ther java data type as the value
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Map<String, String> getTableMetaData(String tableName) throws SQLException {
		var result = new HashMap<String, String>();

		try (var preparedStatement = conn.prepareStatement("select * from " + tableName)) {
			var resultSet = preparedStatement.executeQuery();
			var resultMeta = resultSet.getMetaData();

			for (var i = 1; i <= resultMeta.getColumnCount(); ++i)
				result.put(resultMeta.getColumnName(i), resultMeta.getColumnClassName(i));
		}

		return result;
	}
	
	/**
	 * Loads a the data elements from the provided table
	 * @param tableName Table to retrieve it's data
	 * @return Collection of key values for each row.  The map has the column name
	 * as the key and the value for each row as the value
	 */
	public List<Map<String, Object>> retrieveDataFromTable(String tableName) throws SQLException {
		var result = new ArrayList<Map<String, Object>>();

		try (var preparedStatement = conn.prepareStatement("select * from " + tableName)) {
			var resultSet = preparedStatement.executeQuery();
			var resultMeta = resultSet.getMetaData();

			while (resultSet.next()) {
				var row = new HashMap<String, Object>();
				
				for (var i = 1; i <= resultMeta.getColumnCount(); ++i)
					row.put(resultMeta.getColumnName(i), resultSet.getObject(resultMeta.getColumnName(i)));
				
				result.add(row);
			}
		}

		return result;
	}
}
