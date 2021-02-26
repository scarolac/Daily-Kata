package com.smt.kata.number;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: RunningMedianCalculator.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Compute the running median of a sequence of numbers. 
 * That is, given a stream of numbers, print out the median of the list so far 
 * on each new element.
 * 
 * Recall that the median of an even-numbered list is the average of the two middle numbers.
 * 
 * For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:
 * 2
 * 1.5
 * 2
 * 3.5
 * 2
 * 2
 * 2
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 25, 2021
 * @updates:
 ****************************************************************************/
public class RunningMedianCalculator {

	/**
	 * 
	 */
	public RunningMedianCalculator() {
		super();
	}
	
	/**
	 * Takes an array of integers and returns the running median value
	 * @param values
	 * @return
	 */
	public List<Double> getMedianValues(int[] values) {
		List<Double> medianValues = new ArrayList<>();
		if (values == null || values.length == 0) return medianValues;
				
		List<Integer> valueList = Arrays.stream(values).boxed().collect(Collectors.toList());		
		
		for (int i = 0; i < valueList.size(); ++i) 
			medianValues.add(calculateMedian(valueList.subList(0, i)));			
		
		return medianValues;
	}
	
	private double calculateMedian(List<Integer> values) {
		Collections.sort(values);
		System.out.println(values);
		int size = values.size();
//		System.out.println(values);
		var half = (size / 2);
		if (size % 2 != 0) {
			System.out.println((double)values.get(size / 2));
			return (double)values.get(size / 2);
		}
		System.out.println((values.get(0)));
//		return ((values.get(size / 2) + values.get((size / 2) + 1)) / 2.0);	
		return 0.0;
	}

}
