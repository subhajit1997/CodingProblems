package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_2;

/**
 * learn:https://takeuforward.org/data-structure/check-if-the-binary-tree-is-balanced-binary-tree/
 * practice: https://leetcode.com/problems/balanced-binary-tree/
 *
 *
 */
public class _2CheckIfTheBinaryTreeIsHeightBalancedOrNot {

    //Brute forcer approach Time :  O(N*N)
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root) {
        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    //Optimised :
    //using postTraversal , Time:O(N)
    public boolean isBalancedOptimised(TreeNode root) {
        return (dfsHeight(root)!=-1);
    }

    public int dfsHeight(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = dfsHeight(root.left);
        if(leftHeight ==-1)
            return -1;
        int rightHeight = dfsHeight(root.right);
        if(rightHeight == -1)
            return -1;
        if(Math.abs(leftHeight - rightHeight)>1)
            return -1;
        return Math.max(leftHeight,rightHeight)+1;

    }
}
    

