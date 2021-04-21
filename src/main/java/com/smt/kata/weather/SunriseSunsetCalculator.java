package com.smt.kata.weather;

import java.io.IOException;
// JDK 11.x
import java.io.Serializable;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.siliconmtn.io.http.SMTHttpConnectionManager;
import com.siliconmtn.io.http.SMTHttpConnectionManager.HttpConnectionType;

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
	private SunriseSunsetVO results;
	
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
	public SunriseSunsetCalculator(Date date, double lat, double lng) throws IOException {
		SMTHttpConnectionManager connection = new SMTHttpConnectionManager();
		String url = String.format("%slat=%f&lng=%f&date=%s", SUNRISE_SUNSET_URL, lat, lng, date.toString()); 
		byte[] response = connection.getRequestData(url, null, HttpConnectionType.GET);
		
		Gson gson = new Gson();
		SunriseSunsetCalculator calc = gson.fromJson(new String(response), SunriseSunsetCalculator.class);
		this.results = calc.getResults();
		this.status = calc.getStatus();
	}
	
	/**
	 * @return the status
	 * @throws IOException 
	 */
	public String getStatus() {
		return status;
	}
	
	public SunriseSunsetVO getResults() {
		return results;
	}	

}

/**
 *  Inner Class data structure
 */
class SunriseSunsetVO implements Serializable {
	
	private static final long serialVersionUID = -1711126471696728890L;
	private String sunrise;
	private String sunset;
	@SerializedName(value = "solar_noon", alternate = "solarNoon")
	private String solarNoon;
	@SerializedName(value = "day_length", alternate = "dayLength")
	private String dayLength;
	@SerializedName(value = "civil_twilight_begin", alternate = "civilTwilightBegin")
	private String civilTwilightBegin;
	@SerializedName(value = "civil_twilight_end", alternate = "civilTwilightEnd")
	private String civilTwilightEnd;
	@SerializedName(value = "nautical_twilight_begin", alternate = "nauticalTwilightBegin")
	private String nauticalTwilightBegin;
	@SerializedName(value = "nautical_twilight_end", alternate = "nauticalTwilightEnd")
	private String nauticalTwilightEnd;
	@SerializedName(value = "astronomical_twilight_begin", alternate = "astronomicalTwilightBegin")
    private String astronomicalTwilightBegin;
	@SerializedName(value = "astronomical_twilight_end", alternate = "astronomicalTwilightEnd")
    private String astronomicalTwilightEnd;
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getSolarNoon() {
		return solarNoon;
	}
	public void setSolarNoon(String solarNoon) {
		this.solarNoon = solarNoon;
	}
	public String getDayLength() {
		return dayLength;
	}
	public void setDayLength(String dayLength) {
		this.dayLength = dayLength;
	}
	public String getCivilTwilightBegin() {
		return civilTwilightBegin;
	}
	public void setCivilTwilightBegin(String civilTwilightBegin) {
		this.civilTwilightBegin = civilTwilightBegin;
	}
	public String getCivilTwilightEnd() {
		return civilTwilightEnd;
	}
	public void setCivilTwilightEnd(String civilTwilightEnd) {
		this.civilTwilightEnd = civilTwilightEnd;
	}
	public String getNauticalTwilightBegin() {
		return nauticalTwilightBegin;
	}
	public void setNauticalTwilightBegin(String nauticalTwilightBegin) {
		this.nauticalTwilightBegin = nauticalTwilightBegin;
	}
	public String getNauticalTwilightEnd() {
		return nauticalTwilightEnd;
	}
	public void setNauticalTwilightEnd(String nauticalTwilightEnd) {
		this.nauticalTwilightEnd = nauticalTwilightEnd;
	}
	public String getAstronomicalTwilightBegin() {
		return astronomicalTwilightBegin;
	}
	public void setAstronomicalTwilightBegin(String astronomicalTwilightBegin) {
		this.astronomicalTwilightBegin = astronomicalTwilightBegin;
	}
	public String getAstronomicalTwilightEnd() {
		return astronomicalTwilightEnd;
	}
	public void setAstronomicalTwilightEnd(String astronomicalTwilightEnd) {
		this.astronomicalTwilightEnd = astronomicalTwilightEnd;
	}	
}
