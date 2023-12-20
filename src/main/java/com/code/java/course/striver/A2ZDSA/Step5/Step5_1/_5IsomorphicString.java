package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

/**
 * practice: https://leetcode.com/problems/isomorphic-strings/description/
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 */
public class _5IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }

    //Best solution O(N)
    public static boolean isIsomorphic(String s, String t) {
        int[] val1 = new int[200];
        int[] val2 = new int[200];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(val1[s.charAt(i)]!=val2[t.charAt(i)])
                return false;
            val1[s.charAt(i)]= i+1;
            val2[t.charAt(i)]=i+1;
        }


        return true;
    }
}
