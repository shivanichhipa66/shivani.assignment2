package com.shivani.binarysearchtree.services;
import com.shivani.binarysearchtree.services.*;
import java.io.*;

public class BST
{

	Node prevNode = null;
	Node headNode = null;


	public Node flattenBTToSkewed(Node root)
	{

		// Base Case
		if(root == null)
		{
			return null;
		}

		flattenBTToSkewed(root.left);

		Node rightNode = root.right;

		if(headNode == null) {
			headNode = root;
			root.left= null;
			root.left = null;
			prevNode= root;
		}else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewed(rightNode);

		return headNode;
	}



	public void traverseRightSkewedTree(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.val +" ");
		traverseRightSkewedTree(root.right);
	}
}