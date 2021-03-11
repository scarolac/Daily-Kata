package com.smt.kata.code;

import java.lang.reflect.Method;

/****************************************************************************
 * <b>Title</b>: PasswordValidator.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> In this challenge, you are tasked with writing a Password validator that is flexible and powerful.  
 * Keep in mind patterns, obfuscation and encapsulation.  In writing this code, you should have the following characteristics:
 * Upper case letters
 * Lower case letters
 * digits
 * special characters
 * min/max length
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Chris Scarola
 * @version 3.0
 * @since Mar 9, 2021
 * @updates:
 ****************************************************************************/
public class PasswordValidator {
	private final int minLength;
	private final int maxLength;
	private final int upperAmt;
	private final int lowerAmt;
	private final int specialAmt;
	private final int digitsAmt;
	
//	public static boolean validate(String password) {
//		for (var variable : PasswordValidator.class.getDeclaredFields()) {
//			// reflectively invoke each define field as a function for truth
//			Method m = PasswordValidator.class.getMethod(PasswordValidator.class, variable.getName());
//			if (m.invoke(variable.value())) {
//				continue;
//			} else {
//				return false;
//			}
//		}
//	}
	
	private PasswordValidator(PassValBuilder builder)
	{
		this.minLength = builder.minLength;
		this.maxLength = builder.maxLength;
		this.upperAmt = builder.upperAmt;
		this.lowerAmt = builder.lowerAmt;
		this.specialAmt = builder.specialAmt;
		this.digitsAmt = builder.digitsAmt;
	}
	
	private static boolean minLength(String password, Integer min)
	{
		return password.length() >= min;
	}
	
	private static boolean maxLength(String password, Integer max)
	{
		return password.length() <= max;
	}
	
	private static boolean hasUpper(String password, Integer amt)
	{
		Integer count = 0;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) count++;
		}
		return count >= amt;
	}
	
	private static boolean hasLower(String password, Integer amt)
	{
		Integer count = 0;
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) count++;
		}
		return count >= amt;
	}
	
	private static boolean hasDigit(String password, Integer amt)
	{
		Integer count = 0;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) count++;
		}
		return count >= amt;
	}
	
	private static boolean hasSpecial(String password, Integer amt)
	{
		return password.length() - password.replaceAll("\\$","").length() >= amt;
	}
	
	public static class PassValBuilder
	{
		private int minLength = 0;
		private int maxLength = 0;
		private int upperAmt = 0;
		private int lowerAmt = 0;
		private int specialAmt = 0;
		private int digitsAmt = 0;
		
		public PassValBuilder() {
			// Intentionally Blank
		}
		
		public PasswordValidator build() {
			return new PasswordValidator(this);
		}
		public PassValBuilder minimumLength(int amt) {
			this.minLength = amt;
			return this;
		}
		public PassValBuilder maximumLength(int amt) {
			this.maxLength = amt;
			return this;
		}
		public PassValBuilder upperCount(int amt) {
			this.upperAmt = amt;
			return this;
		}
		public PassValBuilder lowerCount(int amt) {
			this.lowerAmt = amt;
			return this;
		}
		public PassValBuilder specialCount(int amt) {
			this.specialAmt = amt;
			return this;
		}
		public PassValBuilder digitsCount(int amt) {
			this.digitsAmt = amt;
			return this;
		}
		
	}
	
}
//Student s1 = new StudentBuilder().name("Eli").buildStudent();
//Student s2 = new StudentBuilder()
//                 .name("Spicoli")
//                 .age(16)
//                 .motto("Aloha, Mr Hand")
//                 .buildStudent();