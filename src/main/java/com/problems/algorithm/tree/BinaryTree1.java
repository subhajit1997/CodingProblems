package com.problems.algorithm.tree;

import java.util.Scanner;

//https://www.baeldung.com/java-binary-tree#:~:text=A%20binary%20tree%20is%20a,in%20the%20right%20sub%2Dtree.
public class BinaryTree1 {
	static Node1 root;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BinaryTree1 bt1 = new BinaryTree1();
		bt1.createBinaryTree();
		inOrderTraversal(root);
		System.out.println("\nEnter value to check if present");
		int findVal = sc.nextInt();
		System.out.println("value " + findVal + " present in tree: " + bt1.containsNode(findVal));
		System.out.println("\nEnter value to delete:");
		int delVal=sc.nextInt();
		bt1.delete(delVal);
		inOrderTraversal(root);
	}

	public static void inOrderTraversal(Node1 current) {
		if (current == null)
			return;
		inOrderTraversal(current.left);
		System.out.print(current.value + " ");
		inOrderTraversal(current.right);
	}

	private Node1 addRecursive(Node1 current, int value) {
		if (current == null) {
			return new Node1(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;

	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private BinaryTree1 createBinaryTree() {
		BinaryTree1 bt = new BinaryTree1();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		return bt;
	}

	public boolean containsNodeRecursive(Node1 current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return ((value < current.value) ? (containsNodeRecursive(current.left, value))
				: (containsNodeRecursive(current.right, value)));
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
	public Node1 deleteRecursive(Node1 current, int value) {
		if (current == null)
			return null;
		if (value == current.value) {
			// no children
			if (current.left == null && current.right == null) {
				return null;
			}

			// only one child node
			if (current.right == null)
				return current.left;

			if (current.left == null)
				return current.right;

			// 2 children node
			int smallVal = findSmallestNode(current.right);
			current.value = smallVal;
			current.right = deleteRecursive(current.right, smallVal);
			return current;
		}
		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestNode(Node1 currentNode) {
		return currentNode.left == null ? currentNode.value : findSmallestNode(currentNode.left);
	}
}

class Node1 {
	int value;
	Node1 right;
	Node1 left;

	Node1(int value) {
		this.value = value;
		right = null;
		left = null;

	}
}