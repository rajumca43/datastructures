package com.ds.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BTNonRecTraversal {

	// non-recursive java program for inorder traversal
	Node root;

	void postorder() {
		if (root == null)
			return;

		Stack<Node> stack = new Stack();
		stack.push(root);

		Stack<Integer> out = new Stack();
		while (!stack.empty()) {

			Node currentNode = stack.pop();
			out.push(currentNode.key);

			if (currentNode.left != null) {
				stack.push(currentNode.left);
			}

			if (currentNode.right != null) {
				stack.push(currentNode.right);
			}
		}

		while (!out.empty()) {
			System.out.print(out.pop() + " ");
		}
	}

	void preOrder() {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();
		List<Integer> out = new ArrayList<>();

		Node curr = root;

		while (curr != null || stack.size() > 0) {

			while (curr != null) {
				stack.push(curr);
				out.add(curr.key);
				curr = curr.left;
			}
			curr = stack.pop();
			curr = curr.right;

		}

		for (Integer i : out) {
			System.out.print(i + " ");
		}

	}

	void inOrder() {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();
		List<Integer> out = new ArrayList<>();

		Node curr = root;

		while (curr != null || stack.size() > 0) {

			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			out.add(curr.key);
			curr = curr.right;

		}

		for (Integer i : out) {
			System.out.print(i + " ");
		}

	}

	void orderByLevel() {
		if (root == null)
			return;

		Queue<Node> stack = new PriorityQueue<>();
		stack.add(root);

		Queue<Integer> out = new PriorityQueue<>();
		while (!stack.isEmpty()) {

			Node currentNode = stack.poll();

			if (currentNode.left != null) {
				stack.add(currentNode.left);
			}

			if (currentNode.right != null) {
				stack.add(currentNode.right);
			}
			out.add(currentNode.key);
		}

		while (!out.isEmpty()) {
			System.out.print(out.poll() + " ");
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		BTNonRecTraversal tree = new BTNonRecTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Order By Level");
		tree.orderByLevel();
		System.out.println();
		System.out.println("Post order :: ");
		tree.postorder();
		System.out.println();
		System.out.println("Pre order :: ");
		tree.preOrder();
		System.out.println();
		System.out.println("In order :: ");
		tree.inOrder();

	}
}
//12453