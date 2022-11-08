package com.greatlearning.service;

import java.util.*;

public class FindSumPair {
	public static class Node {
		int nodeData;
		Node leftNode, rightNode;
	};

	static Node NewNode(int nodeData) {
		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null;
		temp.rightNode = null;

		return temp;
	}

	public Node insert(Node root, int key) {
		if (root == null)
			return NewNode(key);
		if (key < root.nodeData)
			root.leftNode = insert(root.leftNode, key);
		else
			root.rightNode = insert(root.rightNode, key);
		return root;
	}

	public boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {
		if (root == null) {
			return false;
		}

		if (findpairUtil(root.leftNode, sum, set)) {
			return true;
		}
		// check if the sum - root.nodeData
		if (set.contains(sum - root.nodeData)) {
			System.out.println("Pair is (" + (sum - root.nodeData) + ", " + root.nodeData + ")");
			return true;
		} else {
			set.add(root.nodeData);
			return findpairUtil(root.rightNode, sum, set);
		}
	}

	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		if (!findpairUtil(root, sum, set)) {
			System.out.println("Pairs do not exists");
		}
	}

}
