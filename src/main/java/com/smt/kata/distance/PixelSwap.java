package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: PixelSwap.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Pixel Swap Kata
 * 
 * Given a 2-D matrix representing an image, a location of a pixel in the screen 
 * and a color C, replace the color of the given pixel and all adjacent same 
 * colored pixels with C.
 * 
 * For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:
 * 
 * B B W
 * W W W
 * W W W
 * B B B
 * 
 * Becomes
 * 
 * B B G
 * G G G
 * G G G
 * B B B
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
public class PixelSwap {
	
	/**
	 * Swaps the pixels at the given coords and contiguous coords with the same original color
	 * @param pixels Matrix of pixels
	 * @param coords Starting coords
	 * @param color New color in those 0ixels
	 * @return Updated pixel map
	 */
	public char[][] swap(char[][] pixels, int[] coords, char color) {
		if (pixels == null || coords == null || coords[0] > pixels.length)
			return new char[0][];
				
		move(pixels, coords[0], coords[1], pixels[coords[0]][coords[1]], color);
		
		return pixels;
	}
	
	private void move(char[][] pixels, int row, int col, char currentColor, char color) {
		if (row >= 0 && col >=0 && row < pixels.length && col < pixels[row].length && pixels[row][col] == currentColor) {
			pixels[row][col] = color;
			move(pixels, row - 1, col, currentColor, color);
			move(pixels, row + 1, col, currentColor, color);
			move(pixels, row, col - 1, currentColor, color);
			move(pixels, row, col + 1, currentColor, color);
		}
	}
	
}
