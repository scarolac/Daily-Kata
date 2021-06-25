package com.smt.kata.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
// JDK 11.x
import java.util.List;
import java.util.Set;

/****************************************************************************
 * <b>Title</b>: LongestTreePath.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Longest Tree Path
 * Given a tree where each edge has a weight, compute the length of the longest path in the tree.
 * 
 * For example, given the following tree:
 *
 *	   a
 *	  /|\
 *	 b c d
 *	    / \
 *	   e   f
 *	  / \
 *	 g   h
 * 
 * and the weights: a-b: 3, a-c: 5, a-d: 8, d-e: 2, d-f: 4, e-g: 1, e-h: 1, the 
 * longest path would be c -> a -> d -> f, with a length of 17.
 *
 * The path does not have to pass through the root, and each node can have any amount of children.
 * Each node on the tree can only be used once.  This means that once you hit a leaf, the 
 * path is at the end, as you would have to backtrack and use the same node twice
 * 
 * The root path will always have a weight of 0.
 *
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 24, 2021
 * @updates:
 ****************************************************************************/
public class LongestTreePath {

	/**
	 * Calculates the longest path for the assigned weights at each node
	 * @param nodes Collection of nodes to calculate against
	 * @return Sum of the weights from each node in the path
	 */
	public int caclculatePath(List<KataNode<Integer>> nodes) {
		if (nodes == null || nodes.isEmpty()) return 0;
		
		// ------------ build tree ----------------
		KataNode<Integer> root = null;
		List<KataNode<Integer>> data = new ArrayList<>();
		for (var node : nodes)
			if (node.getParentId() == null) 
				root = node;
			else
				data.add(node);		
		
		var tree = new KataTree<>(data, root);
		// ---------- end build tree ---------------
		
		// start node  (anything)
		// go any direction up or down (recurse to parent, or all children)
		// add to visited list
		// check node value compare to total (total = Math.max(total, loop(child or parent)))
		// cannot repeat nodes
		// if no children stop (while !children.isempty())
//		var visited = new HashSet<String>();
		
		var longest = 0;
		for (var node : nodes) {
			var visited = new HashSet<String>();
			longest = Math.max(longest, findLongestPath(visited, tree, node));
		}
		
		
		return longest;
	}
	
	private int findLongestPath(Set<String> visited, KataTree<Integer> tree, KataNode<Integer> startNode) {
		// get node out of tree somehow
		var node = tree.find(startNode.getNodeId());
		visited.add(node.getNodeId());
		var parent = node.getParent();
		var children = node.getChildren();		
		
		// up
		var up = 0;
		if (parent != null && ! visited.contains(parent.getNodeId())) 
			up = Math.max(up, node.getData() + findLongestPath(visited, tree, parent));		
		
		// down		
		// loop the kids
		var down = 0;
		if (! node.isLeaf()) 
			for (var child : children) 
				if (! visited.contains(child.getNodeId())) 
					down = Math.max(down, child.getData() + findLongestPath(visited, tree, child));			

		return Math.max(up, down);
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }    
}
