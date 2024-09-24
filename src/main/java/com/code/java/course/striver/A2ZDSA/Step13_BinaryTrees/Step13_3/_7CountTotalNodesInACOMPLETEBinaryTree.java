package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_3;


/**
 * learn:https://takeuforward.org/binary-tree/count-number-of-nodes-in-a-binary-tree/
 * practice:https://leetcode.com/problems/count-complete-tree-nodes/
 */

public class _7CountTotalNodesInACOMPLETEBinaryTree {

    //Brute force approach
    //time complexity: O(N)
    // Function to count nodes in the binary tree
    public int countNodes(TreeNode root) {
        // Base case: If the root is null,
        // the tree is empty, return 0
        if (root == null) {
            return 0;
        }

        // Initialize count variable to
        // store the number of nodes
        int[] count = {0};

        // Call the inorder traversal
        // function to count nodes
        inorder(root, count);

        // Return the final count of
        // nodes in the binary tree
        return count[0];
    }

    public void inorder(TreeNode root, int[] count) {
        // Base case: If the current
        // node is null, return
        if (root == null) {
            return;
        }

        // Increment count
        // for the current node
        count[0]++;

        // Recursively call inorder
        // on the left subtree
        inorder(root.left, count);

        // Recursively call inorder
        // on the right subtree
        inorder(root.right, count);
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
