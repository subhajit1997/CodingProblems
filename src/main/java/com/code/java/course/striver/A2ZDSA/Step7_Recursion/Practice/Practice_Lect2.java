package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_Lect2 {
    public static void main(String[] args) {
        System.out.println(lect2_1(4));
    }
    /*
        Problem Statement: Generate Binary Strings Without Consecutive 1s
        Given an integer n, return all binary strings of length n that do not contain consecutive 1s. Return the result in lexicographically increasing order.
        A binary string is a string consisting only of characters '0' and '1'.
        Examples:
            Input: n = 3
            Output: ["000", "001", "010", "100", "101"]
            Explanation: All strings are of length 3 and do not contain consecutive 1s.        
    */
    public static List<String> lect2_1(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('0');
        }
        List<String> ans = new ArrayList<>();
        stringRecursion(0,sb,ans);
        return ans;
    }
    private static void stringRecursion(int i, StringBuilder sb, List<String> ans) {
        // Base case: If we've filled all positions,
        // add the string to results
        if(i>=sb.length()){
            ans.add(sb.toString());
            return;
        }
        // Case 1: Keep the current position as 
        // '0' and move to next position
        stringRecursion(i+1, sb, ans);
        // Case 2: Try placing '1' at current position. 
        // Skip the next position when we place a '1' 
        // to avoid consecutive 1's
        sb.setCharAt(i, '1');
        
        // Skip next position to avoid consecutive 1's
        stringRecursion(i+2, sb, ans);
        
        // Backtrack: Restore the current position back to '0'
        sb.setCharAt(i, '0');
    }
    /*
        Problem Statement:  Generate Parentheses
        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.   

        Example 1:
            Input: n = 3
            Output: ["((()))","(()())","(())()","()(())","()()()"]
    */

}
