package com.code.java.course.striver.A2ZDSA.Step14_BinarySearchTrees.Step14_2;

import java.util.Stack;

/**
 * practice:https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 * learn:
 */
public class _11TwoSumBST {

    //Brute force:
    // Find in-order traversal store in array , which is generally sorted and solve using 2 sum solution
    // Time: O(N)+O(N) , SC: O(N)

    //Best approach
    //Time: O(N) , Size: O(Height)*2
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        int i = l.next();
        int j = r.next();
        while(i<j){
            if(i+j==k)
                return true;
            else if(i+j<k)
                i = l.next();
            else
                j = r.next();
        }
        return false;
    }

}
class BSTIterator{
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    boolean reverse = true;
    public BSTIterator(TreeNode root, boolean isReversed){
        reverse = isReversed;
        pushAll(root);
    }
    public void pushAll(TreeNode node){
        while(node!=null){
            stack.push(node);
            if(reverse)
                node = node.right;
            else
                node = node.left;
        }
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode node = stack.pop();
        if(!reverse)
            pushAll(node.right);
        else
            pushAll(node.left);
        return node.val;
    }
}