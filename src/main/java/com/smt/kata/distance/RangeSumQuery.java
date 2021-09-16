package com.smt.kata.distance;

// JDK 11.x
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.smt.kata.distance.bean.CoordinateVO;
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
	int rowBound;
	int colBound;
	
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
		if (ArrayUtils.isEmpty(matrix) || matrix.length < 2 || areas.isEmpty())
			return 0;
		rowBound = matrix.length;
		colBound = matrix[0].length;
		var size = 0;
		var area = buildArea(areas);
		for (var row = 0; row < rowBound; ++row)
			for (var col = 0; col < colBound; ++col)
				if (row >= area.topLeft.getRow() && row <= area.bottomRight.getRow() && 
					col >= area.topLeft.getColumn()	&& col <= area.bottomRight.getColumn())
					size += matrix[row][col];
	
		return size;
	}
	
	private Rectangle buildArea(List<Rectangle> areas) {
		if(areas.size() == 1) return areas.get(0);
		var topLeft = new CoordinateVO(100,100);
		var bottomRight = new CoordinateVO(0,0);
		
		for (var area : areas) {
			var top = area.topLeft.getRow();
			var left = area.topLeft.getColumn();
			var bottom = area.bottomRight.getRow();
			var right = area.bottomRight.getColumn();
			if(top < topLeft.getRow() && left < topLeft.getColumn())
				topLeft = area.topLeft;
			if(bottom > bottomRight.getRow() && right > bottomRight.getColumn())
				bottomRight = area.bottomRight;
		}
		
		return new Rectangle(topLeft, bottomRight);
	}

	private boolean withinBounds(List<Rectangle> areas) {
		for (var area : areas)
			if (area.topLeft.getRow() < 0 || area.topLeft.getRow() > rowBound 
					|| area.topLeft.getColumn() < 0	|| area.topLeft.getColumn() > colBound 
					|| area.bottomRight.getRow() < 0 || area.bottomRight.getRow() > rowBound 
					|| area.bottomRight.getColumn() < 0	|| area.bottomRight.getColumn() > colBound)
				return false;
		return true;
	}

}
