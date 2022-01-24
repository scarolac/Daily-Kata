package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: ClosestPoints.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Closest points Kata
 * 
 * Given a set of points (x, y) on a 2D cartesian plane, find the two closest points. 
 * For example, given the points [
 * 		(1, 1), 
 * 		(-1, -1), 
 * 		(3, 4), 
 * 		(6, 1), 
 * 		(-1, -6), 
 * 		(-4, -3)
 * ], 
 * 
 * return [(-1, -1), (1, 1)]
 * 
 * Constraints:
 * points length > 1
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 16, 2021
 * @updates:
 ****************************************************************************/
public class ClosestPoints {

	/**
	 * Finds the two closest points and returns them
	 * @param points Points to calculate distance against
	 * @return Closest points
	 */
	public Integer[][] calculateClosestPoints(Integer[][] points) {
		if (points == null || points.length == 0)
			return new Integer[0][0];

		var max = Double.MAX_VALUE;
		var result = new Integer[2][];
		for (var i = 0; i < points.length - 1; ++i)
			for (var j = i + 1; j < points.length; ++j) {
				var distance = distance(points[i], points[j]);
				if (distance < max) {
					result[0] = points[i];
					result[1] = points[j];
					max = distance;
				}
			}

		return result;
	}

	private double distance(Integer[] one, Integer[] two) {
		return Math.sqrt(Math.pow((double) two[0] - one[0], 2) + Math.pow((double) two[1] - one[1], 2));
	}
}
