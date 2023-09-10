package com.problems.practice.leetcode.randomSolution;

import java.util.HashSet;
import java.util.Set;

/*
1832. Check if the Sentence Is Pangram
https://leetcode.com/problems/check-if-the-sentence-is-pangram/

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */

class Solution1832 {
	public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26)
			return false;
		Set<Character> rel = new HashSet<>();
		char[] sent = sentence.toCharArray();
		for (char s : sent) {
			rel.add(s);
		}
		return rel.size() == 26;

	}
}