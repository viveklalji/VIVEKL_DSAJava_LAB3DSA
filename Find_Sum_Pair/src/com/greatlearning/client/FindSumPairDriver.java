package com.greatlearning.client;

import com.greatlearning.service.FindSumPair;
import com.greatlearning.service.FindSumPair.Node;

public class FindSumPairDriver {

	public static void main(String[] args) {
		Node root = null;

		FindSumPair findSP = new FindSumPair();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);

		int sum = 130;
		System.out.println("sum = 130 ");
		findSP.findPairWithGivenSum(root, sum);
	}

}
