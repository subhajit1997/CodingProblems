package com.code.java.course.striver.A2ZDSA.Step14_BinarySearchTrees.Step14_2;

/**
 * practice: https://leetcode.com/problems/delete-node-in-a-bst/description/
 *
 * 450. Delete Node in a BST
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 *
 * Basically, the deletion can be divided into two stages:
 *
 * Search for a node to remove.
 * If the node is found, delete the node.
 */
public class _4DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
        if(root.val==key)
            return helper(root);
        TreeNode current = root;
        while(current!=null){
            if(current.val > key){
                if(current.left!=null &&  current.left.val ==key ){
                    current.left = helper(current.left);
                    break;
                }else
                    current = current.left;
            }else{
                if(current.right!=null && current.right.val ==key){
                    current.right = helper(current.right);
                    break;
                }else
                    current= current.right;
            }
        }
        return root;
    }
    public static TreeNode helper(TreeNode root){
        if(root.left ==null)
            return root.right;
        else if( root.right == null)
            return root.left;
        else{
            TreeNode rightChild = root.right;
            TreeNode lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
            return root.left;
        }

    }
    public static TreeNode findLastRight(TreeNode root){
        if(root.right == null)
            return root;
        return findLastRight(root.right);
    }
}
