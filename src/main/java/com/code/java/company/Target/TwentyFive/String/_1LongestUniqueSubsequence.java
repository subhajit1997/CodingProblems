package com.code.java.company.Target.TwentyFive.String;

import java.util.HashMap;

public class _1LongestUniqueSubsequence {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(solve("abcabcbb"));
    }
    //time : O(N^2)
    static String longestSubstring(String str) {
        int n = str.length();
        int maxLength = 0;
        String longestSubstr = "";
    
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            String currentSubstr = "";
    
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)]) {
                    break;
                } else {
                    currentSubstr += str.charAt(j); 
                    visited[str.charAt(j)] = true;
    
                    if (currentSubstr.length() > maxLength) {
                        maxLength = currentSubstr.length();
                        longestSubstr = currentSubstr;
                    }
                }
            }
        }
        System.out.println("Longest Substring: " + longestSubstr);
        return longestSubstr;
    }
    //optimised
    static String solve(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
    
        int left = 0, right = 0;
        int n = s.length();
        int maxLength = 0;
        int start = 0; // To track the starting index of the longest substring
    
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) {
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }
    
            mpp.put(s.charAt(right), right);
    
            // Update the maximum length and starting index of the longest substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
    
            right++;
        }
    
        // Extract the longest substring using the starting index and maxLength
        return s.substring(start, start + maxLength);
    }
}
