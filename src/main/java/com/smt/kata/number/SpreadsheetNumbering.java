package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: SpreadsheetNumbering.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Spreadsheet Numbering
 * Spreadsheets often use this alphabetical encoding for its columns: "A", "B", 
 * "C", ..., "AA", "AB", ..., "ZZ", "AAA", "AAB", ....
 * 
 * Given a column number, return its alphabetical column id. For example, given 1, 
 * return "A". Given 27, return "AA".
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 10, 2021
 * @updates:
 ****************************************************************************/
public class SpreadsheetNumbering {

	/**
	 * Converts the number provided to the excel column labels
	 * @param col Decimal column number
	 * @return Excel column heading
	 */
	public String getColumnLabel(int col) {
		var result = new StringBuilder();		
		while (col > 0) {
			var mod = col % 26;
			if (mod == 0) {
				result.append("Z");
				col = (col / 26) - 1;
			} else {
				result.append(letter(mod));
				col /= 26;	
			}				
		}
		
		return result.reverse().toString();
	}
	
	private String letter(int val) {
		return ((char)((val - 1) + 'A')) + "";
	}
}
