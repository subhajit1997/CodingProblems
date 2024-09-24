package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_2;

/**
 * learn:https://takeuforward.org/data-structure/maximum-sum-path-in-binary-tree/
 * practice: https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
 *
 *
 * 124. Binary Tree Maximum Path Sum
 *
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 *
 * The path sum of a path is the sum of the node's values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 */
public class _4MaximumPathSum {

    //optimised solution , Time: O(N)
    public int maxPathSum(TreeNode root) {
        int maxVal[] = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPathDown(root,maxVal);
        return maxVal[0];
    }
    public static int maxPathDown(TreeNode root, int maxVal[]){
        if(root==null) return 0;
        int lVal = Math.max(0,maxPathDown(root.left,maxVal));
        int rVal = Math.max(0,maxPathDown(root.right,maxVal));
        maxVal[0] = Math.max(maxVal[0],(lVal+rVal+root.val));
        return Math.max(lVal,rVal)+root.val;
    }
}
