package com.smt.kata.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * The Berlin Clock (Mengenlehreclock or Berlin Uhr) is a clock that tells the
 * time using a series of illuminated coloured blocks, as you can see in the
 * picture for this project.
 * 
 * https://agilekatas.co.uk/img/katas/kata_berlinclock.png
 * 
 * The top lamp blinks to show seconds- it is illuminated on even seconds (R)
 * and off on odd seconds (0).
 * 
 * The next two rows represent hours (R). The upper row represents 5 hour blocks
 * and is made up of 4 red lamps, off being (0). The lower row represents 1 hour
 * blocks and is also made up of 4 red lamps (R), off being (0).
 * 
 * The final two rows represent the minutes (Y). The upper row represents 5
 * minute blocks, and is made up of 11 lamps- every third lamp is red (R), the
 * rest are yellow (Y) or off (0). The bottom row represents 1 minute blocks,
 * and is made up of 4 yellow(Y) lamps, off being (0).
 * 
 * Requirements:
 * 
 * Input should be validated that it meets a 24H digital time format between
 * 00:00:00 through 23:59:59
 * 
 * GenerateTime should return a String representing
 * {sec}{5Hours}{1Hours}{5Minutes}{1Minute} Methods should return null if
 * invalid.
 * 
 * Examples:
 * 
 * Time 		Clock 
 * 00:00:00 	YOOOOOOOOOOOOOOOOOOOOOOO
 * 23:59:59		ORRRRRRROYYRYYRYYRYYYYYY
 * 16:50:06		YRRROROOOYYRYYRYYRYOOOOO
 * 11:37:01		ORROOROOOYYRYYRYOOOOYYOO
 * 
 * -01:00:00	null
 * 24:00:00		null
 * 23:59:60		null
 * 23:60:59		null
 * aa:bb:cc		null
 * 
 * @author raptor
 *
 */
public class BerlinClock {

	/**
	 * As a clock user I want to be able to see an entire clock So that I can tell
	 * what time it is at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateTime(String time) {		
		if (getTime(time) == null) return null;
		return generateSeconds(time) + generateFiveHoursRow(time) + generateSingleHoursRow(time) + generateFiveMinutesRow(time) + generateSingleMinutesRow(time);
	}

	/**
	 * As a clock user I want to be able to see single minutes So that I can
	 * accurately tell the time down to the minute
	 * 
	 * @param time
	 * @return
	 */
	public String generateSingleMinutesRow(String time) {
		var clock = getTime(time);
		if (clock == null) return null;
		var mins = Integer.parseInt(clock.split(":")[1]);
		var r = mins % 5;
		var singleMins = "";
		for (var i = 0; i < 4; ++i) {
			if (i < r) singleMins += "Y";
			else singleMins += "0";		
		}
		
		return singleMins;
	}

	/**
	 * As a clock user I want to be able to see five minutes So that I can tell
	 * higher minute amounts more easily at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateFiveMinutesRow(String time) {
		var clock = getTime(time);
		if (clock == null) return null;
		var mins = Integer.parseInt(clock.split(":")[1]);
		var r = mins / 5;
		var fiveMins = "";
		for (var i = 0; i < 11; ++i) {
			if (i % 3 == 2 && i < r) fiveMins += "R";
			else if (i < r) fiveMins += "Y";
			else fiveMins += "0";		
		}
		
		return fiveMins;
	}

	/**
	 * As a clock user I want to be able to see single hours So that I can tell what
	 * hour it is
	 * 
	 * @param time
	 * @return
	 */
	public String generateSingleHoursRow(String time) {
		var clock = getTime(time);
		if (clock == null) return null;
		
		var hours = Integer.parseInt(clock.split(":")[0]);
		
		var r = hours % 5;
		var singleHours = "";
		for (var i = 0; i < 4; ++i)
			if (i < r) singleHours += "R";
			else singleHours += "0";	
		
		return singleHours;
	}

	/**
	 * As a clock user I want to be able to see five hours So that I can tell higher
	 * hour amounts more easily at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateFiveHoursRow(String time) {
		var clock = getTime(time);
		if (clock == null) return null;
		var hours = Integer.parseInt(clock.split(":")[0]);
		
		var r = hours / 5;
		var fiveHours = "";
		for (var i = 0; i < 4; ++i)
			if (i < r) fiveHours += "R";
			else fiveHours += "0";		
		
		return fiveHours;
	}

	/**
	 * As a clock user I want to be able to see seconds passing So that I can see if
	 * my clock is working at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateSeconds(String time) {
		var clock = getTime(time);
		if (clock == null) return null;
		return (Integer.parseInt(clock.split(":")[2]) % 2 == 0) ? "Y" : "0";
	}
	
	private String getTime(String time) {
		var clock = LocalTime.now();
		try {
			clock = LocalTime.parse(time);
		}
		catch (Exception e) {
			return null;
		}
		var result = clock.toString();
		if (result.length() < 8)
			result += ":00";
		return result;
	}
}
