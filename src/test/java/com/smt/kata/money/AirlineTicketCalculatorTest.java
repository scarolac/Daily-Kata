package com.smt.kata.money;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

// Kata imports
import com.smt.kata.money.AirlineTicketCalculator.Ticket;

/****************************************************************************
 * <b>Title</b>: AirlineTicketCalculatorTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Airline Ticket Calculator Kata 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 21, 2021
 * @updates:
 ****************************************************************************/
class AirlineTicketCalculatorTest {
	
	// Members
	AirlineTicketCalculator atc = new AirlineTicketCalculator();
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestNullFlights() throws Exception {
		assertEquals(0, atc.findCheapest(null, "JFK", "LAX", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestEmptyFlights() throws Exception {
		assertEquals(0, atc.findCheapest(new ArrayList<>(), "JFK", "LAX", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestInvalidConnections() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		assertEquals(0, atc.findCheapest(flights, "JFK", "LAX", -3));
		assertEquals(0, atc.findCheapest(flights, "JFK", "LAX", 25));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestNoSource() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "ATL", 150));
		flights.add(atc.new Ticket("ATL", "SFO", 400));
		flights.add(atc.new Ticket("ORD", "LAX", 200));
		flights.add(atc.new Ticket("LAX", "DFW", 80));
		flights.add(atc.new Ticket("JFK", "HKG", 800));
		flights.add(atc.new Ticket("ATL", "ORD", 90));
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		assertEquals(0, atc.findCheapest(flights, null, "LAX", 3));
		assertEquals(0, atc.findCheapest(flights, "", "LAX", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestNoDest() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "ATL", 150));
		flights.add(atc.new Ticket("ATL", "SFO", 400));
		flights.add(atc.new Ticket("ORD", "LAX", 200));
		flights.add(atc.new Ticket("LAX", "DFW", 80));
		flights.add(atc.new Ticket("JFK", "HKG", 800));
		flights.add(atc.new Ticket("ATL", "ORD", 90));
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		assertEquals(0, atc.findCheapest(flights, "DEN", null, 3));
		assertEquals(0, atc.findCheapest(flights, "DEN", "", 3));
	}

	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestExampleOne() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "ATL", 150));
		flights.add(atc.new Ticket("ATL", "SFO", 400));
		flights.add(atc.new Ticket("ORD", "LAX", 200));
		flights.add(atc.new Ticket("LAX", "DFW", 80));
		flights.add(atc.new Ticket("JFK", "HKG", 800));
		flights.add(atc.new Ticket("ATL", "ORD", 90));
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		
		assertEquals(440, atc.findCheapest(flights, "JFK", "LAX", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestNullEntry() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "ATL", 150));
		flights.add(atc.new Ticket("ATL", "SFO", 400));
		flights.add(atc.new Ticket("ORD", "LAX", 200));
		flights.add(atc.new Ticket("LAX", "DFW", 80));
		flights.add(null);
		flights.add(atc.new Ticket("ATL", "ORD", 90));
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		
		assertEquals(440, atc.findCheapest(flights, "JFK", "LAX", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestNoMatches() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "ATL", 150));
		flights.add(atc.new Ticket("ATL", "SFO", 400));
		flights.add(atc.new Ticket("ORD", "DEN", 200));
		flights.add(atc.new Ticket("LAX", "DFW", 80));
		flights.add(atc.new Ticket("JFK", "HKG", 800));
		flights.add(atc.new Ticket("ATL", "ORD", 90));
		flights.add(atc.new Ticket("JFK", "DEN", 500));
		
		assertEquals(0, atc.findCheapest(flights, "JFK", "LAX", 3));
	}

	/**
	 * Test method for {@link com.smt.kata.money.AirlineTicketCalculator#findCheapest(java.util.List)}.
	 */
	@Test
	void testFindCheapestSingleDirect() throws Exception {
		List<Ticket> flights = new ArrayList<>();
		flights.add(atc.new Ticket("JFK", "LAX", 500));
		assertEquals(500, atc.findCheapest(flights, "JFK", "LAX", 3));
	}
}
