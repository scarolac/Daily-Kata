package com.smt.kata.time;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: MostOccurringWeekday.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Most-Occurring Weekdays in a Year
 * 
 * Find the weekdays that occur the most in a given year.
 * 
 * Write a function MostOccurringWeekday that takes an integer representing a 
 * year as input and returns a list of the most-occurring weekdays throughout that year.
 * 
 * =MostOccurringWeekday[2018]
 * {Monday}
 * 
 * MostOccurringWeekday[2009]
 * {Thursday}
 * 
 * Multiple weekdays occurred the most in 2012:
 * 
 * MostOccurringWeekday[2012]
 * {Sunday, Monday}
 * 
 * ******** Note: Be careful.  Dates may be negative (IE, BC dates)
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 10, 2021
 * @updates:
 ****************************************************************************/
public class MostOccurringWeekday {
	/**
	 * Enum for the day of the week
	 */
	public enum WeekDay {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	/**
	 * Calculates the most occurring week day fo rthe given year 
	 * @param year Year to calculate against
	 * @return Collection of weekdays
	 */
	public List<WeekDay> calculate(int year) {
	
		// Return the collection of most occurring
		return new ArrayList<>();
	}

}
