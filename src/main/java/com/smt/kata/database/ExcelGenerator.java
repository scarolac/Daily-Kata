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
		var data = buildDataRows(actionGroupId);
		
		var report = new ExcelReport(headers);
		report.setFileName(actionGroupId);
		report.setData(data);
		return report.generateReport();
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
			
			var resultSet = preparedStatement.executeQuery();
		
			while (resultSet.next()) 
				result.put(resultSet.getString("contact_field_id"), resultSet.getString("field_nm"));
			
		}

		return result;
	}
	
	protected List<Map<String, Object>> buildDataRows(String actionGroupId) throws SQLException {
		var data = new ArrayList<Map<String, Object>>();
		var row = new HashMap<String, Object>();
		
		var sql = "select sa.action_nm, cs.contact_submittal_id, cs.profile_id, cf.contact_field_id, cf.field_nm, cf.profile_column_nm, substring(cd.value_txt,0,128) as value_txt, "
				+ "p.first_nm, p.MIDDLE_NM, p.last_nm, p.first_nm + ' ' + p.last_nm as combinedName, p.email_address_txt, p.PREFIX_NM,  p.SUFFIX_NM, "
				+ "ADDRESS_TXT, ADDRESS2_TXT, CITY_NM, STATE_CD, ZIP_CD, mobile.phone_number_txt as MOBILE_PHONE_TXT, home.phone_number_txt as MAIN_PHONE_TXT, "
				+ "GENDER_CD, BIRTH_DT, BEST_TIME_TXT, COUNTRY_CD, profile_column_nm "
				+ "from contact c "
				+ "left join contact_submittal cs on c.action_id = cs.action_id "
				+ "left join sb_action sa on c.action_id = sa.action_id "
				+ "left join contact_assoc ca on ca.action_id = c.action_id "
				+ "left join contact_field cf on ca.contact_field_id =cf.contact_field_id "
				+ "left join contact_data cd on cd.contact_submittal_id = cs.contact_submittal_id and cf.contact_field_id = cd.contact_field_id "
				+ "left join profile p on p.profile_id = cs.profile_id "
				+ "left join profile_address pa on p.profile_id = pa.profile_id "
				+ "left join phone_number home on p.profile_id = home.profile_id and home.phone_type_cd = 'HOME' "
				+ "left join phone_number mobile on p.profile_id = mobile.profile_id and mobile.phone_type_cd = 'MOBILE' "
				+ "where sa.action_group_id = ? "
				+ "order by cs.contact_submittal_id, ca.order_no asc";
		
		try (var preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setObject(1, actionGroupId);
			
			var resultSet = preparedStatement.executeQuery();
			
			final var SUBMITTAL_ID = "contact_submittal_id";
			var submittalId = "";
			while (resultSet.next()) {
				if (! StringUtils.isEmpty(submittalId) && ! submittalId.equals(resultSet.getString(SUBMITTAL_ID))) {
					data.add(row);
					row = new HashMap<String, Object>();					
				}
				if (resultSet.getString("profile_column_nm") != null)
					row.put(resultSet.getString("profile_column_nm"), resultSet.getString(resultSet.getString("profile_column_nm")));
				else
					row.put(resultSet.getString("contact_field_id"), resultSet.getObject("value_txt"));
				submittalId = resultSet.getString(SUBMITTAL_ID);
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
			
			var resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) 
				data.put(resultSet.getString("action_group_id"), resultSet.getInt("count"));			
		}
		
		return data;
	}
}
