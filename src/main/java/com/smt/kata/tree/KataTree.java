package com.smt.kata.tree;

import java.util.ArrayList;
import java.util.LinkedList;
// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: KataTree.java <b>Project</b>: Daily-Kata <b>Description: </b>
 * This kata helps us build a tree data structure from a collection of nodes
 * that have ids and parent ids. This is an important structure to understand as
 * we will need to convert a collection of elements form a database (ids and
 * parent ids) and convert the data into an actual linked data structure or
 * tree.
 * 
 * In this Kata, you will be receiving a collection of node objects that have
 * the proper linkage, but are not linked as a tree. You must fill out the tree
 * properly as well as link the children and parent nodes to each other
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 13, 2021
 * @updates:
 ****************************************************************************/
public class KataTree<T> {
	// Members
	private KataNode<T> root;
	private int totalNodeCount = 0;

	/**
	 * Creates a Tree of nodes based upon a Collection of unlinked nodes. Uses the
	 * assigned Node as the root node. The nodeId and the prentId is included in
	 * each node in the list. Builds the
	 * 
	 * @param data Collection of unlinked Node objects
	 * @param root Root Node object
	 */
	public KataTree(List<KataNode<T>> data, KataNode<T> root) {
		this.root = root;
		addChildren(data, root);
	}

	private void addChildren(List<KataNode<T>> data, KataNode<T> root) {
		if (root == null) return;
		var rootChildren = new ArrayList<KataNode<T>>();
		var queue = new ArrayList<KataNode<T>>();
		var children = new ArrayList<KataNode<T>>();

		for (var node : data) {
			if (node.getParentId().equals(root.getNodeId())) {
				rootChildren.add(node);
				queue.add(node);
			} else
				children.add(node);
		}
		rootChildren.sort((n1, n2) -> n1.getNodeId().compareTo(n2.getNodeId()));
		root.setChildren(rootChildren);

		children.sort((n1, n2) -> n1.getNodeId().compareTo(n2.getNodeId()));
		for (var newRoot : queue) {
			addChildren(children, newRoot);
		}

		this.totalNodeCount++;
	}

	private int calculateDepth(KataNode<T> node) {
		if (node == null) return 0;
		var children = node.getChildren();
		if (children.isEmpty()) return 1;

		var depth = 0;
		for (var child : children)
			depth = Math.max(depth, calculateDepth(child));

		return depth + 1;
	}

	/**
	 * Returns the total depth of the tree
	 * 
	 * @return
	 */
	public int getDepth() {
		return calculateDepth(this.root);
	}

	/**
	 * Retrieves the root node, which, if the tree is built properly, would contain
	 * the entire tree object
	 * 
	 * @return Root node for this tree
	 */
	public KataNode<T> getRootNode() {
		return root;
	}

	/**
	 * Calculates the total number of nodes
	 * 
	 * @return Total number of nodes calculated
	 */
	public int getTotalNodeCount() {
		return totalNodeCount;
	}

	/**
	 * Finds a node based upon its id
	 * 
	 * @return node corresponding to the ID. Null if not found
	 */
	public KataNode<T> find(String nodeId) {
		var list = new ArrayList<KataNode<T>>();
		levelOrderTraversal(root, list);
		
		for (var item : list)
			if (item.getNodeId().equals(nodeId)) 
				return item;

		return null;
	}
	
	private KataNode<T> copyNode(KataNode<T> node) {
		return new KataNode<>(node.getNodeId(), node.getParentId(), node.getData());
	}

	/**
	 * Gets a collection of nodes
	 * 
	 * @return collection is provided in a preorder list formatting
	 */
	public List<KataNode<T>> getPreOrderList() {
		var temp = new ArrayList<KataNode<T>>();
		preOrderTraversal(this.root, temp);
		var result = new ArrayList<KataNode<T>>();
		for (var node : temp) {
			result.add(copyNode(node));
		}

		return result;
	}

	/**
	 * root
	 * left ...rest except last
	 * right
	 * @param root
	 * @param result
	 */
	private void preOrderTraversal(KataNode<T> root, List<KataNode<T>> result) {
		if (root == null) return;
		var children = root.getChildren();
		if (!children.isEmpty()) {
			result.add(root);

			var childCount = children.size();
			for (var i = 0; i < childCount - 1; ++i)
				inOrderTraversal(children.get(i), result);

			inOrderTraversal(children.get(childCount - 1), result);
		} else {
			result.add(root);
		}
	}

	/**
	 * Gets a collection of nodes
	 * 
	 * @return collection is provided in a inorder list formatting
	 */
	public List<KataNode<T>> getInOrderList() {
		var temp = new ArrayList<KataNode<T>>();
		inOrderTraversal(this.root, temp);
		var result = new ArrayList<KataNode<T>>();
		for (var node : temp) {
			result.add(copyNode(node));
		}

		return result;
	}

	/**
	 * left ...rest except last
	 * root
	 * right
	 * @param root
	 * @param result
	 */
	private void inOrderTraversal(KataNode<T> root, List<KataNode<T>> result) {
		if (root == null) return;
		var children = root.getChildren();
		if (!children.isEmpty()) {
			var childCount = children.size();
			for (var i = 0; i < childCount - 1; ++i)
				inOrderTraversal(children.get(i), result);

			result.add(root);
			inOrderTraversal(children.get(childCount - 1), result);
		} else {
			result.add(root);
		}
	}

	/**
	 * Gets a collection of nodes
	 * 
	 * @return collection is provided in a postorder list formatting
	 */
	public List<KataNode<T>> getPostOrderList() {
		var temp = new ArrayList<KataNode<T>>();
		postOrderTraversal(this.root, temp);
		var result = new ArrayList<KataNode<T>>();
		for (var node : temp) {
			result.add(copyNode(node));
		}

		return result;
	}

	/**
	 * left ...rest except last
	 * right
	 * root
	 * @param root
	 * @param result
	 */
	private void postOrderTraversal(KataNode<T> root, List<KataNode<T>> result) {
		if (root == null) return;
		var children = root.getChildren();
		if (!children.isEmpty()) {
			var childCount = children.size();
			for (var i = 0; i < childCount - 1; ++i)
				inOrderTraversal(children.get(i), result);

			inOrderTraversal(children.get(childCount - 1), result);
			result.add(root);
		} else {
			result.add(root);
		}
	}

	/**
	 * Gets a collection of nodes
	 * 
	 * @return collection is provided in a level order list formatting
	 */
	public List<KataNode<T>> getLevelOrderList() {
		var temp = new ArrayList<KataNode<T>>();
		levelOrderTraversal(this.root, temp);
		var result = new ArrayList<KataNode<T>>();
		for (var node : temp) {
			result.add(copyNode(node));
		}

		return result;
	}
	
	/**
	 * go sideways
	 * @param root
	 * @param result
	 */
	private void levelOrderTraversal(KataNode<T> root, List<KataNode<T>> result) {
		if (root == null) return;
		
		var queue = new LinkedList<KataNode<T>>();
		queue.add(root);
		
		while (! queue.isEmpty()) {
			var node = queue.removeFirst();
			var children = node.getChildren();
			
			result.add(node);
			
			for (var child : children) 
				queue.add(child);			
		}
	}
}
