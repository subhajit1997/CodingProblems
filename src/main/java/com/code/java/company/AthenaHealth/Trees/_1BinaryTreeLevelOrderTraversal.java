package com.code.java.company.AthenaHealth.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://takeuforward.org/data-structure/level-order-traversal-of-a-binary-tree/
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.val=0;
        this.left=null;
        this.right=null;
    }
    TreeNode(int x){
        this.val=x;
        this.left=null;
        this.right=null;
    }
    TreeNode(int x,TreeNode left,TreeNode right){
        this.val=x;
        this.left=left;
        this.right=right;
    }
}
public class _1BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        _1BinaryTreeLevelOrderTraversal traverse = new _1BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result =  traverse.levelOrder(root);
        for(List<Integer> level:result){
            for(int num: level){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root){
         List<List<Integer>> ans = new ArrayList<>();
         if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
