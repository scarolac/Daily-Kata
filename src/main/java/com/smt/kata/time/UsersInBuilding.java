package com.smt.kata.time;

// JDK 11.x
import java.util.Date;

/****************************************************************************
 * <b>Title</b>: UsersInBuilding.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Users In Building
 * You are given a list of data entries that represent entries and exits of groups 
 * of people into a building. An entry looks like this:
 * 
 * {"date": 1526579928, count: 3, "type": "enter"}
 * 
 * This means 3 people entered the building. An exit looks like this:
 * 
 * {"date": 1526580382, count: 2, "type": "exit"}
 * 
 * This means that 2 people exited the building. date is in entry time.
 * 
 * Find the busiest period in the building, that is, the time with the most people 
 * in the building. Return it as response object (start, end, count). You can assume 
 * the building always starts off and ends up empty, i.e. with 0 people inside.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
public class UsersInBuilding {

	protected enum EntryType { ENTER, EXIT }
	
	/**
	 * Initializes the counts and transactions
	 */
	public UsersInBuilding() {
		super();
	}

	/**
	 * Adds an entry of users entering or exiting the 
	 * @param entryTime Time of the transaction
	 * @param count Number of people 
	 * @param type Entering or exiting the building
	 */
	public void addEntry(Date entryTime, int count, EntryType type) {
		/** Add something here **/
	}
	
	/**
	 * Calculates the busy period for the day
	 * @return
	 */
	public Response getBusyPeriod() {
		return new Response();
	}

	/**
	 * Simple object to hold the response
	 */
	class Response {
		Date start;
		Date end;
		int count = 0;
		public Date getStart() { return start;}
		public Date getEnd() { return end; }
		public int getCount() { return count; }
	}
}
