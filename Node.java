package com.ds.bt;

public class Node implements Comparable<Node> {
	int key;
	Node left, right;

	public Node(int key) {
		this.key = key;
		left = right = null;
	}


	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
