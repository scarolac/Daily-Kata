package com.smt.kata.data;

// JDK 11
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PatternDecoder.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description:</b> 
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
 * count the number of ways it can be decoded. For example, the message '111'
 * would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'. You can
 * assume that the messages are decodable. For example, '001' is not allowed.
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class PatternDecoder {

	public static void main(String[] args) {
		System.out.println(decodePattern("414"));
	}
	
	/**
	 * Decodes the given pattern
	 * 
	 * @param pattern Valid pattern to compare
	 * @return Collection of the matching patterns
	 */
	public List<String> decodePattern(String pattern) {
		List<String> patterns = new ArrayList<>();
		StringBuilder builder = new StringBuilder();

		System.out.println(getPattern(pattern));
		List<List<Integer>> possiblePatterns = getPattern(pattern);
		
		List<List<Integer>> possibleSets = new ArrayList<>();

		try {
			// int count = 0;
			// for (List<Integer> list : possiblePatterns) {
				
			// 	possibleSets[count] = pattern.charAt(count);

			// 	if(list.size() > 1) {
			// 		//take the current sets of chars and copy them add a sing and a double
					
			// 	}

			// 	count++;

			// }


			for (int i = 0; i < pattern.length(); ++i)
			{
				builder.append((char)(Integer.parseInt(pattern.charAt(i) + "") - 1 + 'a'));		
			}

			patterns.add(builder.toString());

			builder = new StringBuilder();
			for (int i = 0; i < pattern.length() - 1; ++i)
			{
				var something = (char)(Integer.parseInt((pattern.charAt(i) + "") + (pattern.charAt(i+1) + "")) - 1 + 'a');
				if (something < 'z')
					builder.append(something);
				else if (builder.length() == 0)
					builder.append((char)(Integer.parseInt(pattern.charAt(i) + "") - 1 + 'a'));
			}
			boolean flag = false;
			for (var str : patterns)
			{
				if (!str.contains(builder.toString())) flag = true;
					
			}
			if (flag) patterns.add(builder.toString());
			

		} catch (Exception e)
		{
			return new ArrayList<>();
		}

		return patterns;
	}

		/**
	 * 
	 * @param pattern
	 * @return
	 */
	private static List<List<Integer>> getPattern(String pattern) {
		int length = pattern.length();
		List<List<Integer>> vals = new ArrayList<>();
		for (int i=0; i < length; i++) {
			if (length -1 == i) vals.add(Arrays.asList(1));
			else if (pattern.charAt(i) > '2') vals.add(Arrays.asList(1));
			else if (pattern.charAt(i) == '1' || (pattern.charAt(i) == '2' && pattern.charAt(i + 1) < '7')) {
				vals.add(Arrays.asList(1, 2));
			} else vals.add(Arrays.asList(1));
		}
		return vals;
	}
}
