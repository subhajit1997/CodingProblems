package com.code.java.practice.leetcode.randomSolution;

/*

1791. Find Center of Star Graph

https://leetcode.com/problems/find-center-of-star-graph/

There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

 

 */

public class Solution1791 {
	public static void main(String[] args) {
		Solution1791 solution = new Solution1791();
		int[][] val = {{1,2},{2,3},{4,2}};
		System.out.println(solution.findCenter(val));
	}

	public int findCenter(int[][] edges) {
		int common1 = edges[0][0];
		int common2 = edges[0][1];
		for (int i = 1; i < edges.length; i++) {
			int[] star = edges[i];
			for (int j : star) {
				if (common1 == j || common2 == j) {
					common1 = j;
					common2 = j;
				}
			}

		}
		return common1;
	}
}