package com.code.java.course.striver.A2ZDSA.Step14_BinarySearchTrees.Step14_2;

import java.util.Stack;

/**
 * practice: https://leetcode.com/problems/binary-search-tree-iterator/description/
 * learn: https://www.youtube.com/watch?v=D2jMcmxU4bs
 *
 * 173. Binary Search Tree Iterator
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
 *
 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
 * boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
 * int next() Moves the pointer to the right, then returns the number at the pointer.
 * Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.
 *
 * You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
 */
public class _10BinarySearchTreeIterator {

    // Below time complexity : O(height) , space : O(1),
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    public _10BinarySearchTreeIterator(TreeNode root) {
        pushAll(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
    private void pushAll(TreeNode node){
        for(; node!=null ; stack.push(node), node=node.left);
    }
}
