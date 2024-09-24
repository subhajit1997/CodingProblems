package com.code.java.course.striver.A2ZDSA.Step15_Graphs.Step15_2;

import java.util.ArrayList;

/**
 * practice:https://leetcode.com/problems/number-of-provinces/
 * learn:https://takeuforward.org/data-structure/number-of-provinces/
 *
 * 547. Number of Provinces
 * There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
 *
 * A province is a group of directly or indirectly connected cities and no other cities outside of the group.
 *
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
 *
 * Return the total number of provinces.
 */
public class _1NumberOfProvinces {
    //       Time: O(N) +O(V+2*E)
    //         space: O(N) +O(N)
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 0;
        for(int[] i: isConnected){
            adj.add(new ArrayList<Integer>());
            for(int j:i)
            {
                adj.get(v).add(j);
            }
            v++;
        }
        return  numProvinces(adj,v);
    }
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs ,    int vis[]) {
        vis[node] = 1;
        for(Integer it: adjLs.get(node)) {
            if(vis[it] == 0) {
                dfs(it, adjLs, vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<V;i++) {
            adjLs.add(new ArrayList<Integer>());
        }

        // to change adjacency matrix to list
        for(int i = 0;i<V;i++) {
            for(int j = 0;j<V;j++) {
                // self nodes are not considered
                if(adj.get(i).get(j) == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int cnt = 0;
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                cnt++;
                dfs(i, adjLs, vis);
            }
        }
        return cnt;
    }
}
