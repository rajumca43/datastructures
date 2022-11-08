package com.ds.bt;

public class BTTraversalRecursive {
	Node root;

	BTTraversalRecursive() {
		root = null;
	}

	/* Given a binary tree, print its nodes in preorder */
	void printInOrder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInOrder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");
		
		/* now recur on right child */
		printInOrder(node.right);
		
	}
	
	/* Given a binary tree, print its nodes in preorder */
	void printPostOrder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printPostOrder(node.left);

		/* now recur on right child */
		printPostOrder(node.right);
		
		/* then print the data of node */
		System.out.print(node.key + " ");
	
	}
	
	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* first recur on left child */
		printPreorder(node.left);

		/* now recur on right child */
		printPreorder(node.right);
	}

	

	// Driver code
	public static void main(String[] args) {
		BTTraversalRecursive tree = new BTTraversalRecursive();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		// Function call
		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInOrder(tree.root);
		System.out.println();
		tree.printPreorder(tree.root);
		System.out.println();
		tree.printPostOrder(tree.root);
	}
}
