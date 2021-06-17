package com.smt.kata.tree;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: KataTreeTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit Test for the Tree/Node katas
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 13, 2021
 * @updates:
 ****************************************************************************/
class KataTreeTest {
	
	// Members
	List<KataNode<String>> nodes = new ArrayList<>();
	KataTree<String> tree;
	
	@BeforeEach
	public void initEach(){
		String rootParent = null;
		KataNode<String> root = new KataNode<String>("1", rootParent, "John");
	    nodes.add(new KataNode<String>("11", "1", "Steve"));
	    nodes.add(new KataNode<String>("12211", "1221", "Bill"));
	    nodes.add(new KataNode<String>("113", "11", "Ella"));
	    nodes.add(new KataNode<String>("12", "1", "Rohan"));
	    nodes.add(new KataNode<String>("122", "12", "Emma"));
	    nodes.add(new KataNode<String>("111", "11", "Lee"));
	    nodes.add(new KataNode<String>("121", "12", "Sal"));
	    nodes.add(new KataNode<String>("1222", "122", "Raj"));
	    nodes.add(new KataNode<String>("112", "11", "Bob"));
	    nodes.add(new KataNode<String>("1221", "111", "Tom"));
	    
	    tree = new KataTree<String>(nodes, root);
	}

	/**
	 * Test method for {@link com.smt.kata.tree.KataTree#getDepth()}.
	 */
	@Test
	void testGetDepth() throws Exception {
		assertEquals(5, tree.getDepth());
	}

	/**
	 * Test method for {@link com.smt.kata.tree.KataTree#getRootNode()}.
	 */
	@Test
	void testGetRootNode() throws Exception {
		assertEquals("John", tree.getRootNode().getData());
		assertEquals("1", tree.getRootNode().getNodeId());
		assertEquals(null, tree.getRootNode().getParentId());
	}

	/**
	 * Test method for {@link com.smt.kata.tree.KataTree#getTotalNodeCount()}.
	 */
	@Test
	void testGetTotalNodeCount() throws Exception {
		assertEquals(11, tree.getTotalNodeCount());
	}

}
