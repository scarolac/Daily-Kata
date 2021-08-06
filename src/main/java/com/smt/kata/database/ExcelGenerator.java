package com.smt.kata.database;

// JDK 11.x
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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
		
		var headers = buildHeaderMap(actionGroupId);
//		System.out.println(headers);
		var rows = buildDataRows(actionGroupId);
		
		var output = new ExcelReport(headers);
		output.setFileName(actionGroupId);
		output.setData(rows);
		return output.generateReport();
	}
	
	protected Map<String, String> buildHeaderMap(String actionGroupId) throws SQLException {
		var result = new HashMap<String, String>();
		
		var sql = "select cf.contact_field_id, cf.field_nm "
				+ "from contact_field cf "
				+ "join contact_assoc ca on cf.contact_field_id = ca.contact_field_id "
				+ "join contact c on ca.action_id = c.action_id "
				+ "join sb_action sa on c.action_id = sa.action_id "
				+ "where sa.action_group_id = ? ";
		
		try (var preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setObject(1, actionGroupId);
			
			var queryResult = preparedStatement.executeQuery();
			
			while (queryResult.next()) {
				result.put(queryResult.getString("contact_field_id"), queryResult.getString("field_nm"));
				result.put("field_nm", "question");
			}
		}

		return result;
	}
	
	protected List<Map<String, Object>> buildDataRows(String actionGroupId) throws SQLException {
		var data = new ArrayList<Map<String, Object>>();
		var row = new HashMap<String, Object>();
		
		var sql = "select cd.contact_submittal_id, cd.contact_field_id, substring(cd.value_txt,0,128) as value_txt, "
				+ "p.first_nm, p.last_nm, p.email_address_txt, pa.city_nm, pa.state_cd, "
				+ "pa.address_txt, pa.zip_cd, pn.phone_number_txt, cs.create_dt "
				+ "from sb_action sa "
				+ "join contact_submittal cs on cs.action_id = sa.action_id "
				+ "join contact_data cd on cs.contact_submittal_id = cd.contact_submittal_id "
				+ "join profile p on cs.profile_id = p.profile_id "
				+ "join profile_address pa on p.profile_id = pa.profile_id "
				+ "join phone_number pn on p.profile_id = pn.profile_id "
				+ "where sa.action_group_id = ? "
				+ "order by cs.contact_submittal_id";
		
		try (var preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setObject(1, actionGroupId);
			
			var queryResult = preparedStatement.executeQuery();
			
			final var SUBMITTAL_ID = "contact_submittal_id";
			var submittalId = "";
			while (queryResult.next()) {
				if (! StringUtils.isEmpty(submittalId) && ! submittalId.equals(queryResult.getString(SUBMITTAL_ID))) {
					data.add(row);
					row = new HashMap<String, Object>();
					row.put("first_nm", queryResult.getString("first_nm"));
					row.put("last_nm", queryResult.getString("last_nm"));
					row.put("email_address_txt", queryResult.getObject("email_address_txt"));
					row.put("", queryResult.getString(""));
				}
				row.put(queryResult.getString("contact_field_id"), queryResult.getObject("value_txt"));
				submittalId = queryResult.getString(SUBMITTAL_ID);
//				System.out.println(row);
			}
			data.add(row);
		}
		
		return data;
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
				+ "join contact_submittal cs on sa.action_id = cs.action_id "
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
