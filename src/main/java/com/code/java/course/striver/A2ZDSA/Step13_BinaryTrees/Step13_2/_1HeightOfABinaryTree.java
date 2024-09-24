package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_2;

/**
 * learn:https://takeuforward.org/data-structure/maximum-depth-of-a-binary-tree/
 * prcatice: https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/1222386570/
 *
 * 104. Maximum Depth of Binary Tree
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class _1HeightOfABinaryTree {
    public int maxDepth(TreeNode root) {
        if(root ==null)
            return 0;
        else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return 1+ Math.max(leftDepth,rightDepth);
        }
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