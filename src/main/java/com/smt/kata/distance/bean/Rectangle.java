package com.smt.kata.distance.bean;

// JDK 11.x
import java.io.Serializable;

/****************************************************************************
 * <b>Title</b>: Rectangle.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Value object holding the coordinates for a rectangle
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 31, 2021
 * @updates:
 ****************************************************************************/
public class Rectangle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3615572197475045115L;
	
	// Members
	CoordinateVO topLeft;
	CoordinateVO bottomRight;
	
	/**
	 * 
	 */
	public Rectangle(CoordinateVO topLeft, CoordinateVO bottomRight) {
		super();
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
}
