package com.code.java.company.AthenaHealth.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://takeuforward.org/graph/breadth-first-search-bfs-level-order-traversal/
 * 
 * 
Breadth First Search Technique
Breadth -> level wise

starting node=1
             [1]    ----------[0]
           /     \
        [2]        [6]  -------[1]
      /     \     /     \
    [3]     [4] [7]     [8] ----[2]
             \   /
               [5]  -------------[3]

BFS= 1 2 6 3 4 7 8 5
 */
public class _1BFS {
    public static void main(String[] args) {
    int V = 8; // Number of nodes (1-based indexing)
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
    // Edges based on the diagram and BFS order
    adj.get(0).add(1); // 1-2
    adj.get(0).add(5); // 1-6
    adj.get(1).add(0);
    adj.get(1).add(2); // 2-3
    adj.get(1).add(3); // 2-4
    adj.get(2).add(1);
    adj.get(2).add(4); // 3-5
    adj.get(2).add(5); // 3-6
    adj.get(3).add(1);
    adj.get(3).add(6); // 4-7
    adj.get(4).add(2);
    adj.get(5).add(0);
    adj.get(5).add(2);
    adj.get(5).add(6); // 6-7
    adj.get(5).add(7); // 6-8
    adj.get(6).add(3);
    adj.get(6).add(5);
    adj.get(6).add(7);
    adj.get(7).add(5);
    adj.get(7).add(6);

    _1BFS bfs = new _1BFS();
    ArrayList<Integer> ans = bfs.bfsOfGraph(V, adj);
    for(int i = 0; i < ans.size(); i++) {
        System.out.print((ans.get(i)+1) + " "); // +1 for 1-based output
    }
    }
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){
                if(vis[it] ==false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
