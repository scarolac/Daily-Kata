package com.smt.kata.distance;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: SpiralMatrix.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Spiral Matrix
 * 
 * Given a N by M matrix of numbers, print out the matrix in a clockwise and 
 * counter clockwise spiral.
 * 
 * For example, given the following matrix:
 * 
 * [[1,  2,  3,  4,  5],
 *  [6,  7,  8,  9,  10],
 *  [11, 12, 13, 14, 15],
 *  [16, 17, 18, 19, 20]]
 *  
 * You should return a list of all of the items in the matrix in the following order for clockwise:
 * 
 * 1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12
 * 
 * and for counter-clockwise:
 * 
 * 1,6,11,16,17,18,19,20,15,10,5,4,3,2,7,12,13,14,9,8
 * 
 * Remember, that this code must work for a matrix of any size or no soup for you
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 15, 2021
 * @updates:
 ****************************************************************************/
public class SpiralMatrix {

	/**
	 * Loops the matrix in the clockwise direction
	 * @param matrix Matrix to spiral
	 * @return List of the integers in clockwise spiral order
	 */
	public List<Integer> clockwise(int[][] matrix) {
	    List<Integer> result = new ArrayList<>();
	    // intitialize limits as N, M
	    int xax = matrix[0].length;
	    int yax = matrix.length;
	    // loop from left to right , then top to bottom
	    int i = 0;
	    int j = 0;
	    int trim = 0;
	    while( xax >= 0 && yax >= 0) {
	    	i = right(result, xax,matrix, j,trim)-1;
	    	yax--;
	    	j= down(result, yax,matrix, i,trim)-1;
	    	xax--;
	    	i=left(result, xax,matrix, j,trim)-1;
	    	yax--;
	    	j = up(result, yax,matrix, i,trim)-1;
	    	xax--;
	    	p(xax + "," +yax);
	    	trim++;
	    }
	    
	    // add elements to result
	    
	    //when you hit limit, decrement limits
	    
	    //once N=0, M=0, return
	    return result;
	}
	
	/**
	 * Loops the matrix in the counter-clockwise direction
	 * @param matrix Matrix to spiral
	 * @return List of the integers in counter-clockwise spiral order
	 */
	public List<Integer> counterClockwise(int[][] matrix) {
	    List<Integer> result = new ArrayList<>();
	    return result;
	}
	
	public static <T> void p(T s) {
		System.out.println(s);
	}
	
	public int left (List<Integer> output, int axs, int[][] matrix, int j, int trim) {
		int i = 0;
		for (i = axs; i> 0; i--) {
			p(matrix[j][i]);
		}
		return i;
	}
	
	public int right (List<Integer> output, int axs, int[][] matrix, int j, int trim) {
		int i = 0;
		for (i = 0; i<axs; i++) {
			p(matrix[j][i]);
		}
		return i;
	}
	public int down (List<Integer> output, int axs, int[][] matrix, int i, int trim) {
		int j = 0;
		for (j = 0; j<axs; j++) {
			p(j + "," + i);
			p(matrix[j][i]);
		}
		return j;
	}
	
	public int up (List<Integer> output, int axs, int[][] matrix, int i, int trim) {
		int j = 0;
		for (j = axs; j> 0; j--) {
			p(matrix[j][i]);
		}
		return j;
	}
}
