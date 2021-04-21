package com.smt.kata.weather;

// JDK 11.x
import java.io.Serializable;
import java.util.Date;

/****************************************************************************
 * <b>Title:</b> SunriseSunsetCalculator.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> In this Kata, you will call out to a json api and format it into 
 * a data structure and return the data structure.  You will use the Gson json classes
 * to deserialize the response from a json object into a SunriseSunsetVO object
 * 
 * You may use the SMTHttpConnectionManager for the API calls
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 20, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class SunriseSunsetCalculator {

	/**
	 * Base url for the sunrise sunset calculator
	 */
	public static final String SUNRISE_SUNSET_URL = "https://api.sunrise-sunset.org/json?";
	protected String status;
	
	/**
	 * 
	 */
	public SunriseSunsetCalculator() {
		super();
	}
	
	/**
	 * 
	 * @param date
	 * @param lat
	 * @param lng
	 * @throws IOException 
	 */
	public SunriseSunsetCalculator(Date date, double lat, double lng) {
		super();
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

}

/**
 *  Inner Class data structure
 */
class SunriseSunsetVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1711126471696728890L;

}
