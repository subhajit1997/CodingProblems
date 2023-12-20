package com.code.java.course.striver.A2ZDSA.Step5.Step5_1;

/**
 * learn:
 * practice:https://leetcode.com/problems/largest-odd-number-in-string/
 *
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
 *
 * A substring is a contiguous sequence of characters within a string.
 */
public class _3LargestOddNumberInAString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
    public static String largestOddNumber(String num) {
        String ans = "";
        int lastOdd = -1;
        for(int i = num.length()-1; i>=0;i--){
            char val = num.charAt(i);
            if(Integer.parseInt(Character.toString(val))%2!=0){
                lastOdd = i;
                break;
            }
        }
        if(lastOdd !=-1)
            ans = num.substring(0,lastOdd+1);
        return ans;
    }
}
