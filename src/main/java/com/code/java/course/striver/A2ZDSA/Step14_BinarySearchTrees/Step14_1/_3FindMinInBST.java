package com.code.java.course.striver.A2ZDSA.Step14_BinarySearchTrees.Step14_1;

/**
 * practice: https://www.naukri.com/code360/problems/minimum-element-in-bst_8160462?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
 */
public class _3FindMinInBST {
        public static int minValue(Node root) {
        // Base case for empty tree.
        if (root == null)
            return -1;

        // Recursively searching for the minimum value.
        while (root.left != null)
        {
            root = root.left;
        }
        return root.data;
    }
}
class Node {
    public int data;
    public Node left;
    public Node right;

    Node()
    {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}