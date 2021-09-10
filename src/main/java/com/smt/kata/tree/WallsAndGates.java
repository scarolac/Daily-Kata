package com.smt.kata.tree;

/****************************************************************************
 * <b>Title</b>: WallsAndGates.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Walls and Gates Kata
 * 
 * You are given a m x n 2D grid initialized with these three possible values.
 * 
 * -1 - A wall or an obstacle.
 * 0 - A gate.
 * INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to r
 *       epresent INF as you may assume that the distance to a gate is less than 2147483647.
 * 
 * Fill each empty room with the distance to its nearest gate. If it is impossible 
 * to reach a gate, it should be filled with INF.
 * 
 * Example: 
 * 
 * Given the 2D grid:
 * 
 * INF  -1  0  INF
 * INF INF INF  -1
 * INF  -1 INF  -1
 *   0  -1 INF INF
 *   
 *   After running your function, the 2D grid should be:
 * 
 *   3  -1   0   1
 *   2   2   1  -1
 *   1  -1   2  -1
 *   0  -1   3   4
 *   
 *  **** Hint: Try using a depth first search algorithm
 *   
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 29, 2021
 * @updates:
 ****************************************************************************/
public class WallsAndGates {

	/**
	 * Assigns the distance from each room to a gate
	 * 
	 * @param rooms Matrix of rooms, gates and walls
	 */
	public int[][] assign(int[][] rooms) {
		if (invalidArray(rooms))
			return new int[0][];

		for (var row = 0; row < rooms.length; ++row)
			for (var col = 0; col < rooms[row].length; ++col)
				if (rooms[row][col] == 0)
					search(rooms, row, col, 0);

		return rooms;
	}

	private boolean invalidArray(int[][] rooms) {
		return rooms == null || rooms.length == 0 || rooms[0] == null || rooms[0].length == 0;
	}

	private void search(int[][] rooms, int row, int col, int count) {
		if (outOfBounds(rooms, row, col) || shorterPathFound(rooms, row, col, count))
			return;

		rooms[row][col] = count++;
		search(rooms, row, col + 1, count);
		search(rooms, row, col - 1, count);
		search(rooms, row - 1, col, count);
		search(rooms, row + 1, col, count);
	}

	private boolean outOfBounds(int[][] rooms, int row, int col) {
		return row < 0 || row >= rooms.length || col < 0 || col >= rooms[row].length;
	}

	private boolean shorterPathFound(int[][] rooms, int row, int col, int count) {
		return rooms[row][col] < count;
	}
}
