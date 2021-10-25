package com.smt.kata.distance;

// JDK 11.x
import java.util.List;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: ClassroomFriendship.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Classroom Friendship Kata
 * 
 * A classroom consists of N students, whose friendships can be represented in an 
 * adjacency list. For example, the following descibes a situation where 0 is 
 * friends with 1 and 2, 3 is friends with 6, and so on.
 * 
 * {0: [1, 2],
 *  1: [0, 5],
 *  2: [0],
 *  3: [6],
 *  4: [],
 *  5: [1],
 *  6: [3]} 
 * 
 * Each student can be placed in a friend group, which can be defined as the 
 * transitive closure of that student's friendship relations. In other words, 
 * this is the smallest set such that no student in the group has any friends 
 * outside this group. For the example above, the friend groups 
 * would be {0, 1, 2, 5}, {3, 6}, {4}.
 * 
 * Given a friendship list such as the one above, determine the number of 
 * friend groups in the class.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 22, 2021
 * @updates:
 ****************************************************************************/
public class ClassroomFriendship {

	/**
	 * Counts the groups of friends
	 * @param friends friend assignments
	 * @return count of the number of friend groups
	 */
	public int countGroups(Map<Integer, List<Integer>> friends) {
		return friends.size();
	}
}
