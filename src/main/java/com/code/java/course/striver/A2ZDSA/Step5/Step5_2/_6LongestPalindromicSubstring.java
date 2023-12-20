package com.code.java.course.striver.A2ZDSA.Step5.Step5_2;

/**
 * <IMPORTANT>
 * practice: https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 */
public class _6LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int size = s.length();
        if(size<2)
            return s;
        int start=0,end=0;
        for(int i=0;i<size;i++){
            int lenMaxPalindrome = Math.max(fromCenter(s,i,i),fromCenter(s,i,i+1));
            if(lenMaxPalindrome> end-start+1){
                start= i-((lenMaxPalindrome-1)/2);
                end = i+lenMaxPalindrome/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int fromCenter(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
