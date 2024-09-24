package com.code.java.company.Lenskart;
/**
 * https://www.codingninjas.com/studio/problems/h_920463?&interviewProblemRedirection=true
 *
 * Problem statement
 * You are given an array/list ‘ARR’ representing pre-order traversal of a Binary Search Tree (BST). If each non-leaf node of the tree has only one child, then return true otherwise, return false.
 *
 * A binary search tree (BST) is a binary tree data structure with the following properties:
 *
 * • The left subtree of a node contains only nodes with data less than the node’s data.
 *
 * • The right subtree of a node contains only nodes with data greater than the node’s data.
 *
 * • Both the left and right subtrees must also be binary search trees.
 *
 *
 * Assume that the BST contains unique entries.
 */

import java.util.ArrayList;

public class ExactlyOneChild_BST {
    public static void main(String[] args) {

    }
    public static boolean hasExactlyOneChild(ArrayList<Integer> arr, int n) {
        return hasExactlyOneChildOperation(arr,n,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    }
    public static boolean hasExactlyOneChildOperation(ArrayList<Integer> arr,int n,int min,int max,int index){

        if(index==n)
            return true;
        int val = arr.get(index);
        if(val<min || val>max)
            return false;
        boolean left = hasExactlyOneChildOperation(arr,n,min,val,index+1);
        boolean right = hasExactlyOneChildOperation(arr,n,val,max,index+1);
        return left || right;

    }
}
