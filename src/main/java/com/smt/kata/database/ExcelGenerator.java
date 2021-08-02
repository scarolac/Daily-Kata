package com.smt.kata.database;

// JDK 11.x
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Apache Commons 3.x
import org.apache.commons.lang3.StringUtils;

import com.siliconmtn.data.report.ExcelReport;

/****************************************************************************
 * <b>Title</b>: ExcelGenerator.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> In this kata, we will be querying the WC contact submittal and
 * generating a report for each contact form for a given organization.  
 * 
 * You will be utilizing the ExcelRport class in the spacelibs project
 * (import com.siliconmtn.data.report.ExcelReport) to generate the excel spreadsheet.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 29, 2021
 * @updates:
 ****************************************************************************/
public class ExcelGenerator {
	// Members
	protected Connection conn;
	
	/**
	 * 
	 */
	public ExcelGenerator(Connection conn) {
		super();
		this.conn = conn;
	}
	
	/**
	 * 
	 * @param actionGroupId
	 * @return
	 * @throws IOException
	 * @throws SQLException
	 */
	public byte[] getContactReport(String actionGroupId) throws IOException, SQLException {

		//need headers, form fields
		// need data, form answers
		// sheet name is groupId
		
//		ExcelReport output = new ExcelReport(headers);
//		output.setFileName(actionGroupId);
//		output.setData(rows);
//		return output.generateReport();
		return new byte[0];
	}
	
	/**
	 * Gets the list of contact forms by action_group_id and the number of records  
	 * submitted per form for all forms that have had at least one submittal
	 * @param orgId Organization ID to filter
	 * @return Map of action_group_id and count(*) of items
	 * @throws SQLException 
	 */
	public Map<String, Integer> getContactCountByOrganization(String orgId) 
	throws SQLException {
		if (StringUtils.isEmpty(orgId)) throw new SQLException("Organization ID is required");
		Map<String, Integer> data = new LinkedHashMap<>();
		
		var sql = "select sa.action_group_id, count(sa.action_id) "
				+ "from sb_action sa "
				+ "join contact c on sa.action_id = c.action_id "
				+ "join contact_submittal cs on c.action_id = cs.action_id "
				+ "where sa.organization_id = ? "
				+ "group by sa.action_id "; 
		
		try (var preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setObject(1, orgId);
			
			var queryResult = preparedStatement.executeQuery();
			
			while (queryResult.next()) 
				data.put(queryResult.getString("action_group_id"), queryResult.getInt("count"));			
		}
		
		return data;
	}
}
