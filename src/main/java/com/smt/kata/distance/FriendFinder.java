package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: friendFinder.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> You and your friend are waiting in a line. A description 
 * of the line is given in the String line. The character 'S' represents yourself, 
 * the character 'F' represents your friend, and '.' indicates anyone else in the line. 
 * How far apart are you and your friend in this line?  If both you and your 
 * friend are not in the line, return -1
 * 
 * Constraints
 * -	line will have between 2 and 50 characters, inclusive.
 * -	Each character of line will be '.', 'S', or 'F'.
 * -    You and your friend may appear in either order or not at all
 * 
 * Examples
 * "....SF..."
 * Returns: 1
 * You and your friend are adjacent in this line, thus you are one position away from each other.
 *  	
 * "S........F"
 * Returns: 9
 * You and your friend are at completely opposite ends of this line.
 * 
 * "..F...S.."
 * Returns: 4
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 3, 2021
 * @updates:
 ****************************************************************************/
public class FriendFinder {

	/**
	 * 
	 * @param line
	 * @return
	 */
	public int calculateDistance(String line) {
		return (line.matches(".*\\w{1}.*\\w{1}.*")) ? Math.abs(line.indexOf("S") - line.indexOf("F")) : -1;

		// if (line.contains("S") && line.contains("F"))
		// 	return Math.abs(line.indexOf("S") - line.indexOf("F"));
		// return -1;
	}

}
