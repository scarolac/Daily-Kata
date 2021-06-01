package com.smt.kata.distance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> MatrixIsland.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Island Matrix
 * 
 * Given a matrix of 1s and 0s, return the number of "islands" in the matrix. 
 * A 1 represents land and 0 represents water, so an island is a group of 1s that are 
 * neighboring (horizontal or vertical or both.  Diagonal only does not count) whose 
 * perimeter is surrounded by water.  Land (1s) on the outside of the matrix are 
 * considered surrounded by water on those edges.  In other words, the matrix is 
 * surrounded by water. The smallest island has 1 node
 * 
 * For example, the largest island in this matrix is 4
 * 
 * 1 0 0 0 0
 * 0 0 1 1 0
 * 0 1 1 0 0
 * 0 0 0 0 0
 * 1 1 0 0 1
 * 1 1 0 0 1
 * 
 * Use whatever classes you want for this
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 1, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class MatrixIsland {
	// Members
	protected int[][] matrix;
	protected boolean hasIslands = false;
	protected int numberIslands = 0;
	protected int nodesInLargestIsland = 0;
	private List<Coord> coords = new ArrayList<>();
	
	class Coord {
		int row;
		int col;
		public Coord(int row, int col) {
			this.row = row;
			this.col = col;
		}
		
		@Override
		public boolean equals(Object other) {
			if (this == other) return true;
			if (other == null) return false;
			if (getClass() != other.getClass()) return false;
			var coord = (Coord) other;
			return row == coord.row && col == coord.col;
		}
		
		public String toString() {
			return "[" + row +", " + col + "]";
		}
	}
	
	/**
	 * Assigns the matrix
	 */
	public MatrixIsland(int[][] matrix) throws NullPointerException {
		super();
		if (matrix == null || matrix.length == 0) 
			throw new NullPointerException();
		p("--------------------");
		pM(matrix);
				
		for (var row = 0; row < matrix.length; ++row) {
			for (var col = 0; col < matrix[0].length; ++col) {
				if (matrix[row][col] == 1) 
					coords.add(new Coord(row, col));
			}
		}
	
//		p(coords);
		countIslands();
		findLargest();
	}
	
	/**
	 * Finds the largest island and returns the number of nodes in that island
	 * @return Number of nodes in the largest island
	 */
	protected void findLargest() {
		/** Do something here **/
	}
	
	/**
	 * Calculates if there are any islands and how many.  Updates the member 
	 * variables when complete
	 */
	protected void countIslands() {
		if (coords.isEmpty()) return;
		
		hasIslands = true;
		
		if (coords.size() == 1) {
			numberIslands = 1;
			nodesInLargestIsland = 1;
			return;
		}
		
		
		for (var item : coords) {
			var size = 1;
			if (coords.contains(new Coord(item.row + 1, item.col)) ||			
				coords.contains(new Coord(item.row, item.col + 1)) || 
				coords.contains(new Coord(item.row - 1, item.col)) || 
				coords.contains(new Coord(item.row, item.col - 1)))
			{
				++size;
			}
			else {
				++numberIslands;
			}
			if (size > nodesInLargestIsland) nodesInLargestIsland = size;
		}
		
		
	}

	/**
	 * @return the hasIslands
	 */
	public boolean hasIslands() {
		return hasIslands;
	}

	/**
	 * @return the numberIslands
	 */
	public int getNumberIslands() {
		return numberIslands;
	}

	/**
	 * @return the nodesInLargestIsland
	 */
	public int getNodesInLargestIsland() {
		return nodesInLargestIsland;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }    
    private static void pA(int[] array) { System.out.println(Arrays.toString(array));}
    private static void pM(int[][] matrix) { p(matrix.length + "x" + matrix[0].length); for (var row : matrix) pA(row); }

}
