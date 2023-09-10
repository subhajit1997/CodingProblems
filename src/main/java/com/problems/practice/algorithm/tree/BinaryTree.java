package com.problems.practice.algorithm.tree;

import java.util.Scanner;

//Binary tree with create tree, inorder, postorder,preorder
public class BinaryTree {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node n = createTree();
		System.out.println("INORDER: ");
		inOrder(n);
		System.out.println("\nPREORDER ");
		preOrder(n);
		System.out.println("\nPOSTORDER ");
		postOrder(n);
	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left for: " + data);
		root.left = createTree();
		System.out.println("Enter right for: " + data);
		root.right = createTree();
		return root;
	}

	static void inOrder(Node root) {

		// LNR (left, node, right)
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	static void preOrder(Node root) {

		// LNR ( node,left, right)
		if (root == null)
			return;
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);
	}

	static void postOrder(Node root) {

		// LNR (left, right ,node)
		if (root == null)
			return;
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");
	}
}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}