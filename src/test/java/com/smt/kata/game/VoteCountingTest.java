package com.smt.kata.game;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.smt.kata.game.VoteCounting.Candidates;

/****************************************************************************
 * <b>Title</b>: VoteCountingTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Vote Counting Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 4, 2021
 * @updates:
 ****************************************************************************/
class VoteCountingTest {

	// Members
	private VoteCounting vc = new VoteCounting();
	
	/**
	 * Test method for {@link com.smt.kata.game.VoteCounting#count()}.
	 */
	@Test
	void testCountAllGood() throws Exception {
		List<Candidates> candidates = vc.count(0);
		assertEquals(3, candidates.size());
		assertTrue(candidates.contains(Candidates.MARY));
		assertTrue(candidates.contains(Candidates.JOSEPH));
		assertTrue(candidates.contains(Candidates.DANIEL));
		
		assertFalse(vc.hasPotentialFraud());
	}

	/**
	 * Test method for {@link com.smt.kata.game.VoteCounting#count()}.
	 */
	@Test
	void testCountDupVote() throws Exception {
		List<Candidates> candidates = vc.count(1);
		assertEquals(3, candidates.size());
		assertTrue(candidates.contains(Candidates.MARY));
		assertTrue(candidates.contains(Candidates.JOSEPH));
		assertTrue(candidates.contains(Candidates.DANIEL));
		
		assertTrue(vc.hasPotentialFraud());
		assertEquals(1, vc.getPossibleFraudVotes().size());
		assertEquals(13, vc.getPossibleFraudVotes().get(0));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.VoteCounting#count()}.
	 */
	@Test
	void testCountNoFile() throws Exception {
		assertThrows(NullPointerException.class, () -> {
			vc.count(10);
		});
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.VoteCounting#count()}.
	 */
	@Test
	void testCountNoVotes() throws Exception {
		List<Candidates> candidates = vc.count(2);
		assertEquals(0, candidates.size());
		assertFalse(vc.hasPotentialFraud());
	}
}
