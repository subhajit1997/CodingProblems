package com.code.java.course.striver.A2ZDSA.Step7_Recursion.Step7_2;

import java.util.HashSet;
import java.util.Set;

/**
 * practice:https://www.codingninjas.com/studio/problems/more-subsequence_8842355?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 */
public class _4AllPatternsOfSubsequences {
    public static void main(String[] args) {
        System.out.println(moreSubsequence(2,2,"ab","dd"));
    }
    // Not optimal time limit exceed
    public static String moreSubsequence(int n, int m, String a, String b) {
        Set<String> distinctSubsequencesA = getDistinctSubsequences(a);
        Set<String> distinctSubsequencesB = getDistinctSubsequences(b);

        if (distinctSubsequencesA.size() >= distinctSubsequencesB.size()) {
            return a; // Return the string itself, not joined with spaces
        } else {
            return b;
        }
    }

    public static Set<String> getDistinctSubsequences(String str) {
        Set<String> result = new HashSet<>();
        getSubsequences("", str, result);
        return result;
    }
    public static void getSubsequences(String current, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(current);
            return;
        }

        // Include the first character of the remaining string
        getSubsequences(current + remaining.charAt(0), remaining.substring(1), result);

        // Exclude the first character
        getSubsequences(current, remaining.substring(1), result);
    }
}
