package com.shivani.binarysearchtree;
import com.shivani.binarysearchtree.services.*;
import java.io.*;

public class Main{
	
	public static void main (String[] args)
	{

		BST tree = new BST();
		Node node;
		
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left= new Node(55);
		
		Node rightSkewedTree = tree.flattenBTToSkewed(node);
		System.out.println(" The resultant output is:"+" ");
		tree.traverseRightSkewedTree(rightSkewedTree);
	}	

}
