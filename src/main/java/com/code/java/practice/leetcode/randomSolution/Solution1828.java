package com.code.java.practice.leetcode.randomSolution;

/*
1828. Queries on Number of Points Inside a Circle
https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/

You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

Return an array answer, where answer[j] is the answer to the jth query.

 
 */

class Solution1828 {
		public int[] countPoints(int[][] points, int[][] queries) {
			int[] queriCount = new int[queries.length];
			for (int i = 0; i < queries.length; i++) {
				int[] subQ = queries[i];
				int count = 0;
				for (int j = 0; j < points.length; j++) {
					int[] subP = points[j];
					if (checkpont(subQ[0], subP[0], subQ[1], subP[1], subQ[2]))
						count++;
				}
				queriCount[i] = count;
			}
			return queriCount;
		}

		public boolean checkpont(int x, int x1, int y, int y1, int r) {
			return ((((x - x1) * (x - x1)) + ((y - y1) * ((y - y1)))) <= (r * r));
		}
}