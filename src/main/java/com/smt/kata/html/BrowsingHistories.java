package com.smt.kata.html;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: BrowsingHistories.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Browsing Histories Kata
 * 
 * We have some historical clickstream data gathered from our site anonymously 
 * using cookies. The histories contain URLs that users have visited in chronological order.
 * 
 * Write a function that takes two users' browsing histories as input and returns 
 * the longest contiguous sequence of URLs that appear in both.
 * 
 * For example, given the following two users' histories:
 * 
 * user1 = ['/home', '/register', '/login', '/user', '/one', '/two']
 * user2 = ['/home', '/red', '/login', '/user', '/one', '/pink']
 * You should return the following:
 * 
 * ['/login', '/user', '/one']
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 6, 2022
 * @updates:
 ****************************************************************************/
public class BrowsingHistories {

	/**
	 * Finds the longest sequence in the users browser histories
	 * @param user1 User1 browser history
	 * @param user2 User2 browser history
	 * @return Longest set of matching paths
	 */
	public List<String> findLongest(List<String> user1, List<String> user2) {
		return user1;
	}
}
