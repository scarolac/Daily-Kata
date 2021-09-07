package com.smt.kata.distance;

// JDK 11.x
import java.util.List;

// Kata Libs
import com.smt.kata.distance.bean.Rectangle;

/****************************************************************************
 * <b>Title</b>: RangeSumQuery.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Range Sum Query Kata
 * 
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 * 
 * Calculate the sum of the elements of matrix inside the rectangle defined by 
 * its upper left corner (row1, col1) and lower right corner (row2, col2).
 * 
 * Implement the NumMatrix class:
 * 
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the 
 * elements of matrix inside the rectangle defined by its upper 
 * left corner (row1, col1) and lower right corner (row2, col2).
 * 
 * Allow multiple rectangles to be used inside the matrix.  If the rectangles overlap, 
 * those coordinates may be utilized only once when summing the values
 * 
 * ******* Note: Modifications to the CoordinateVO and Rectangle Class may be appropriate
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 31, 2021
 * @updates:
 ****************************************************************************/
public class RangeSumQuery {

	// Members
	protected int[][] matrix;
	
	/**
	 * Initializes the class with a matrix to use to calculate against
	 * @param matrix Matrix to use for calculating sums
	 */
	public RangeSumQuery(int[][] matrix) {
		super();
		this.matrix = matrix;
	}
	
	/**
	 * Sums the values from the provided matrix that are inside the rectangle
	 * @param areas Rectangles to sum the areas
	 * @return Sum of all cells inside the rectangles
	 */
	public int sumRange(List<Rectangle> areas) {
		return areas.size();
	}

}
