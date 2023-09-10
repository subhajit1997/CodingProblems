package com.problems.practice.leetcode.randomSolution;

import java.util.ArrayList;
import java.util.List;

/*
1431. Kids With the Greatest Number of Candies
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.

 
 */

class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> out = new ArrayList<Boolean>();
		int max = 0;
		for (int i : candies) {
			if (max < i)
				max = i;
		}
		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) >= max)
				out.add(true);
			else
				out.add(false);
		}
		return out;
	}
}