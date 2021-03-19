package com.smt.kata.distance;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> SaddlePoints.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Saddle Points
 * Detect saddle points in a matrix.
 * 
 * So say you have a matrix:
 * 
 *     1  2  3
 *   |---------
 * 1 | 9  8  7
 * 2 | 5  3  2     <--- saddle point at column 1, row 2, with value 5
 * 3 | 6  6  7
 * 
 * It has a saddle point at column 1, row 2.
 * 
 * It's called a "saddle point" because it is greater than or equal to every element 
 * in its row and less than or equal to every element in its column.
 * 
 * A matrix may have zero or more saddle points.
 * 
 * Your code should be able to provide the (possibly empty) list of all the saddle 
 * points for any given matrix.
 * 
 * The matrix can have a different number of rows and columns (Non square).
 * 
 * Note that you may find other definitions of matrix saddle points online, but the 
 * tests for this exercise follow the above unambiguous definition.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 18, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class SaddlePoints {
	
	/**
	 * Matrix to process
	 */
	protected int[][] matrix;
	
	/**
	 * Map of the points
	 */
	protected List<int[]> coords;

	/**
	 * Assigns the matrix and initializes the class
	 * @param matrix multi-dimensional array to search for saddle points
	 */
	public SaddlePoints(int[][] matrix) {
		this.coords = new ArrayList<>();
		this.matrix = matrix;
	}
	
	/**
	 * Gets the saddle points
	 * @return List of int array of column/row/value for all saddle points
	 */
	public List<int[]> getCoordinates() {
		return coords;
	}

}
