package com.smt.kata.distance;

// Kata imports
import com.smt.kata.distance.bean.Location;

/****************************************************************************
 * <b>Title:</b> GeocodeParser.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Geocode Parser
 * 
 * In this kata, you must connect to an SMT geocoder and parse the response into 
 * the provided location object (com.smt.kata.distance.bean.Location)
 * 
 * The response from the geocoder is in XML format.  You may use any libraries
 * that are included in the JDK.  The javax.xml, javax.xml.parsers and org.w3c.dom
 * are great places to start.  You may use Xpath or DocumentBuilders to solve
 * this kata.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 21, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class GeocodeParser {
	
	/**
	 * Base URL
	 * Example: http://smtproxy-dev.aws.siliconmtn.com/websvc/geocoder?addr=&city=&state=&zip=80211&country=US
	 */
	public static final String SMT_GEO_URL = "http://smtproxy-dev.aws.siliconmtn.com/websvc/geocoder?";
	
	/**
	 * 
	 */
	public GeocodeParser() {
		super();
	}

	/**
	 * Makes a geocode request and parses the results into a location object
	 * @param addr Address to geocode
	 * @param city city name
	 * @param state state 2 letter code
	 * @param zip zip code to geocode
	 * @param country 2 letter iso country code
	 * @return Geocoded location
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public Location getGeocode(String addr, String city, String state, String zip, String country) {
		return new Location();
	}
}
