package com.smt.kata.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
// JDK 11.x
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	/**
	 * Calculates the most occurring week day fo rthe given year 
	 * @param year Year to calculate against
	 * @return Collection of weekdays
	 */
	public List<WeekDay> calculate(int year) {
		var start = LocalDate.of(year, Month.JANUARY, 1); 
		var end = LocalDate.of(year + 1, Month.JANUARY, 1);
		Map<DayOfWeek, Long> counts = start.datesUntil(end).collect(Collectors.groupingBy(LocalDate::getDayOfWeek, Collectors.counting()));

		// Return the collection of most occurring
		return buildList(counts);
	}
	private List<WeekDay> buildList(Map<DayOfWeek, Long> counts) {
		List<WeekDay> days = new ArrayList<>();
		long largest = 0;
		for(var entry : counts.entrySet()) {
			if(entry.getValue() > largest) {
				largest = entry.getValue();
				days = new ArrayList<>();
				days.add(WeekDay.valueOf(entry.getKey().toString()));
			}
			else if (entry.getValue() == largest)
				days.add(WeekDay.valueOf(entry.getKey().toString()));
		}
		
		return days;
	}
	
}
