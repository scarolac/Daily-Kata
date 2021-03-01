package com.smt.kata.data;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: TagParser.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> In a tag-based language like XML or HTML, contents are 
 * enclosed between a start tag and an end tag like <tag>contents</tag>. Note 
 * that the corresponding end tag starts with a /.
 * 
 * Given a string of text in a tag-based language, parse this text and retrieve the 
 * contents enclosed within sequences of well-organized tags meeting the following criterion:
 * 
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> 
 * is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
 * Tags can be nested as many times as you'd like
 * For example, in <h1><a>contents</a></h1>, contents is valid.
 * 
 * Process each tag and add the valid tags into a collection of tags Tags can consist 
 * of any printable characters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 27, 2021
 * @updates:
 ****************************************************************************/
public class TagParser {

	/**
	 * 
	 */
	public TagParser() {
		super();
	}

	/**
	 * Parses the content into 
	 * @param content
	 * @return
	 */
	public List<String> evaluateTags(String tag) {
		List<String> tags = new ArrayList<>();
		return tags;
	}
}
