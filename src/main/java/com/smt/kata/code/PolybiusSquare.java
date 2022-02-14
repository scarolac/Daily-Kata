package com.smt.kata.code;

import java.util.HashMap;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: PolybiusSquare.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> The Polybius Square cipher is a simple substitution cipher 
 * that makes use of a 5x5 square grid. The letters A-Z are written into the grid, 
 * with "I" and "J" typically sharing a slot (as there are 26 letters and only 25 slots).

			1	2	3	4	5
		1	A	B	C	D	E
		2	F	G	H	I/J	K
		3	L	M	N	O	P
		4	Q	R	S	T	U
		5	V	W	X	Y	Z

 * To encipher a message, each letter is merely replaced by its row and column numbers in the grid.
 * Create a function that takes a plaintext or ciphertext message, and returns the corresponding ciphertext or plaintext.
 * As "I" and "J" share a slot, both are enciphered into 24, but deciphered only into "I" (see third and fourth test).
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class PolybiusSquare {

	/**
	 * Encodes a sentence into its polybius values
	 * @param term
	 * @return
	 */
	public String polybiusEncode(String term) {
		term = term.toLowerCase().replace("j", "i");
		var result = new StringBuilder();
		for (var letter : term.toCharArray()) {
			var code = encode.get(letter + "");
			result.append((code == null) ? " " : code);
		}

		return result.toString();
	}
	
	/**
	 * Decodes the polybius back to a string
	 * @param code
	 * @return
	 */
	public String decodeValue(String code) {
		var result = new StringBuilder();
		for (var codes : code.split(" ")) {
			for (var i = 0; i < codes.length(); i += 2) 
				result.append(decode.get(codes.substring(i, i + 2)));
			result.append(" ");
		}
		
		return result.toString().trim();
	}
	
	private static final Map<String, String> encode = new HashMap<>();
	static {
		encode.put("a", "11");
		encode.put("b", "12");
		encode.put("c", "13");
		encode.put("d", "14");
		encode.put("e", "15");
		encode.put("f", "21");
		encode.put("g", "22");
		encode.put("h", "23");
		encode.put("i", "24");
		encode.put("k", "25");
		encode.put("l", "31");
		encode.put("m", "32");
		encode.put("n", "33");
		encode.put("o", "34");
		encode.put("p", "35");
		encode.put("q", "41");
		encode.put("r", "42");
		encode.put("s", "43");
		encode.put("t", "44");
		encode.put("u", "45");
		encode.put("v", "51");
		encode.put("w", "52");
		encode.put("x", "53");
		encode.put("y", "54");
		encode.put("z", "55");
	}
	
	private static final Map<String, String> decode = new HashMap<>();
	static {
		decode.put("11", "a");
		decode.put("12", "b");
		decode.put("13", "c");
		decode.put("14", "d");
		decode.put("15", "e");
		decode.put("21", "f");
		decode.put("22", "g");
		decode.put("23", "h");
		decode.put("24", "i");
		decode.put("25", "k");
		decode.put("31", "l");
		decode.put("32", "m");
		decode.put("33", "n");
		decode.put("34", "o");
		decode.put("35", "p");
		decode.put("41", "q");
		decode.put("42", "r");
		decode.put("43", "s");
		decode.put("44", "t");
		decode.put("45", "u");
		decode.put("51", "v");
		decode.put("52", "w");
		decode.put("53", "x");
		decode.put("54", "y");
		decode.put("55", "z");
	}

}
