package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

/**practice: https://leetcode.com/problems/rotate-string/description/
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 *
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 *
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 *
 *
 * Example 1:
 *
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 *
 */
public class _6CheckWhetherOneStringIsARotated {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }

    //Brute Force approach O(N)
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        if(s.equals(goal))
            return true;
        //StringBuilder sb= new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            s= s.substring(1,s.length())+Character.toString(s.charAt(0));
            if(s.equals(goal))
                return true;
        }
        return false;
    }

    //Another solution without loop O(n + m), where n is the length of s , m is the length of goal.
    public boolean rotateStringOptimised(String s, String goal){
        // Check if the lengths are equal
        if(s.length()!=goal.length()){
            return false;
        }

        // Concatenate s with itself
        String str=s+s;

        // Check if str contains goal
        return str.contains(goal);

    }
}
