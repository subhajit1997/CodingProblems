package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_3;


/**
 * learn: https://takeuforward.org/data-structure/lowest-common-ancestor-for-two-given-nodes/
 * practice: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 */
public class _2LCA_InBinaryTree {

    // Time complexity : O(N)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null)
            return right;
        else if(right ==null)
            return left;
        else
            return root;
    }
}
