package com.smt.kata.time;

/****************************************************************************
 * <b>Title</b>: CorretTheTime.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Correct the Time.  You have to create a method, 
 * that corrects a given time string.  There was a problem in addition, 
 * so many of the time strings are broken.
 * Time is formatted using the 24-hour clock, so from 00:00:00 to 23:59:59:
 * Examples
 * "09:10:01" -> "09:10:01"  
 * "11:70:10" -> "12:10:10"  
 * "19:99:99" -> "20:40:39"  
 * "24:01:01" -> "00:01:01" 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 24, 2021
 * @updates:
 ****************************************************************************/
public class CorrectTheTime {

	/**
	 * 
	 */
	public CorrectTheTime() {
		super();
	}

	public String transform(String time) {
		if (time == null)
			return "";

		final int HOURS = 24;
		final int SIXTY = 60;

		var times = time.split(":");
		int seconds = Integer.parseInt(times[2]);
		int minutes = Integer.parseInt(times[1]);
		int hours = Integer.parseInt(times[0]);

		if (seconds >= SIXTY) {
			seconds %= SIXTY;
			minutes++;
		}

		if (minutes >= SIXTY) {
			minutes %= SIXTY;
			hours++;
		}
		if (hours >= HOURS)
			hours %= HOURS;

		return ((hours < 10) ? "0" + hours : hours) + ":" + 
			((minutes < 10) ? "0" + minutes : minutes) + ":" + 
			((seconds < 10) ? "0" + seconds : seconds);
	}
}
