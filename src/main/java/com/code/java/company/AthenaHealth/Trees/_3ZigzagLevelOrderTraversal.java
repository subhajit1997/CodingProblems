package com.code.java.company.AthenaHealth.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * https://takeuforward.org/data-structure/zig-zag-traversal-of-binary-tree/
 */

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class _3ZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> res = zigZagOrder(root);
        printRes(res);
    }
    public static List<List<Integer>> zigZagOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        //queue to perform level order traversal
        Queue<Node> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        //flag for left or right
        boolean leftToRight = true;
        while (!nodeQ.isEmpty()) {
            int size = nodeQ.size();

            LinkedList<Integer> row = new LinkedList<>();
            for(int i=0;i<size;i++){
                Node node = nodeQ.poll();                
                if(leftToRight){
                    row.addLast(node.data);
                } else {
                    row.addFirst(node.data);
                }
                if(node.left!=null)
                    nodeQ.add(node.left);
                if(node.right!=null)
                    nodeQ.add(node.right);
                
            }
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }
    public static void printRes(List<List<Integer>> result){
        for(List<Integer> row:result){
            for(int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
