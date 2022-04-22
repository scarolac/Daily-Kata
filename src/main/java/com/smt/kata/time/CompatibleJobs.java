package com.smt.kata.time;

import java.util.ArrayList;

/****************************************************************************
 * <b>Title</b>: CompatibleJobs.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Compatible Jobs Kata
 * 
 * You are given a list of jobs to be done, where each job is represented by a 
 * start time and end time. Two jobs are compatible if they don't overlap. Find 
 * the largest subset of compatible jobs.
 * 
 * For example, given the following jobs (there is no guarantee that jobs will be sorted):
 * 
 * [(0, 6),
 * (1, 4),
 * (3, 5),
 * (3, 8),
 * (4, 7),
 * (5, 9),
 * (6, 10),
 * (8, 11)]
 * Return:
 * 
 * [(1, 4),
 * (4, 7),
 * (8, 11)]
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 17, 2022
 * @updates:
 ****************************************************************************/
public class CompatibleJobs {

	/**
	 * Calculates the compatible jobs form the array of jobs
	 * @param arrJobs Jobs to check for compatibility
	 * @return Max compatible jobs
	 */
	public int[][] calculate(int[][] arrJobs) {
		if (arrJobs == null || arrJobs.length == 0)
			return new int[0][];
		
		var temp = new ArrayList<int[]>();
		var max = new ArrayList<int[]>();
		var prev = new int[] {0,0};		
		for (var i = 0; i < arrJobs.length; ++i) {
			temp.add(arrJobs[i]);
			for (var j = 0; j < arrJobs.length; ++j) 
				if (i != j && (arrJobs[j][0] >= arrJobs[i][1] || arrJobs[j][1] <= arrJobs[i][0])
						&& (arrJobs[j][0] >= prev[1] || arrJobs[j][1] <= prev[0])) 
				{
					prev = arrJobs[j];
					temp.add(arrJobs[j]);
				}
			
			if (temp.size() > max.size())
				max = temp;
			temp = new ArrayList<int[]>();
		}
		
		var result = new int[max.size()][];
		result = max.toArray(result);
		
		return result;
	}
	
}
