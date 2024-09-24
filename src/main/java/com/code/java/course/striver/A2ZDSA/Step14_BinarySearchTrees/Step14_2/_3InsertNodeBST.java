package com.code.java.course.striver.A2ZDSA.Step14_BinarySearchTrees.Step14_2;

/**
 * practice: https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
 *
 * 701. Insert into a Binary Search Tree

 * You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 *
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
 */
public class _3InsertNodeBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        TreeNode current = root;
        while(true){
            if(current.val<=val){
                if(current.right!=null)
                    current = current.right;
                else{
                    current.right = new TreeNode(val);
                    break;
                }
            }else{
                if(current.left!=null)
                    current = current.left;
                else{
                    current.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
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
