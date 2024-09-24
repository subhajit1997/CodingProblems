package com.code.java.company.Lenskart;

import java.util.*;

/**
 * learn: https://takeuforward.org/data-structure/vertical-order-traversal-of-binary-tree/
 * prcactice: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */

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


class Tuple {
    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}

public class VerticalOrderTraversalOfBinaryTree {
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        // TreeMap to store nodes based on their x-coordinate and y-coordinate
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // Queue for BFS traversal of the tree
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0, 0));

        // Perform BFS traversal
        while (!q.isEmpty()) {
            Tuple tuple = q.remove();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            // If x-coordinate is not in the map, create a new TreeMap for it
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            // If y-coordinate is not in the TreeMap for the current x, create a new PriorityQueue for it
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            // Add the node value to the PriorityQueue at the specified x and y coordinates
            map.get(x).get(y).add(node.val);

            // Add left and right children to the queue with updated coordinates
            if (node.left != null) {
                q.add(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.add(new Tuple(node.right, x + 1, y + 1));
            }
        }

        // Convert the TreeMap structure to a list of lists
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                // Extract values from the PriorityQueue and add them to the result list
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.remove());
                }
            }
        }

        // Return the final result
        return list;
    }
    public static void main(String args[]) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);

        List < List < Integer >> list = new ArrayList < > ();
        list = verticalTraversal(root);

        System.out.println("The Vertical Traversal is : ");
        for (List < Integer > it: list) {
            for (int nodeVal: it) {
                System.out.print(nodeVal + " ");
            }
            System.out.println();
        }

    }
}
