package com.smt.kata.weather;

import java.io.IOException;
// JDK 11.x
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
	private SMTHttpConnectionManager connection;
	private String response;
	private JsonElement results;
	private SunriseSunsetVO sunVo;
	
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
		connection = new SMTHttpConnectionManager();
		Map<String, String> headers = new HashMap<>();
		headers.put("Host", "api.sunrise-sunset.org");
		connection.setHeaderMap(headers);
		String url = SUNRISE_SUNSET_URL + "lat=" + lat + "&lng=" + lng + "&date=" + date; 
		response = new String(connection.getRequestData(url, null, HttpConnectionType.GET));
		JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
		status = jsonObject.get("status").getAsString();
		results = jsonObject.get("results");				
		sunVo = new Gson().fromJson(results, SunriseSunsetVO.class);
	}
	
	/**
	 * @return the status
	 * @throws IOException 
	 */
	public String getStatus() {
		return status;
	}
	
	public SunriseSunsetVO getResults() {
		return sunVo;
	}	

}

/**
 *  Inner Class data structure
 */
class SunriseSunsetVO implements Serializable {
	
	private static final long serialVersionUID = -1711126471696728890L;
	private String sunrise;
	private String sunset;
	private String solar_noon;
	private String day_length;
	private String civil_twilight_begin;
	private String civil_twilight_end;
	private String nautical_twilight_begin;
	private String nautical_twilight_end;
    private String astronomical_twilight_begin;
    private String astronomical_twilight_end;
	/**
	 * @return the sunrise
	 */
	public String getSunrise() {
		return sunrise;
	}
	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	/**
	 * @return the sunset
	 */
	public String getSunset() {
		return sunset;
	}
	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	/**
	 * @return the solar_noon
	 */
	public String getSolarNoon() {
		return solar_noon;
	}
	/**
	 * @param solar_noon the solar_noon to set
	 */
	public void setSolarNoon(String solar_noon) {
		this.solar_noon = solar_noon;
	}
	/**
	 * @return the day_length
	 */
	public String getDayLength() {
		return day_length;
	}
	/**
	 * @param day_length the day_length to set
	 */
	public void setDay_length(String day_length) {
		this.day_length = day_length;
	}
	/**
	 * @return the civil_twilight_begin
	 */
	public String getCivilTwilightBegin() {
		return civil_twilight_begin;
	}
	/**
	 * @param civil_twilight_begin the civil_twilight_begin to set
	 */
	public void setCivil_twilight_begin(String civil_twilight_begin) {
		this.civil_twilight_begin = civil_twilight_begin;
	}
	/**
	 * @return the civil_twilight_end
	 */
	public String getCivilTwilightEnd() {
		return civil_twilight_end;
	}
	/**
	 * @param civil_twilight_end the civil_twilight_end to set
	 */
	public void setCivil_twilight_end(String civil_twilight_end) {
		this.civil_twilight_end = civil_twilight_end;
	}
	/**
	 * @return the nautical_twilight_begin
	 */
	public String getNauticalTwilightBegin() {
		return nautical_twilight_begin;
	}
	/**
	 * @param nautical_twilight_begin the nautical_twilight_begin to set
	 */
	public void setNautical_twilight_begin(String nautical_twilight_begin) {
		this.nautical_twilight_begin = nautical_twilight_begin;
	}
	/**
	 * @return the nautical_twilight_end
	 */
	public String getNauticalTwilightEnd() {
		return nautical_twilight_end;
	}
	/**
	 * @param nautical_twilight_end the nautical_twilight_end to set
	 */
	public void setNautical_twilight_end(String nautical_twilight_end) {
		this.nautical_twilight_end = nautical_twilight_end;
	}
	/**
	 * @return the astronomical_twilight_begin
	 */
	public String getAstronomicalTwilightBegin() {
		return astronomical_twilight_begin;
	}
	/**
	 * @param astronomical_twilight_begin the astronomical_twilight_begin to set
	 */
	public void setAstronomical_twilight_begin(String astronomical_twilight_begin) {
		this.astronomical_twilight_begin = astronomical_twilight_begin;
	}
	/**
	 * @return the astronomical_twilight_end
	 */
	public String getAstronomicalTwilightEnd() {
		return astronomical_twilight_end;
	}
	/**
	 * @param astronomical_twilight_end the astronomical_twilight_end to set
	 */
	public void setAstronomical_twilight_end(String astronomical_twilight_end) {
		this.astronomical_twilight_end = astronomical_twilight_end;
	}

}
