package com.smt.kata.math;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
// JDK 11.x
import java.util.logging.Logger;

/****************************************************************************
 * <b>Title</b>: ProbabilityStudentClub.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Probability Student Club
 * Alice wants to join her school's Probability Student Club. Membership dues are 
 * computed via one of two simple probabilistic games.
 * 
 * The first game: roll a die repeatedly. Stop rolling once you get a five followed 
 * by a six. Your number of rolls is the amount you pay, in dollars.
 * 
 * The second game: same, except that the stopping condition is a five followed by a five.
 * 
 * Iterate over each on at least 10 times and average the results.  Output should 
 * look similar to the following:
 * 
 * [2021-07-21 08:00:36] [INFO   ] The First Probability Took 34 rolls 
 * [2021-07-21 08:00:36] [INFO   ] The Second Probability Took 11 rolls 
 * [2021-07-21 08:00:36] [INFO   ] ************************************************** 
 * [2021-07-21 08:00:36] [INFO   ] The First Probability Took 77 rolls 
 * [2021-07-21 08:00:36] [INFO   ] The Second Probability Took 17 rolls 
 * [2021-07-21 08:00:36] [INFO   ] ************************************************** 
 * [2021-07-21 08:00:36] [INFO   ] The First Probability Took 24 rolls 
 * [2021-07-21 08:00:36] [INFO   ] The Second Probability Took 9 rolls 
 * [2021-07-21 08:00:36] [INFO   ] ************************************************** 
 * [2021-07-21 08:00:36] [INFO   ] The First Probability Took an average of 32 rolls 
 * [2021-07-21 08:00:36] [INFO   ] The Second Probability Took an average of 32 rolls 
 * 
 * Which of the two games should Alice elect to play? Does it even matter? 
 * Write a program to simulate the two games and calculate their expected value.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 20, 2021
 * @updates:
 ****************************************************************************/
public class ProbabilityStudentClub {
	
	static // Members
	Logger logger = Logger.getLogger(ProbabilityStudentClub.class.getName());
	
	/**
	 * Constructor.  Change as needed
	 */
	public ProbabilityStudentClub() {
		super();
		System.setProperty("java.util.logging.SimpleFormatter.format","[%1$tF %1$tT] [%4$-7s] %5$s %n");
		logger.log(Level.INFO, "Starting Application");
	}
	
	/**
	 * Calls and runs this code
	 * @param args not utilized
	 */
	public static void main(String[] args) {
		var totalRuns = 10;
		var gameOneCount = 0;
		var gameTwoCount = 0;
		
		Game gameOne;
		Game gameTwo;
		for (var i = 0; i < totalRuns; ++i) {
			gameOne = new Game("First", 5, 6);
			gameOne.logResult();
			gameOneCount += gameOne.getCount();
			gameTwo = new Game("Second", 5, 5);
			gameTwo.logResult();
			gameTwoCount += gameTwo.getCount();
			logger.log(Level.INFO, "**************************************************");
		}
		
		logger.log(Level.INFO, "The First Game took and average of " + gameOneCount / totalRuns + " rolls");
		logger.log(Level.INFO, "The Second Game took and average of " + gameTwoCount / totalRuns + " rolls");
	}
}

class Game {
	boolean firstStop = false;
	int rollCount = 0;
	String name;
	Logger logger = Logger.getLogger(Game.class.getName());

	Game(String name, int trigger, int stopPoint) {
		System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
		var roll = 0;
		this.name = name;
		var end = false;

		while (!end) {
			roll = roll();
			rollCount++;

			if (firstStop && roll != stopPoint)
				firstStop = false;

			if (firstStop && roll == stopPoint)
				end = true;

			if (roll == trigger)
				firstStop = true;
		}
	}

	public int getCount() {
		return this.rollCount;
	}

	private int roll() {
		return ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}

	public void logResult() {
		logger.log(Level.INFO, "The " + this.name + " Probability took " + this.rollCount + " rolls");
	}
}
