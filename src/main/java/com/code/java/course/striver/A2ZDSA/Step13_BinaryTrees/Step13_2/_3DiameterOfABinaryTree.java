package com.code.java.course.striver.A2ZDSA.Step13_BinaryTrees.Step13_2;

/**
 * practice:https://leetcode.com/problems/diameter-of-binary-tree/
 * learn:https://takeuforward.org/data-structure/calculate-the-diameter-of-a-binary-tree/
 */
public class _3DiameterOfABinaryTree {

    //Post order tarversal approach : Time : O(N)
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        diameter = Math.max(diameter, leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
