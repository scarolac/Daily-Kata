package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: IPAddress.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Implement a class that receives two IPv4 addresses, 
 * and returns the number of addresses between them (including the first one, 
 * excluding the last one). All inputs will be valid IPv4 addresses in the form 
 * of strings. The last address will always be greater than the first one. 
 * Examples ips_between("10.0.0.0", "10.0.0.50")  ==   50 
 * ips_between("10.0.0.0", "10.0.1.0")   ==  256 
 * ips_between("20.0.0.10", "20.0.1.0")  ==  246
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 12, 2021
 * @updates:
 ****************************************************************************/
public class IPAddress {

	/**
	 * Initializes the class
	 */
	public IPAddress() {
		super();
	}

	/**
	 * Determines the number of hosts between the 2 ip's
	 * @param ipStart
	 * @param ipEnd
	 * @return
	 */
	public static int numberHosts(String ipStart, String ipEnd) {
		final int SIZE = 256;

		String[] ipStartArray = ipStart.split("\\.");
		String[] ipEndArray = ipEnd.split("\\.");
		
		int first, second, third, fourth;

		first = Math.abs(Integer.parseInt(ipStartArray[0]) - Integer.parseInt(ipEndArray[0]));
		second = Math.abs(Integer.parseInt(ipStartArray[1]) - Integer.parseInt(ipEndArray[1]));
		third = Math.abs(Integer.parseInt(ipStartArray[2]) - Integer.parseInt(ipEndArray[2]));
		fourth = Math.abs(Integer.parseInt(ipStartArray[3]) - Integer.parseInt(ipEndArray[3]));
		
		if (first > 0)
			return first * (SIZE - second) * (SIZE - third) * (SIZE - fourth);
		if (second > 0)
			return second * (SIZE - third) * (SIZE - fourth);
		if (third > 0)
			return third * (SIZE - fourth);
		if (fourth > 0)
			return fourth;

		return 0;
	}
}
