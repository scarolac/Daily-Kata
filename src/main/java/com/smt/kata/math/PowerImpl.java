package com.smt.kata.math;

/**
 * The purpose of this Kata is to implement the Math.pow(num, pow) functionality yourself.
 *
 * The function should take in a double value and proper raise it by the given power.
 *
 * You cannot use any Math based libraries to perform the operations.
 *
 * See the test class for examples.
 *
 * @author raptor
 * @version 3.0
 * @since June 9, 2022
 *
 */
public class PowerImpl {

	public double calcPower(double num, int pow) {
		if (pow == 0) return 1.0;
		var result = 1.0;
		if (pow > 0)
			for (var i = 1; i <= pow; ++i)
				result *= num;
		else
			for (var i = -1; i >= pow; --i)
				result /= num;
		return result;
    }
}
