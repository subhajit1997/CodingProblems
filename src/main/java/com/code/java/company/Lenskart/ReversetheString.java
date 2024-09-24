package com.code.java.company.Lenskart;

/**
 * https://www.codingninjas.com/studio/problems/reverse-the-string_799927?interviewProblemRedirection=true
 *
 * Problem statement
 * You are given a string 'STR'. The string contains [a-z] [A-Z] [0-9] [special characters]. You have to find the reverse of the string.
 *
 * For example:
 *
 *  If the given string is: STR = "abcde". You have to print the string "edcba".
 * follow up:
 * Try to solve the problem in O(1) space complexity.
 */
public class ReversetheString {
    public static void main(String[] args) {
        System.out.println(reverseString("mynameis"));
    }
    public static String reverseString(String str) {
        char[] chr= str.toCharArray();
        int n = str.length();
        for(int i=0;i<n/2;i++){
            char ch = chr[i];
            chr[i] = chr[n-i-1];
            chr[n-i-1]=ch;
        }
        return String.valueOf(chr);
    }
}
