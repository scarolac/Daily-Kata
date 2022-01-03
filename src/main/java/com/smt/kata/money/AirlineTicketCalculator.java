package com.smt.kata.money;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: AirlineTicketCalculator.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Airline Ticket Calculator Kata
 * You are given a huge list of airline ticket prices between different cities 
 * around the world on a given day. These are all direct flights. Each element 
 * in the list has the format (source_city, destination, price).
 * 
 * Consider a user who is willing to take up to k connections from their origin 
 * city A to their destination B. Find the cheapest fare possible for this journey 
 * and print the itinerary for that journey.
 * 
 * For example, our traveler wants to go from JFK to LAX with up to 3 connections, 
 * and our input flights are as follows:
 * 
 * {
 *     {'JFK', 'ATL', 150},
 *     {'ATL', 'SFO', 400},
 *     {'ORD', 'LAX', 200},
 *     {'LAX', 'DFW', 80},
 *     {'JFK', 'HKG', 800},
 *     {'ATL', 'ORD', 90},
 *     {'JFK', 'LAX', 500},
 * }
 * 
 * Due to some improbably low flight prices, the cheapest itinerary would be 
 * JFK -> ATL -> ORD -> LAX, costing $440.
 *
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 21, 2021
 * @updates:
 ****************************************************************************/
public class AirlineTicketCalculator {
	
	// Maximum number of connections allowed
	public static final int MAX_CONNECTIONS = 5;
	
	// Holder for the cheapest flight.  Set to max so we can update as the prices 
	// come rolling in
	protected int cheapest = Integer.MAX_VALUE;
	
	// Max number of connections when finding flights
	protected int maxConnections = 0;
	
	/**
	 * Finds the cheapest flight with up to max connections
	 * @param flights Collection of possible flights
	 * @param source Starting city
	 * @param dest Ending or destination city
	 * @param maxConnections Max number of connections the trip can have
	 * @return Cheapest.  0 if no matching flights found
	 */
	public int findCheapest(List<Ticket> flights, String source, String dest, int maxConnections) {
		return MAX_CONNECTIONS;
	}

	/**
	 * Inner class to hold travel information
	 * @author etewa
	 */
	public class Ticket {
		protected String sourceCity;
		protected String destCity;
		protected int cost;
		
		/**
		 * Constructor that assigns all of the values
		 * @param sourceCity Source city code
		 * @param destCity Destination city code
		 * @param cost Cost of the ticket to fly form the source to the destination
		 */
		public Ticket(String sourceCity, String destCity, int cost) {
			this.sourceCity = sourceCity;
			this.destCity = destCity;
			this.cost = cost;
		}
	}
}
