package com.smt.kata.distance;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.siliconmtn.io.http.SMTHttpConnectionManager;
import com.siliconmtn.io.http.SMTHttpConnectionManager.HttpConnectionType;
// Kata imports
import com.smt.kata.distance.bean.Location;
import com.smt.kata.distance.bean.MatchCode;

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
	public Location location;
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
	 * @throws XPathExpressionException 
	 */
	public Location getGeocode(String addr, String city, String state, String zip, String country) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
		String queryUrl = String.format("addr=%s&city=%s&state=%s&zip=%s&country=%s",addr,city,state,zip,country);
		queryUrl = URLEncoder.encode(queryUrl,"UTF-8");
		queryUrl = SMT_GEO_URL + queryUrl;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new URL(queryUrl).openStream());
        
		return parseResults(doc);
		
	}
	
	
	private Location parseResults (Document doc){
		
		Location target = new Location();
		
		
		NodeList xmlLoc = doc.getElementsByTagName("GeocodeLocation");
		
		Node nNode = xmlLoc.item(0);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;
			
			System.out.println("City " + eElement.getElementsByTagName("MatchCode").item(0).getTextContent());
			target.setCity(eElement.getElementsByTagName("City").item(0).getTextContent());
			target.setZipCode(eElement.getElementsByTagName("ZipCode").item(0).getTextContent());
			target.setMatchCode(MatchCode.getMatchCode(eElement.getElementsByTagName("MatchCode").item(0).getTextContent()));
			target.setCountry(eElement.getElementsByTagName("Country").item(0).getTextContent());
			target.setCounty(eElement.getElementsByTagName("County").item(0).getTextContent());
			target.setCountryName(eElement.getElementsByTagName("CountryName").item(0).getTextContent());
			target.setLongitude(Double.parseDouble(eElement.getElementsByTagName("Longitude").item(0).getTextContent()));
			target.setLatitude(Double.parseDouble(eElement.getElementsByTagName("Latitude").item(0).getTextContent()));
			target.setState(eElement.getElementsByTagName("State").item(0).getTextContent());
		}
		

		
		return target;
		
//		<sgl>
//		<InputLocation>06010 US</InputLocation>
//		<GeocodeType>zipCode</GeocodeType>
//		<StatusCode>200</StatusCode>
//		<GeocodeLocation>
//		<MatchCode>zipCode</MatchCode>
//		<Address/>
//		<City>BRISTOL</City>
//		<County>HARTFORD</County>
//		<State>CT</State>
//		<ZipCode>06010</ZipCode>
//		<ZipCodeSuffix/>
//		<Country>US</Country>
//		<CountryName>United States</CountryName>
//		<Latitude>41.6750889</Latitude>
//		<Longitude>-72.9224329</Longitude>
//		<CassValidated>false</CassValidated>
//		<BarCodeId/>
//		</GeocodeLocation>
//		</sgl>
		
		
	}
	
}
