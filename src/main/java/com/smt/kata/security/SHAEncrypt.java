package com.smt.kata.security;

// JDK 11.x
import java.security.NoSuchAlgorithmException;

/****************************************************************************
 * <b>Title:</b> SHAEncrypt.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Perform a one way SHA hash on the provided text.  This 
 * will provide a one way hash the the provided phrase.  One way hashes encrypt
 * data that cannot be decrypted and are often used to store user passwords.  Set the
 * default hash to SHA-256 for this class
 * 
 * You may NOT use any SMT libraries to do this or other completed code
 * (though you may use snippets).  You may use the Internet to research how to do it
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 24, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class SHAEncrypt {

	/**
	 * Default constructor.  Assigns SHA-256
	 */
	public SHAEncrypt() {
		super();
	}
	
	/**
	 * Assigns the alogrithm applied
	 * @param hashDigestType
	 */
	public SHAEncrypt(String hashDigestType) {
		super();
	}

	/**
	 * 
	 * @param val
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidDataException
	 */
	public String encrypt(String val) throws NoSuchAlgorithmException {
		return val;
	}
}
