package com.smt.kata.time;

import com.siliconmtn.data.text.StringUtil;

/****************************************************************************
 * <b>Title</b>: DegreesOfTime.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Degrees of Time
 * 
 * Given a clock time in hh:mm format, determine, to the nearest degree, the angle 
 * in degrees, between the hour and the minute hands.  The hour will be in 24 hour format.
 * 
 * Example One:
 * Input : 01:05
 * Output: 0 degrees as the hands are in the same location
 * 
 * Example two
 * Input: 00:15
 * Output: 90 degrees as the hour hand is vertical and the minute had is at 90 gegrees
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 10, 2021
 * @updates:
 ****************************************************************************/
public class DegreesOfTime {

	/**
	 * Calculate the difference in degrees for the provided time
	 * @param time Time to calculate in hh:mm 24 hour format
	 * @return difference in degrees between the minute and hour hand.  0 if invalid data
	 */
	public int calculate(String time) {
		if (StringUtil.isEmpty(time) || !time.contains(":")) 
			return 0;
		var split = time.split(":");
		var first = split[0];
		var second = split[1];
		if (! isNumber(first) || !isNumber(second)) 
			return 0;
		var hours = Integer.parseInt(first);
		var mins = Integer.parseInt(second);
		if (hours < 0 || hours > 24 || mins < 0 || mins > 59 || hours == mins) 
			return 0;
		
		hours %= 12;
		hours *= 30;
		mins *= 6;
		
		return Math.abs(hours - mins);
	}
	
	private boolean isNumber(String phrase) {
		try {
			Integer.parseInt(phrase);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
