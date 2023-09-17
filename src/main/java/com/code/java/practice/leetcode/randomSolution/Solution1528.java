package com.code.java.practice.leetcode.randomSolution;

/*
1528. Shuffle String
https://leetcode.com/problems/shuffle-string/

Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:


Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */

class Solution1528 {
	public String restoreString(String s, int[] indices) {
		char[] c = s.toCharArray();
		int size = indices.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (indices[i] > indices[j]) {
					char t = c[i];
					int temp = indices[i];
					c[i] = c[j];
					indices[i] = indices[j];
					c[j] = t;
					indices[j] = temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(c);
		return sb.toString();
	}
}